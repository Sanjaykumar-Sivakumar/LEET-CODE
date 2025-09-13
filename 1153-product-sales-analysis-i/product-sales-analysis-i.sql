# Write your MySQL query statement below
Select Pro.product_name, s.year,s.price
From Sales as s
Left Join Product as Pro
On s.product_id = Pro.product_id;