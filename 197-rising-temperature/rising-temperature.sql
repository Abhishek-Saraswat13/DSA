# Write your MySQL query statement below
select today.id from weather as today
cross join weather as yes
where datediff(today.recordDate,yes.recordDate)=1
and today.temperature > yes.temperature;