-- 코드를 입력하세요
SELECT product_code,
-- 매출액 (판매가 * 판매량)
    SUM(sales_amount * price) as SALES
from product p
-- 상품 ID 를 기준으로 inner join
inner join offline_sale as o on p.product_id = o.product_id
-- 상품 코드별 그룹화
group by product_code
-- 매출액을 기준으로 내림차순, 상품코드를 기준으로 오름차순
order by sales desc, product_code asc;