-- 코드를 입력하세요
SELECT A.user_id, A.nickname, SUM(B.price) as TOTAL_SALES
from USED_GOODS_USER A
join USED_GOODS_BOARD B
on A.user_id = B.writer_id
-- 중고거래 완료된 경우
where B.status = 'DONE'
-- 닉네임과 작성자ID 그룹화
group by A.nickname , B.writer_id
-- 그룹 조건 : 총 매출액 70만원 이상인 사람
having SUM(B.price) >= 700000
order by TOTAL_SALES asc;
