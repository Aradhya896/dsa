# Write your MySQL query statement below
SELECT query_name, ROUND(AVG(ratio),2) AS quality,
ROUND((SUM(QualityBinary)/COUNT(*))*100 , 2) AS poor_query_percentage
FROM(SELECT query_name, rating/position as ratio,
CASE WHEN rating <3 THEN 1
ELSE 0 END AS QualityBinary
FROM queries) AS temp
GROUP BY query_name;