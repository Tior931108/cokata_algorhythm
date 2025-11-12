--  'PRICE' 컬럼의 값을 10000으로 나누고 이를 'FLOOR()' 함수를 이용해서 소수점을 제거 및 10000을 곱하여 값을 산출
--  FLOOR(값) : 소수점 값의 상관없이 내림을 진행.
SELECT FLOOR(PRICE/10000)*10000 as PRICE_GROUP , 
        count(*) as PRODUCTS
from product
group by PRICE_GROUP
order by PRICE_GROUP asc;