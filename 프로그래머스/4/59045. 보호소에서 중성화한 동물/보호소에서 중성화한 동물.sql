SELECT
    ins.ANIMAL_ID,
    ins.ANIMAL_TYPE,
    ins.NAME
FROM
    ANIMAL_INS ins
JOIN
    ANIMAL_OUTS outs ON ins.ANIMAL_ID = outs.ANIMAL_ID
WHERE (
          ins.SEX_UPON_INTAKE NOT LIKE 'Spayed%' AND
          ins.SEX_UPON_INTAKE NOT LIKE 'Neutered%'
       ) AND (
          outs.SEX_UPON_OUTCOME LIKE 'Spayed%' OR
          outs.SEX_UPON_OUTCOME LIKE 'Neutered%'
       )
ORDER BY
    ins.ANIMAL_ID;