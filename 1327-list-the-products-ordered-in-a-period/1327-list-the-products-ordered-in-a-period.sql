# Write your MySQL query statement below


select p.product_name,sum(o.unit) as unit
from Products p
join Orders o 
on p.product_id=o.product_id
where  o.order_date between "2020-02-01" and "2020-02-29" group by p.product_id having sum(o.unit)>=100;


-- SELECT p.product_name,
--        SUM(o.unit) AS unit
-- FROM Products p
-- JOIN Orders o
-- ON p.product_id = o.product_id
-- WHERE o.order_date BETWEEN '2020-02-01' AND '2020-02-29'
-- GROUP BY p.product_id, p.product_name
-- HAVING SUM(o.unit) >= 100;