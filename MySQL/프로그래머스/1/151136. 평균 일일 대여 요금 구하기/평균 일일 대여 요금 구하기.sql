-- 코드를 입력하세요
-- 소수 첫번째 자리에서 반올림 ROUND()
SELECT ROUND(avg(daily_fee)) as AVERAGE_FEE
from CAR_RENTAL_COMPANY_CAR
where car_type = 'SUV';