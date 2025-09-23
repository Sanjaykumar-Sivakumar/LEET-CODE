# Write your MySQL query statement below
Select s.student_id,s.student_name,u.subject_name,ifnull(count(e.student_id),0) as attended_exams
from Students s cross join Subjects u 
Left join Examinations e
On e.student_id = s.student_id and e.subject_name = u.subject_name
group by s.student_id,s.student_name,u.subject_name
Order by s.student_id, u.subject_name;