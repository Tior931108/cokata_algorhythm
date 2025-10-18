-- 코드를 입력하세요
SELECT animal_id, name, datetime
from animal_ins
-- 이름순으로 정렬하고, 
-- 같은 이름 내에서는 보호 날짜 내림차순 정렬
order by name asc, datetime desc;
