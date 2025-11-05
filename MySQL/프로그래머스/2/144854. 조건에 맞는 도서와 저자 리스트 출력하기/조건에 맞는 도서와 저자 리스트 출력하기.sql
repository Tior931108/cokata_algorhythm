-- 코드를 입력하세요
SELECT A.book_id, B.author_name, 
-- 날짜 포맷이 문제 예시와 동일해야 정답처리 주의!!
    DATE_FORMAT(A.published_date, '%Y-%m-%d') as published_date 
from book A
LEFT JOIN author b on A.author_id = B.author_id
where A.category = "경제"
order by A.published_date asc;