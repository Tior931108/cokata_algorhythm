-- 코드를 입력하세요
-- 컬럼명이 null일경우 : IFNULL(컬럼), COALESCE(컬럼)
-- 만약 Oracle이라면 NVL(컬럼)
SELECT 
animal_type, 
IFNULL(name, 'No name') as name, 
sex_upon_intake
from animal_ins
order by animal_id;