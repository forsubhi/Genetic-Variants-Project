```
A- Chromosome and Type:

SELECT * FROM "Variants" WHERE "Chromosome" = 1 AND "Chromosome" = 'SNP';
SELECT * FROM "Variants" WHERE "Chromosome" = 2 AND "Chromosome" = 'INV';
SELECT * FROM "Variants" WHERE "Chromosome" = 3 AND "Chromosome" = 'INS';
SELECT * FROM "Variants" WHERE "Chromosome" = 4 AND "Chromosome" = 'INDEL';
SELECT * FROM "Variants" WHERE "Chromosome" = 5 AND "Chromosome" = 'CN';
SELECT * FROM "Variants" WHERE "Chromosome" = 6 AND "Chromosome" = 'DEL';
SELECT * FROM "Variants" WHERE "Chromosome" = 7 AND "Chromosome" = 'SNP';
SELECT * FROM "Variants" WHERE "Chromosome" = 8 AND "Chromosome" = 'INV';
SELECT * FROM "Variants" WHERE "Chromosome" = 9 AND "Chromosome" = 'INS';
SELECT * FROM "Variants" WHERE "Chromosome" = 10 AND "Chromosome" = 'INDEL';
SELECT * FROM "Variants" WHERE "Chromosome" = 11 AND "Chromosome" = 'CN';
SELECT * FROM "Variants" WHERE "Chromosome" = 12 AND "Chromosome" = 'DEL';
SELECT * FROM "Variants" WHERE "Chromosome" = 13 AND "Chromosome" = 'SNP';
SELECT * FROM "Variants" WHERE "Chromosome" = 14 AND "Chromosome" = 'INV';
SELECT * FROM "Variants" WHERE "Chromosome" = 15 AND "Chromosome" = 'INS';
SELECT * FROM "Variants" WHERE "Chromosome" = 16 AND "Chromosome" = 'INDEL';
SELECT * FROM "Variants" WHERE "Chromosome" = 17 AND "Chromosome" = 'CN';
SELECT * FROM "Variants" WHERE "Chromosome" = 18 AND "Chromosome" = 'DEL';
SELECT * FROM "Variants" WHERE "Chromosome" = 19 AND "Chromosome" = 'SNP';
SELECT * FROM "Variants" WHERE "Chromosome" = 20 AND "Chromosome" = 'INV';

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
