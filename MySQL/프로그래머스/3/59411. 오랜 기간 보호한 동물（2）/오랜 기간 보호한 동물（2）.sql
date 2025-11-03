-- 코드를 입력하세요
SELECT ins.animal_id, ins.name
from animal_ins as ins
    join animal_outs as outs 
    on ins.animal_id = outs.animal_id
-- 입양일 - 보호 시작일 = 보호 기간
-- DATEDIFF(날짜 - 날짜) = 해당 기간
order by DATEDIFF(outs.datetime, ins.datetime) desc
LIMIT 2;