-- 코드를 입력하세요
SELECT 
-- 상품 카테고리 앞 2자리 
-- LEFT(product_code, 2) : product_code 컬럼 왼쪽부터 앞 2자리
-- substr(product_code, 1, 2) : product_code 컬럼 1자리~2자리
    substr(product_code, 1, 2) as category , 
-- 상품 갯수
    count(product_id)
from product
-- 카테고리 별 그룹화
group by category 
-- 카테고리 오름차순
order by category asc