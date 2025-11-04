-- 코드를 입력하세요
select A.ANIMAL_ID,A.ANIMAL_TYPE, A.NAME 
from animal_ins A
Join animal_outs B
on A.animal_id=B.animal_id
-- 보호소 들어올 당시에는 중성화 되지 않았지만, 보호소 나갈 당시에는 중성화 된 동물
WHERE A.SEX_UPON_INTAKE LIKE 'INTACT%'
AND (B.SEX_UPON_OUTCOME LIKE 'SPAYED%'
OR B.SEX_UPON_OUTCOME LIKE 'NEUTERED%')
ORDER BY A.ANIMAL_ID