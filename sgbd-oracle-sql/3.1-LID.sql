-- PARTIE 3-1 : LID - Fonctions Mono lignes
-- 1
SELECT * FROM departments;
-- 2
SELECT first_name, last_name, salary FROM employees
WHERE commission_pct IS NULL
ORDER BY salary DESC;
-- 3
SELECT * FROM employees 
WHERE salary >= 10000 AND salary <= 20000;

-- 4
SELECT * FROM employees 
WHERE extract(YEAR FROM hire_date) < 2010;

-- 5
SELECT first_name || ' ' || last_name AS "nom et prénom", department_id AS "numéro département" FROM oehr_employees 
WHERE department_id = 30;

-- 6
SELECT department_id "ID DEPT", substr(department_name, 1, 3) || '.' "NOM DEPT", location_id location
FROM department
WHERE department_id < 60;

-- 7
-- CASE
-- WHEN condition1 THEN valR1
-- WHEN condition2 THEN valR2
-- WHEN condition3 THEN valR3
-- ...
-- ELSE valR
-- END alias
---------------------------------------
-- CASE (value)
-- WHEN val1 THEN val4
-- WHEN val2 THEN val5
-- ...
-- ELSE
-- END alias
SELECT first_name || ' ' || last_name AS "nom",
CASE (EXTRACT(YEAR FROM hire_date))
WHEN 1998 THEN 'NEEDS REVIEW'
ELSE 'NOT THIS YEAR'
END REVIEW
FROM employees;

-- 8
SELECT employees.*, extract(year from hire_date) annee,
to_char(hire_date, 'month') mois,
to_char(hire_date, 'q') trimestre
FROM employees
ORDER BY annee DESC;

-- 9 ( it's department 20 not department 30)
SELECT last_name || ' ' || first_name AS "nom et prenom", ROUND(MONTHS_BETWEEN(sysdate, hire_date)) as "anciennete"
FROM employees
WHERE department_id = 20;
