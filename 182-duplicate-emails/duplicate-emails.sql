# Write your MySQL query statement below
SELECT email from Person
Group By email 
Having Count(email)>1;