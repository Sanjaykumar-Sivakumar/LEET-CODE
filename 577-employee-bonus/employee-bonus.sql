# Write your MySQL query statement below
Select Employee.name,Bonus.bonus from Employee
Left join Bonus using (empId)
Where IFNULL(Bonus.bonus,0)<1000;