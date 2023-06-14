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
