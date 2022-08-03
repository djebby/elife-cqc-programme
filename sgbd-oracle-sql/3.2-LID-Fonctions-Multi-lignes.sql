-- PARTIE 3-2 : LID - Fonctions Multi ligne

-- 1
SELECT MIN(salary), MAX(salary)
FROM EMPLOYEES;

-- 2
SELECT ROUND(AVG(salary), 2), department_id
FROM EMPLOYEES
GROUP BY department_id;

-- 3
SELECT COUNT(*) AS "nbr employees", DEPARTMENT_ID 
FROM EMPLOYEES 
GROUP BY DEPARTMENT_ID;

-- 4
SELECT DEPARTMENT_ID, COUNT(*) AS "nbr employees"
FROM EMPLOYEES 
GROUP BY DEPARTMENT_ID
ORDER BY DEPARTMENT_ID;

SELECT DEPARTMENT_ID, COUNT(*) AS "nbr employees"
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
HAVING COUNT(*) < 10
ORDER BY DEPARTMENT_ID;