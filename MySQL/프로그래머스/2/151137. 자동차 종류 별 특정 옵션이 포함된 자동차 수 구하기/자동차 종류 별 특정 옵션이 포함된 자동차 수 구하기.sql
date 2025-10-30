-- 코드를 입력하세요
SELECT car_type, count(car_id) CARS
from car_rental_company_car
-- '통풍시트', '열선시트', '가죽시트' 중 하나 이상의 옵션이 포함
where (options like '%통풍시트%') OR (options like '%열선시트%') OR (options like '%가죽시트%')
-- 정규식 표현 "A|B|C" : A 혹은 B 혹은 C를 가진 문자열을 찾음
# WHERE  OPTIONS REGEXP '통풍시트|열선시트|가죽시트'
group by car_type
order by car_type asc;