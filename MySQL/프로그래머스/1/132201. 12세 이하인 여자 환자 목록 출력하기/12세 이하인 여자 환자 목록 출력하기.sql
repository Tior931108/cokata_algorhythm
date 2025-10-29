-- 코드를 입력하세요
SELECT pt_name, pt_no, gend_cd, age,
-- 전화 번호가 없으면 'NONE'으로 출력
    IFNULL(tlno, 'NONE') as tlno
from patient
where age <= 12 and gend_cd = 'W'
order by age desc, pt_name asc;