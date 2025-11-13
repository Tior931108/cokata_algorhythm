-- 코드를 입력하세요
SELECT MEMBER_ID, MEMBER_NAME, GENDER, DATE_FORMAT(DATE_OF_BIRTH, '%Y-%m-%d') as DATE_OF_BIRTH
from MEMBER_PROFILE
-- 생일이 3월이며 여성회원이고 전화번호가 있는 사람만 조회
where (MONTH(DATE_OF_BIRTH) = 3) AND GENDER = 'W' AND TLNO IS NOT NULL
order by  MEMBER_ID asc;