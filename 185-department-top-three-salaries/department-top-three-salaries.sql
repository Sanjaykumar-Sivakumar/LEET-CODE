# Write your MySQL query statement below
Select d.name Department ,e.name Employee,e.salary Salary
from Department as d, Employee AS e
where e.departmentId = d.id and
(select count(distinct salary) from Employee
Where salary>e.salary and departmentId = e.departmentId) <3
Order by d.name, e.salary desc;