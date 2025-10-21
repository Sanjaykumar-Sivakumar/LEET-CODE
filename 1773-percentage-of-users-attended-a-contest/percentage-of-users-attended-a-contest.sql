# Write your MySQL query statement below
Select r.contest_id, Round(Count(r.user_id) * 100.0 /(Select Count(*) from Users),2) As percentage
From Register as r
Group by r.contest_id
Order by percentage desc , r.contest_id asc;
