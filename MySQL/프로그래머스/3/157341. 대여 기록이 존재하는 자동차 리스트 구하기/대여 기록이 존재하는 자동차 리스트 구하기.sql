-- 코드를 입력하세요
-- 자동차 ID 중복 제거
SELECT DISTINCT(A.car_id)
from CAR_RENTAL_COMPANY_CAR as A
left join CAR_RENTAL_COMPANY_RENTAL_HISTORY as B
on A.car_id = B.car_id
-- 자동차 종류가 세단이면서 대여 시작월이 10월인 경우
where A.CAR_TYPE = '세단' and MONTH(B.START_DATE) = 10
order by A.car_id desc;