-- 코드를 입력하세요
SELECT mcdp_cd as "진료과코드",
    count(pt_no) as "5월예약건수"
from appointment
-- 2022년 5월에 예약한 사람
where year(apnt_ymd) = '2022' and month(apnt_ymd) = '05'
#방법1) WHERE APNT_YMD LIKE '2022-05%'   
#방법2) WHERE YEAR(APNT_YMD) = '2022' AND MONTH(APNT_YMD) = '05' 
#방법3) WHERE DATE_FORMAT(APNT_YMD, '%Y-%m') = '2022-05'
#방법4) WHERE LEFT(APNT_YMD, 7) = '2022-05'
group by mcdp_cd
order by 5월예약건수 asc, 진료과코드 asc;