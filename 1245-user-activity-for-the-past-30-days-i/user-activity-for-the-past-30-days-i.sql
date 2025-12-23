# Write your MySQL query statement below
Select activity_date as day , Count(Distinct user_id) as active_users 
from Activity
Where activity_date Between '2019-06-28' AND '2019-07-27'
Group by activity_date;

