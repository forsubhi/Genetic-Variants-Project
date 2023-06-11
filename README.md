```
A- Chromosome and Type:

SELECT * FROM "Variants" WHERE "Chromosome" = 1 AND "Type" = 'SNP';
SELECT * FROM "Variants" WHERE "Chromosome" = 2 AND "Type" = 'INV';
SELECT * FROM "Variants" WHERE "Chromosome" = 3 AND "Type" = 'INS';
SELECT * FROM "Variants" WHERE "Chromosome" = 4 AND "Type" = 'INDEL';
SELECT * FROM "Variants" WHERE "Chromosome" = 5 AND "Type" = 'CN';
SELECT * FROM "Variants" WHERE "Chromosome" = 6 AND "Type" = 'DEL';
SELECT * FROM "Variants" WHERE "Chromosome" = 7 AND "Type" = 'SNP';
SELECT * FROM "Variants" WHERE "Chromosome" = 8 AND "Type" = 'INV';
SELECT * FROM "Variants" WHERE "Chromosome" = 9 AND "Type" = 'INS';
SELECT * FROM "Variants" WHERE "Chromosome" = 10 AND "Type" = 'INDEL';
SELECT * FROM "Variants" WHERE "Chromosome" = 11 AND "Type" = 'CN';
SELECT * FROM "Variants" WHERE "Chromosome" = 12 AND "Type" = 'DEL';
SELECT * FROM "Variants" WHERE "Chromosome" = 13 AND "Type" = 'SNP';
SELECT * FROM "Variants" WHERE "Chromosome" = 14 AND "Type" = 'INV';
SELECT * FROM "Variants" WHERE "Chromosome" = 15 AND "Type" = 'INS';
SELECT * FROM "Variants" WHERE "Chromosome" = 16 AND "Type" = 'INDEL';
SELECT * FROM "Variants" WHERE "Chromosome" = 17 AND "Type" = 'CN';
SELECT * FROM "Variants" WHERE "Chromosome" = 18 AND "Type" = 'DEL';
SELECT * FROM "Variants" WHERE "Chromosome" = 19 AND "Type" = 'SNP';
SELECT * FROM "Variants" WHERE "Chromosome" = 20 AND "Type" = 'INV';

B- Chromosome, Type and GeneName:

SELECT * FROM "Variants" WHERE "Chromosome" = 1 AND "Type" = 'SNP' AND "GeneName" LIKE '%RRC%';
SELECT * FROM "Variants" WHERE "Chromosome" = 2 AND "Type" = 'INV' AND "GeneName" LIKE '%NF%';
SELECT * FROM "Variants" WHERE "Chromosome" = 3 AND "Type" = 'INS' AND "GeneName" LIKE '%CAN%';
SELECT * FROM "Variants" WHERE "Chromosome" = 4 AND "Type" = 'INDEL' AND "GeneName" LIKE '%OR1%';
SELECT * FROM "Variants" WHERE "Chromosome" = 5 AND "Type" = 'CN' AND "GeneName" LIKE '%PKN2%';
SELECT * FROM "Variants" WHERE "Chromosome" = 6 AND "Type" = 'DEL' AND "GeneName" LIKE '%PAFAH%';
SELECT * FROM "Variants" WHERE "Chromosome" = 7 AND "Type" = 'SNP' AND "GeneName" LIKE '%RRC%';
SELECT * FROM "Variants" WHERE "Chromosome" = 8 AND "Type" = 'INV' AND "GeneName" LIKE '%NF%';
SELECT * FROM "Variants" WHERE "Chromosome" = 9 AND "Type" = 'INS' AND "GeneName" LIKE '%CAN%';
SELECT * FROM "Variants" WHERE "Chromosome" = 10 AND "Type" = 'INDEL' AND "GeneName" LIKE '%OR1%';
SELECT * FROM "Variants" WHERE "Chromosome" = 11 AND "Type" = 'CN' AND "GeneName" LIKE '%PKN2%';
SELECT * FROM "Variants" WHERE "Chromosome" = 12 AND "Type" = 'DEL' AND "GeneName" LIKE '%PAFAH%';
SELECT * FROM "Variants" WHERE "Chromosome" = 13 AND "Type" = 'SNP' AND "GeneName" LIKE '%RRC%';
SELECT * FROM "Variants" WHERE "Chromosome" = 14 AND "Type" = 'INV' AND "GeneName" LIKE '%NF%';
SELECT * FROM "Variants" WHERE "Chromosome" = 15 AND "Type" = 'INS' AND "GeneName" LIKE '%CAN%';
SELECT * FROM "Variants" WHERE "Chromosome" = 16 AND "Type" = 'INDEL' AND "GeneName" LIKE '%OR1%';
SELECT * FROM "Variants" WHERE "Chromosome" = 17 AND "Type" = 'CN' AND "GeneName" LIKE '%PKN2%';
SELECT * FROM "Variants" WHERE "Chromosome" = 18 AND "Type" = 'DEL' AND "GeneName" LIKE '%PAFAH%';
SELECT * FROM "Variants" WHERE "Chromosome" = 19 AND "Type" = 'SNP' AND "GeneName" LIKE '%RRC%';
SELECT * FROM "Variants" WHERE "Chromosome" = 20 AND "Type" = 'INV' AND "GeneName" LIKE '%NF%';


C- Chromosome, Type, GeneName with PosStart and PosEnd:

SELECT * FROM "Variants" WHERE "Chromosome" = 1 AND "Type" = 'SNP' AND "GeneName" LIKE '%RRC%' AND "PositionStart" >= 1000 AND "PositionStart" <= 2000000;
SELECT * FROM "Variants" WHERE "Chromosome" = 2 AND "Type" = 'INV' AND "GeneName" LIKE '%NF%' AND "PositionStart" >= 1000 AND "PositionStart" <= 20000000;
SELECT * FROM "Variants" WHERE "Chromosome" = 3 AND "Type" = 'INS' AND "GeneName" LIKE '%CAN%' AND "PositionStart" >= 1000 AND "PositionStart" <= 2000000;
SELECT * FROM "Variants" WHERE "Chromosome" = 4 AND "Type" = 'INDEL' AND "GeneName" LIKE '%OR1%' AND "PositionStart" >= 1000 AND "PositionStart" <= 2000000;
SELECT * FROM "Variants" WHERE "Chromosome" = 5 AND "Type" = 'CN' AND "GeneName" LIKE '%PKN2%' AND "PositionStart" >= 1000 AND "PositionStart" <= 2000000;
SELECT * FROM "Variants" WHERE "Chromosome" = 6 AND "Type" = 'DEL' AND "GeneName" LIKE '%PAFAH%' AND "PositionStart" >= 1000 AND "PositionStart" <= 20000000;
SELECT * FROM "Variants" WHERE "Chromosome" = 7 AND "Type" = 'SNP' AND "GeneName" LIKE '%RRC%' AND "PositionStart" >= 1000 AND "PositionStart" <= 2000000;
SELECT * FROM "Variants" WHERE "Chromosome" = 8 AND "Type" = 'INV' AND "GeneName" LIKE '%NF%' AND "PositionStart" >= 1000 AND "PositionStart" <= 2000000;
SELECT * FROM "Variants" WHERE "Chromosome" = 9 AND "Type" = 'INS' AND "GeneName" LIKE '%CAN%' AND "PositionStart" >= 1000 AND "PositionStart" <= 2000000;
SELECT * FROM "Variants" WHERE "Chromosome" = 10 AND "Type" = 'INDEL' AND "GeneName" LIKE '%OR1%' AND "PositionStart" >= 1000 AND "PositionStart" <= 20000000;
SELECT * FROM "Variants" WHERE "Chromosome" = 11 AND "Type" = 'CN' AND "GeneName" LIKE '%PKN2%' AND "PositionStart" >= 1000 AND "PositionStart" <= 2000000;
SELECT * FROM "Variants" WHERE "Chromosome" = 12 AND "Type" = 'DEL' AND "GeneName" LIKE '%PAFAH%' AND "PositionStart" >= 1000 AND "PositionStart" <= 2000000;
SELECT * FROM "Variants" WHERE "Chromosome" = 13 AND "Type" = 'SNP' AND "GeneName" LIKE '%RRC%' AND "PositionStart" >= 1000 AND "PositionStart" <= 20000000;
SELECT * FROM "Variants" WHERE "Chromosome" = 14 AND "Type" = 'INV' AND "GeneName" LIKE '%NF%' AND "PositionStart" >= 10000 AND "PositionStart" <= 20000000;
SELECT * FROM "Variants" WHERE "Chromosome" = 15 AND "Type" = 'INS' AND "GeneName" LIKE '%CAN%' AND "PositionStart" >= 1000 AND "PositionStart" <= 2000000;
SELECT * FROM "Variants" WHERE "Chromosome" = 16 AND "Type" = 'INDEL' AND "GeneName" LIKE '%OR1%' AND "PositionStart" >= 1000 AND "PositionStart" <= 2000000;
SELECT * FROM "Variants" WHERE "Chromosome" = 17 AND "Type" = 'CN' AND "GeneName" LIKE '%PKN2%' AND "PositionStart" >= 1000 AND "PositionStart" <= 20000000;
SELECT * FROM "Variants" WHERE "Chromosome" = 18 AND "Type" = 'DEL' AND "GeneName" LIKE '%PAFAH%' AND "PositionStart" >= 100000 AND "PositionStart" <= 20000000;
SELECT * FROM "Variants" WHERE "Chromosome" = 19 AND "Type" = 'SNP' AND "GeneName" LIKE '%RRC%' AND "PositionStart" >= 1000 AND "PositionStart" <= 2000000;
SELECT * FROM "Variants" WHERE "Chromosome" = 20 AND "Type" = 'INV' AND "GeneName" LIKE '%NF%' AND "PositionStart" >= 1000 AND "PositionStart" <= 2000000;

C- Chromosome, Type, GeneName with PosStart and PosEnd and Clinical Significance:

SELECT * FROM "Variants" WHERE "Chromosome" = 1 AND "Type" = 'SNP' AND "GeneName" LIKE '%RRC%' AND "PositionStart" >= 1000 AND "PositionStart" <= 2000000 AND "ClinicalSignificance" like '%Benign%';
SELECT * FROM "Variants" WHERE "Chromosome" = 2 AND "Type" = 'INV' AND "GeneName" LIKE '%NF%' AND "PositionStart" >= 1000 AND "PositionStart" <= 20000000 AND "ClinicalSignificance" like '%Pathogenic%';
SELECT * FROM "Variants" WHERE "Chromosome" = 3 AND "Type" = 'INS' AND "GeneName" LIKE '%CAN%' AND "PositionStart" >= 1000 AND "PositionStart" <= 2000000 AND "ClinicalSignificance" like '%Likely_benign%';
SELECT * FROM "Variants" WHERE "Chromosome" = 4 AND "Type" = 'INDEL' AND "GeneName" LIKE '%OR1%' AND "PositionStart" >= 1000 AND "PositionStart" <= 2000000 AND "ClinicalSignificance" like '%Pathogenic%';
SELECT * FROM "Variants" WHERE "Chromosome" = 5 AND "Type" = 'CN' AND "GeneName" LIKE '%PKN2%' AND "PositionStart" >= 1000 AND "PositionStart" <= 2000000 AND "ClinicalSignificance" like '%Benign%';
SELECT * FROM "Variants" WHERE "Chromosome" = 6 AND "Type" = 'DEL' AND "GeneName" LIKE '%PAFAH%' AND "PositionStart" >= 1000 AND "PositionStart" <= 20000000 AND "ClinicalSignificance" like '%Pathogenic%';
SELECT * FROM "Variants" WHERE "Chromosome" = 7 AND "Type" = 'SNP' AND "GeneName" LIKE '%RRC%' AND "PositionStart" >= 1000 AND "PositionStart" <= 2000000 AND "ClinicalSignificance" like '%Likely_benign%';
SELECT * FROM "Variants" WHERE "Chromosome" = 8 AND "Type" = 'INV' AND "GeneName" LIKE '%NF%' AND "PositionStart" >= 1000 AND "PositionStart" <= 2000000 AND "ClinicalSignificance" like '%Pathogenic%';
SELECT * FROM "Variants" WHERE "Chromosome" = 9 AND "Type" = 'INS' AND "GeneName" LIKE '%CAN%' AND "PositionStart" >= 1000 AND "PositionStart" <= 2000000 AND "ClinicalSignificance" like '%Benign%';
SELECT * FROM "Variants" WHERE "Chromosome" = 10 AND "Type" = 'INDEL' AND "GeneName" LIKE '%OR1%' AND "PositionStart" >= 1000 AND "PositionStart" <= 20000000 AND "ClinicalSignificance" like '%Pathogenic%';
SELECT * FROM "Variants" WHERE "Chromosome" = 11 AND "Type" = 'CN' AND "GeneName" LIKE '%PKN2%' AND "PositionStart" >= 1000 AND "PositionStart" <= 2000000 AND "ClinicalSignificance" like '%Likely_benign%';
SELECT * FROM "Variants" WHERE "Chromosome" = 12 AND "Type" = 'DEL' AND "GeneName" LIKE '%PAFAH%' AND "PositionStart" >= 1000 AND "PositionStart" <= 2000000 AND "ClinicalSignificance" like '%Pathogenic%';
SELECT * FROM "Variants" WHERE "Chromosome" = 13 AND "Type" = 'SNP' AND "GeneName" LIKE '%RRC%' AND "PositionStart" >= 1000 AND "PositionStart" <= 20000000 AND "ClinicalSignificance" like '%Benign%';
SELECT * FROM "Variants" WHERE "Chromosome" = 14 AND "Type" = 'INV' AND "GeneName" LIKE '%NF%' AND "PositionStart" >= 10000 AND "PositionStart" <= 20000000 AND "ClinicalSignificance" like '%Pathogenic%';
SELECT * FROM "Variants" WHERE "Chromosome" = 15 AND "Type" = 'INS' AND "GeneName" LIKE '%CAN%' AND "PositionStart" >= 1000 AND "PositionStart" <= 2000000 AND "ClinicalSignificance" like '%Likely_benign%';
SELECT * FROM "Variants" WHERE "Chromosome" = 16 AND "Type" = 'INDEL' AND "GeneName" LIKE '%OR1%' AND "PositionStart" >= 1000 AND "PositionStart" <= 2000000 AND "ClinicalSignificance" like '%Pathogenic%';
SELECT * FROM "Variants" WHERE "Chromosome" = 17 AND "Type" = 'CN' AND "GeneName" LIKE '%PKN2%' AND "PositionStart" >= 1000 AND "PositionStart" <= 20000000 AND "ClinicalSignificance" like '%Benign%';
SELECT * FROM "Variants" WHERE "Chromosome" = 18 AND "Type" = 'DEL' AND "GeneName" LIKE '%PAFAH%' AND "PositionStart" >= 100000 AND "PositionStart" <= 20000000 AND "ClinicalSignificance" like '%Pathogenic%';
SELECT * FROM "Variants" WHERE "Chromosome" = 19 AND "Type" = 'SNP' AND "GeneName" LIKE '%RRC%' AND "PositionStart" >= 1000 AND "PositionStart" <= 2000000 AND "ClinicalSignificance" like '%Likely_benign%';
SELECT * FROM "Variants" WHERE "Chromosome" = 20 AND "Type" = 'INV' AND "GeneName" LIKE '%NF%' AND "PositionStart" >= 1000 AND "PositionStart" <= 2000000 AND "ClinicalSignificance" like '%Pathogenic%';
```

Group A base results:
```
1681
723
690
784
692
689
1730
725
691
777
688
687
1298
718
692
720
690
692
1671
691
average= 886 min= 687.0 max= 1730.0 median= 705.0
```
