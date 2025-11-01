-- 2022년 1월의 카테고리 별 도서 판매량을 합산하고,
-- 카테고리(CATEGORY), 총 판매량(TOTAL_SALES) 리스트 출력
SELECT A.category, sum(sales) AS total_sales
FROM book A
INNER JOIN BOOK_SALES B ON A.book_id = B.book_id
WHERE B.SALES_DATE LIKE '2022-01%'
GROUP BY A.category
ORDER BY A.category;