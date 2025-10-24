-- 코드를 입력하세요
SELECT animal_id, name,
-- 중성화 Neutered 또는 Spayed 이면 'o' 그렇지 않으면 'x'
    CASE WHEN (SEX_UPON_INTAKE LIKE '%NEUTERED%' OR SEX_UPON_INTAKE LIKE '%SPAYED%') THEN 'O' ELSE 'X' 
    END AS '중성화'
from animal_ins
order by animal_id