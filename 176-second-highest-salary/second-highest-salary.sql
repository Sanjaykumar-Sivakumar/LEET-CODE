# Write your MySQL query statement below
SELECT
(Select Distinct salary
From Employee
Order by salary desc 
Limit 1 Offset 1) as SecondHighestSalary

