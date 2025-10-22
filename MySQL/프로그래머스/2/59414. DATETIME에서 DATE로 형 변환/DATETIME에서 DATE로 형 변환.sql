-- 코드를 입력하세요
SELECT animal_id, name,
-- substr(조회할 컬럼, 시작 위치, 글자 수)
    substr(datetime, 1, 10) as "날짜"
from animal_ins