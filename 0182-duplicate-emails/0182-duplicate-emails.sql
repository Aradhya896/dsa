# Write your MySQL query statement below
select email as Email from Person
Group By(Email)
Having count(Email)>1;