# Write your MySQL query statement below
Select user_id,
    CONCAT( UPPER(LEFT(name, 1)), LOWER(SUBSTRING(name, 2)) ) AS name
    From Users
    Order by user_id; 