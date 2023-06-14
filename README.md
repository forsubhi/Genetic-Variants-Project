```
EXPLAIN analyze  SELECT * FROM "variants" WHERE "chromosome" = 1 AND "type" = 'SNP';
```
```
QUERY PLAN                                                                                                                        |
----------------------------------------------------------------------------------------------------------------------------------+
Gather  (cost=1000.00..293832.61 rows=559457 width=107) (actual time=5.473..898.806 rows=560412 loops=1)                          |
  Workers Planned: 2                                                                                                              |
  Workers Launched: 2                                                                                                             |
  ->  Parallel Seq Scan on variants  (cost=0.00..236886.91 rows=233107 width=107) (actual time=4.868..751.147 rows=186804 loops=3)|
        Filter: ((chromosome = 1) AND (type = 'SNP'::text))                                                                       |
        Rows Removed by Filter: 4156312                                                                                           |
Planning Time: 0.098 ms                                                                                                           |
JIT:                                                                                                                              |
  Functions: 6                                                                                                                    |
  Options: Inlining false, Optimization false, Expressions true, Deforming true                                                   |
  Timing: Generation 1.336 ms, Inlining 0.000 ms, Optimization 0.857 ms, Emission 13.645 ms, Total 15.839 ms                      |
Execution Time: 917.759 ms                                                                                                        |
```

Add index:
```
CREATE INDEX variants_chromosome_idx ON public.variants (chromosome);
```

```
EXPLAIN analyze  SELECT * FROM "variants" WHERE "chromosome" = 1 AND "type" = 'SNP';
```
```
QUERY PLAN                                                                                                                                        |
--------------------------------------------------------------------------------------------------------------------------------------------------+
Index Scan using variants_chromosome_idx on variants  (cost=0.43..22486.67 rows=558960 width=107) (actual time=0.044..166.635 rows=560412 loops=1)|
  Index Cond: (chromosome = 1)                                                                                                                    |
  Filter: (type = 'SNP'::text)                                                                                                                    |
  Rows Removed by Filter: 77080                                                                                                                   |
Planning Time: 0.152 ms                                                                                                                           |
Execution Time: 187.262 ms                                                                                                                        |
```
```
CREATE INDEX variants_type_idx ON public.variants ("type");
```

```
CREATE EXTENSION pg_trgm;
SELECT oid, extname, extversion FROM pg_extension;
CREATE INDEX idx_gin ON public.variants  using  gin (gene_name gin_trgm_ops);
```
```
QUERY PLAN                                                                                                                                         |
---------------------------------------------------------------------------------------------------------------------------------------------------+
Bitmap Heap Scan on variants  (cost=7207.20..12501.33 rows=1251 width=107) (actual time=64.254..66.749 rows=5187 loops=1)                          |
  Recheck Cond: ((gene_name ~~ '%RRC%'::text) AND (chromosome = 1))                                                                                |
  Filter: (type = 'SNP'::text)                                                                                                                     |
  Rows Removed by Filter: 673                                                                                                                      |
  Heap Blocks: exact=80                                                                                                                            |
  ->  BitmapAnd  (cost=7207.20..7207.20 rows=1425 width=0) (actual time=64.212..64.213 rows=0 loops=1)                                             |
        ->  Bitmap Index Scan on idx_gin  (cost=0.00..274.63 rows=29151 width=0) (actual time=26.463..26.463 rows=124242 loops=1)                  |
              Index Cond: (gene_name ~~ '%RRC%'::text)                                                                                             |
        ->  Bitmap Index Scan on variants_chromosome_idx  (cost=0.00..6931.69 rows=636701 width=0) (actual time=37.428..37.428 rows=637492 loops=1)|
              Index Cond: (chromosome = 1)                                                                                                         |
Planning Time: 0.277 ms                                                                                                                            |
Execution Time: 67.084 ms                                                                                                                          |
```

