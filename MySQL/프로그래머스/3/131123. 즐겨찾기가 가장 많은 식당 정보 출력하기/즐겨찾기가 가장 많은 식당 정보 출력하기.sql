-- 코드를 입력하세요
SELECT FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
from rest_info
-- group by 를 통해 음식 종류별 좋아요가 많은 식당과 가장 좋아요가 많은 식당과 일치하는 식당 조회
where FAVORITES IN (
    -- 서브쿼리 사용하여 음식종류별로 가장 좋아요수가 많은 식당 조회
    select MAX(FAVORITES)
    from rest_info
    group by FOOD_TYPE
)
group by FOOD_TYPE
order by FOOD_TYPE desc;
