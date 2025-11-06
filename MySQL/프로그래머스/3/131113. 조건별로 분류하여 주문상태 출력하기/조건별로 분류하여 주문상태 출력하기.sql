-- 코드를 입력하세요
-- CASE 문 사용 OUT_DATE가 '2022-05-01'보다 작거나 같으면 '출고완료', 더 크면 '출고대기'로 표시
SELECT order_id, product_id, date_format(out_Date, '%Y-%m-%d') as out_date,
    CASE
        WHEN out_Date <= '2022-05-01' THEN '출고완료'
        WHEN out_Date > '2022-05-01' THEN '출고대기'
        ELSE '출고미정'
    END as '출고여부'
from food_order
order by order_id asc;