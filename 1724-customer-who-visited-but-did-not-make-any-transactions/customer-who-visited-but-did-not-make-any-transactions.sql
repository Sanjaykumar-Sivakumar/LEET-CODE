# Write your MySQL query statement below
Select v.customer_id,COUNT(v.visit_id) As count_no_trans
from Visits v
Left Join Transactions t
On t.visit_id = v.visit_id
Where t.transaction_id IS null
Group By v.customer_id;