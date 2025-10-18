-- 코드를 입력하세요
-- MYSQL 은 대소문자를 구분하지 않으나,
-- 다른 SQL은 대소문자를 구분함 [POSTSQL, Oracle 등등]
-- 타 SQL문제에 대소문자 구분하지 말라고 제시되었으면
-- UPPER(컬럼)이나 LOWER(컬럼)을 적용해야함
-- ex) UPPER(name) or LOWER(name)
SELECT animal_id, name
from animal_ins
where UPPER(name) like '%EL%' and animal_type = 'Dog' 
order by name asc;
