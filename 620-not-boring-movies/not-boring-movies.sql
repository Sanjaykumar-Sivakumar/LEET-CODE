# Write your MySQL query statement below
SELECT * FROM Cinema
Where Description!= 'Boring'
AND MOD(id,2) = 1
Order By rating desc;