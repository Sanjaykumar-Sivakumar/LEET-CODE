# Write your MySQL query statement below
Select uni.unique_id,emp.name
From Employees as emp
LEFT JOIN EmployeeUNI as uni
ON emp.id = uni.id;


