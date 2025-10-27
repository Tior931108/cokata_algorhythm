-- 코드를 입력하세요
SELECT HOUR(datetime) as HOUR, count(datetime) as count
from animal_outs
-- 입양 시각 별로 그룹화
group by HOUR(datetime)
-- 입양 시각이 09~19시조건
having HOUR >= 9 and HOUR <= 19
-- 시간순 오름차순
order by HOUR asc

# SELECT HOUR(DATETIME) HOUR, COUNT(DATETIME) COUNT
# FROM ANIMAL_OUTS
# WHERE HOUR(DATETIME) >= 9 AND HOUR(DATETIME) <= 19
# GROUP BY HOUR(DATETIME)