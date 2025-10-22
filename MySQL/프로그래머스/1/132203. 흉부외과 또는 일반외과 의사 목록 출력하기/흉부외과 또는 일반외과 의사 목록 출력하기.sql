-- 코드를 입력하세요
SELECT dr_name, dr_id, mcdp_cd, 
-- 날짜 포맷 %y : 2020중 끝 두자리 20만 표시, %Y : 2020 표시
    DATE_FORMAT(hire_ymd, '%Y-%m-%d') as "hire_ymd"
from doctor
where  mcdp_cd = "CS" or  mcdp_cd = "GS"
-- 고용일자를 기준으로 내림차순, 고용일자가 같다면 이름을 기준으로 오름차순
order by hire_ymd desc, dr_name asc;