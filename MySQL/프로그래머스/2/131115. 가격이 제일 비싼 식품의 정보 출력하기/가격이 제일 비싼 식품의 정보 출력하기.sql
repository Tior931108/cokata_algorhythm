-- 코드를 입력하세요
SELECT product_id, product_name, product_cd, category, price
from food_product
where price = (
    select MAX(price)
    from food_product
);

-- 다른 풀이 (order by, LIMIT 사용)
# select *
# from food_product
# order by price desc
# LIMIT 1;