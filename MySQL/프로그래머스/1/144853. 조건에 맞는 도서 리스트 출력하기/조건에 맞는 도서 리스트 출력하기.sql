-- 코드를 입력하세요
SELECT book_id, DATE_FORMAT(published_date, '%Y-%m-%d') as published_date
from book
-- 카테고리가 인문 이면서 년도가 2021년도
where category like '인문' and DATE_FORMAT(published_date, '%Y') = '2021' 
order by published_date asc;