The dataset that is used for tests:

https://www.kaggle.com/datasets/carrie1/ecommerce-data

https://github.com/brettwooldridge/HikariCP/wiki/About-Pool-Sizing#connections--core_count--2--effective_spindle_count

We can check the Query plan of Postgres using Explain command like the following example:

Search for product Query:
````
EXPLAIN analyze  select  * from product p where details  like '%solid cotton blend collar%'
````

````
QUERY PLAN                                                                                             |
-------------------------------------------------------------------------------------------------------+
Seq Scan on product p  (cost=0.00..1588.47 rows=3 width=126) (actual time=0.763..38.480 rows=9 loops=1)|
  Filter: ((details)::text ~~ '%solid cotton blend collar%'::text)                                     |
  Rows Removed by Filter: 30749                                                                        |
Planning Time: 0.261 ms                                                                                |
Execution Time: 38.511 ms                                                                              |
````

For enhancing the performance of Postgres like statement we should enable pg_trgm extension:
````
CREATE EXTENSION pg_trgm;
SELECT oid, extname, extversion FROM pg_extension;
````

After adding index:
````
CREATE INDEX idx_gin ON public.product  using  gin (details gin_trgm_ops);
````

````
QUERY PLAN                                                                                                       |
-----------------------------------------------------------------------------------------------------------------+
Bitmap Heap Scan on product p  (cost=172.02..183.61 rows=3 width=126) (actual time=6.049..6.115 rows=9 loops=1)  |
  Recheck Cond: ((details)::text ~~ '%solid cotton blend collar%'::text)                                         |
  Rows Removed by Index Recheck: 17                                                                              |
  Heap Blocks: exact=25                                                                                          |
  ->  Bitmap Index Scan on idx_gin  (cost=0.00..172.02 rows=3 width=0) (actual time=6.027..6.028 rows=26 loops=1)|
        Index Cond: ((details)::text ~~ '%solid cotton blend collar%'::text)                                     |
Planning Time: 0.665 ms                                                                                          |
Execution Time: 6.317 ms                                                                                         |                                                                          |
````

Search for customer invoice details Query:

``` sql
EXPLAIN analyze SELECT  * from invoice_detail where customerid ='18074' 
```

````
QUERY PLAN                                                                                                                     |
-------------------------------------------------------------------------------------------------------------------------------+
Gather  (cost=1000.00..21801.44 rows=90 width=95) (actual time=9.445..300.121 rows=13 loops=1)                                 |
  Workers Planned: 2                                                                                                           |
  Workers Launched: 2                                                                                                          |
  ->  Parallel Seq Scan on invoice_detail  (cost=0.00..20792.44 rows=38 width=95) (actual time=189.326..281.729 rows=4 loops=3)|
        Filter: (customerid = 18074)                                                                                           |
        Rows Removed by Filter: 180632                                                                                         |
Planning Time: 0.128 ms                                                                                                        |
Execution Time: 300.164 ms                                                                                                     |                                           |
````
After adding index:

````
CREATE INDEX invoice_detail_customerid_idx ON public.invoice_detail (customerid);
````

````
QUERY PLAN                                                                                                                            |
--------------------------------------------------------------------------------------------------------------------------------------+
Bitmap Heap Scan on invoice_detail  (cost=5.12..347.14 rows=90 width=95) (actual time=0.113..0.118 rows=13 loops=1)                   |
  Recheck Cond: (customerid = 18074)                                                                                                  |
  Heap Blocks: exact=1                                                                                                                |
  ->  Bitmap Index Scan on invoice_detail_customerid_idx  (cost=0.00..5.10 rows=90 width=0) (actual time=0.074..0.074 rows=13 loops=1)|
        Index Cond: (customerid = 18074)                                                                                              |
Planning Time: 0.311 ms                                                                                                               |
Execution Time: 0.157 ms                                                                                                              |
````




