-- 코드를 입력하세요
SELECT A.name, A.datetime
from animal_ins A
-- 동물보호소에 들어온 동물 테이블에 입양을 보낸 동물 테이블을 LEFT JOIN 한 후에 입양을 보낸 날짜가 NULL인 행인 조건
    LEFT JOIN animal_outs B
    on A.animal_id = B.animal_id
where B.datetime is NULL
order by a.datetime asc
LIMIT 3;

-- NOT EXISTS 사용
# SELECT NAME, DATETIME FROM ANIMAL_INS A
# WHERE NOT EXISTS (SELECT ANIMAL_ID FROM ANIMAL_OUTS B WHERE A.ANIMAL_ID = B.ANIMAL_ID)
# ORDER BY DATETIME
# LIMIT 3;

-- NOT IN 사용
# SELECT NAME, DATETIME
# FROM ANIMAL_INS
# WHERE ANIMAL_ID NOT IN (SELECT ANIMAL_ID
#                         FROM ANIMAL_OUTS)
# ORDER BY DATETIME
# LIMIT 3;

