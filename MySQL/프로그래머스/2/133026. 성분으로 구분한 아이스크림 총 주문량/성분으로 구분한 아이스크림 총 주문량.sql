select B.ingredient_type, SUM(A.total_order) as TOTAL_ORDER
from first_half A
LEFT JOIN icecream_info B
on A.flavor = B.flavor
group by B.ingredient_type
order by A.total_order asc;