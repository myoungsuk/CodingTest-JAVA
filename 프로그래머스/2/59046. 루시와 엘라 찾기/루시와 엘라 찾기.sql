SELECT 
    ANIMAL_INS.ANIMAL_ID,
    ANIMAL_INS.NAME,
    ANIMAL_INS.SEX_UPON_INTAKE
from
    ANIMAL_INS
WHERE
    NAME IN ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')
ORDER BY
    ANIMAL_ID;