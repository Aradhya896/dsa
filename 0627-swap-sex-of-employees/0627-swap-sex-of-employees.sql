# Write your MySQL query statement below
update Salary
Set sex = Case
  when sex='m' then 'f'
   else 'm'
end;