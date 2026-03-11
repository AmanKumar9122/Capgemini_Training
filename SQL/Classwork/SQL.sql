-- CREATE DATABASE cap; 
-- DROP TABLE IF EXISTS emp;

-- CREATE TABLE emp (
--   empno decimal(4,0) NOT NULL,
--   ename varchar(10) default NULL,
--   job varchar(9) default NULL,
--   mgr decimal(4,0) default NULL,
--   hiredate date default NULL,
--   sal decimal(7,2) default NULL,
--   comm decimal(7,2) default NULL,
--   deptno decimal(2,0) default NULL
-- );

-- DROP TABLE IF EXISTS dept;

-- CREATE TABLE dept (
--   deptno decimal(2,0) default NULL,
--   dname varchar(14) default NULL,
--   loc varchar(13) default NULL
-- );

-- INSERT INTO emp VALUES ('7369','SMITH','CLERK','7902','1980-12-17','800.00',NULL,'20');
-- INSERT INTO emp VALUES ('7499','ALLEN','SALESMAN','7698','1981-02-20','1600.00','300.00','30');
-- INSERT INTO emp VALUES ('7521','WARD','SALESMAN','7698','1981-02-22','1250.00','500.00','30');
-- INSERT INTO emp VALUES ('7566','JONES','MANAGER','7839','1981-04-02','2975.00',NULL,'20');
-- INSERT INTO emp VALUES ('7654','MARTIN','SALESMAN','7698','1981-09-28','1250.00','1400.00','30');
-- INSERT INTO emp VALUES ('7698','BLAKE','MANAGER','7839','1981-05-01','2850.00',NULL,'30');
-- INSERT INTO emp VALUES ('7782','CLARK','MANAGER','7839','1981-06-09','2450.00',NULL,'10');
-- INSERT INTO emp VALUES ('7788','SCOTT','ANALYST','7566','1982-12-09','3000.00',NULL,'20');
-- INSERT INTO emp VALUES ('7839','KING','PRESIDENT',NULL,'1981-11-17','5000.00',NULL,'10');
-- INSERT INTO emp VALUES ('7844','TURNER','SALESMAN','7698','1981-09-08','1500.00','0.00','30');
-- INSERT INTO emp VALUES ('7876','ADAMS','CLERK','7788','1983-01-12','1100.00',NULL,'20');
-- INSERT INTO emp VALUES ('7900','JAMES','CLERK','7698','1981-12-03','950.00',NULL,'30');
-- INSERT INTO emp VALUES ('7902','FORD','ANALYST','7566','1981-12-03','3000.00',NULL,'20');
-- INSERT INTO emp VALUES ('7934','MILLER','CLERK','7782','1982-01-23','1300.00',NULL,'10');

-- INSERT INTO dept VALUES ('10','ACCOUNTING','NEW YORK');
-- INSERT INTO dept VALUES ('20','RESEARCH','DALLAS');
-- INSERT INTO dept VALUES ('30','SALES','CHICAGO');
-- INSERT INTO dept VALUES ('40','OPERATIONS','BOSTON');

-- projection
-- Syntax : Select * /[Distinct] col_name/Expression [Alias]
-- 		    From Table_name;

-- Query to see Employee name for employee table.....
-- SELECT ename FROM emp;

-- Query to see Employee name and salary for employee table.....
-- SELECT ename, sal  FROM emp;

-- Query to see complete data inside employee table.....
-- SELECT * FROM emp;

-- Query to see salary for employee table.....
-- SELECT sal  FROM emp;

-- DispLay salary of employee without duplicates
-- SELECT DISTINCT sal FROM emp;

-- Query to see Employee name, salary WITHOUT DUPLICATES for employee table.....
-- SELECT DISTINCT ename, sal FROM emp;

-- Display salary of employee with bonus of 1000 rs;
-- SELECT sal, sal+1000 FROM emp;

-- Display salary of employee with deducing 1000 rs;
-- SELECT sal, sal-1000 FROM emp;

-- Display employee name, salary, annual salary from Employee Table;
-- SELECT ename, sal, sal*12 FROM emp;
-- SELECT ename, sal, sal*12 as "Annual Salary" FROM emp;

-- Display employee name, salary with hike of 10% from Employee Table;
-- SELECT ename ,sal , sal*1.10 FROM emp;

-- Display employee name, salary with deduce of 10% from Employee Table;
-- SELECT ename ,sal , sal*.9 Duduced_Salary FROM emp;
-- SELECT ename ,sal , sal*.9 Duduced_Salary as FROM emp;


-- WAQTD NAME AND SALARY WITH MONTHLY HIKE OF 50.
-- SELECT ename ,sal , sal*50 as "HIKED SALARY" FROM emp;

-- WAQTD NAME AND ANNUAL SALARY WITH DEDUCTION OF 10%.
-- SELECT ename ,sal , (sal*12)*.90 as "DEDUCED SALARY" FROM emp;

-- WAQTD TOTAL SALARY GIVEN TO EACH EMPLOYEE (SAL+COMM).
-- SELECT ename,
--        sal,
--        sal + COALESCE(comm, 0) AS "TOTAL SALARY" -- nvl in SQL for adding with null
-- FROM emp;

-- WAQTD DETAILS OF ALL THE EMPLOYEES ALONG WITH ANNUAL SALARY.
-- SELECT * , sal*12 as "ANNUAL SALARY" FROM emp; 

-- WAQTD NAME AND DESIGNATION ALONG WITH 100 PENALTY IN SALARY.
-- SELECT ename, job, sal-100 as "SALARY AFTER PENALTY" FROM emp; 

----------------------------------------------------------------------------------------
-- SELECTION --

-- WAQTD ename, deptno of employees working in dept no 20?
-- SELECT ename, deptno FROM emp WHERE deptno = 20;

-- WAQTD ename, salary of employees who are earning more than 2000?
-- SELECT ename, sal FROM emp WHERE sal > 2000;

-- Display the name 0f employee working as manager 
-- SELECT ename FROM emp WHERE job = 'MANAGER';

-- Display name and date of employees who are hired after 1981
-- SELECT ename, hiredate
-- FROM emp
-- WHERE hiredate > '1981-12-31';

-- WAQTD name, salary and annual salary if it is more than 12000 
-- SELECT ename, sal , sal*12 as Annual_Salary FROM emp WHERE sal*12 > 12000;

-------------------------------------------------------------------------
-- OPERATORS IN SQL:

-- 1. ARITHEMETIC OPERATORS: (+,,,/,%)
-- 2. CONCATENATION OPERATOR:- (||)
-- 3. COMPARISION OPERATORS: (=, != or <>)
-- 4. RELATIONAL OPERATOR: (>, <, >, <=)
-- 5. LOGICAL OPERATORS :-(AND, OR, NOT)
-- 6. SPECIAL OPERATOR (1.IN
					-- 2.NOT IN
					-- 3. BETWEEN
					-- 4. NOT BETWEEN
					-- 5.IS
					-- 6.IS NOT
					-- 7.LIKE
					-- 8. NOT LIKE)
-- 7.SUBQUERY OPERATORS:-(
					-- 1.ALL
					-- 2.ANY
					-- 3. EXISTS
					-- 4. NOT EXISTS)
-- 8.SET OPERATORS:--(
					-- 1.UNION
					-- 2.UNION ALL
					-- 3. 
					-- 4. )


-- SELECT 'MR ' || ename from emp;

-- concat(): IN MYsql
-- no of columns + no of string -1
-- SELECT concat(ename,' is working as ',job,' earning salary of ', sal) from emp;

-- SELECT ename || ' is working as ' || job || ' earning salary of ' || sal 
-- FROM emp 
-- WHERE ename = 'SMITH';

-- DISPLAY THE DETAILS OF EMPLOYEE WORKING IN DEPTNO 20 AND EARNING MORE THAN 2000
-- SELECT * FROM emp 
-- WHERE deptno = 20 AND sal > 2000;

-- DISPLAY THE DETAILS OF EMPLOYEE WORKING IN DEPTNO 10,20
-- SELECT * FROM emp 
-- WHERE deptno = 20 OR deptno =10;

-- DISPLAY THE DETAILS OF EMPLOYEE WHO ARE EARNING MORE THAN 2000 IN DEPTNO 10, 20
-- SELECT * FROM emp
-- WHERE sal > 2000
-- AND (deptno = 20 OR deptno = 10);

-- DISPLAY THE DETAILS OF EMPLOYEE WHO ARE WORKING AS SALESMAN AND ANAYLST
-- SELECT * FROM emp
-- WHERE job != 'SALESMAN' AND job != 'ANALYST';  


-- SELECT ename, deptno
-- FROM emp
-- WHERE deptno IN (10,20);

-- SELECT ename, deptno
-- FROM emp
-- WHERE deptno NOT IN (10,20);

-- SELECT ename, sal
-- FROM emp
-- WHERE sal BETWEEN 1000 AND 3000;

-- SELECT ename
-- FROM emp 
-- WHERE hiredate BETWEEN '1981-01-01' AND '1981-12-31';

-- SELECT ename, sal
-- FROM emp
-- WHERE sal NOT BETWEEN 1000 AND 3000;

-- DISPLAY DETAILS OF EMPLOYEE WHO ARE NOT EARNING COMMISION.
-- SELECT * FROM emp WHERE comm IS NULL;

-- SELECT * FROM emp WHERE comm IS NOT NULL;

-- DISPLAY THE DETAILS OF EMPLOYEE WHO ARE EARNING SALARY BUT NOT COMMISSION
-- SELECT * FROM emp
-- WHERE sal IS NOT NULL AND comm IS NULL;

-- LIKE (PATTERN MATCHING) % -> IT ACCEPTS MORE THAN ONE CHAR
-- 	    				     _ -> IT ACCEPTS SINGLE CHARACTER

-- DISPLAY NAMES OF EMPLOYEE WHO'S NAME START WITH S
-- SELECT * FROM emp 
-- WHERE ename LIKE 'S%';

-- DISPLAY NAMES OF EMPLOYEE WHO'S NAME CONSIST OF CHAR a
 -- SELECT * FROM emp 
 -- WHERE ename LIKE '%S%';
 
 -- DISPLAY DETAILS OF EMPLOYEE WHO'S NAME CONSIST OF CHAR A TWO TIMES
 -- SELECT * FROM emp 
 -- WHERE ename LIKE '%A%A%';

-- EXACTLY 2 'A'
-- SELECT *
-- FROM emp
-- WHERE ename LIKE '%A%A%'
-- AND ename NOT LIKE '%A%A%A%';

-- DISPLAY NAME AND SALARY OF EMPLOYEE WHO ARE EARNING 4 DIGIT OF SALARY
-- SELECT ename, sal
-- FROM emp
-- WHERE round(sal)::text LIKE '____';

-- SELECT ename, sal
-- FROM emp
-- WHERE sal BETWEEN 1000 AND 9999;


-- 	DISPLAY DETAILS OF EMPLOYEE WHO ARE HIRED IN THE MONTH OF FEB
-- SELECT * FROM emp
-- WHERE hiredate::text LIKE '____-02-__';

-- EMPLOYEE NAME WHICH DOESN'T START WITH S
-- SELECT ename FROM emp
-- WHERE ename NOT lIKE 'S%';

-- DISPLAY THE NAME OF EMPLOYEE WHO'S NAME START WITH A OR S
-- SELECT ename FROM emp
-- WHERE ename LIKE 'S%' OR ename LIKE 'A%';

-- NAME START WITH VOWELS 
-- SELECT ename FROM emp
-- WHERE ename LIKE 'A%' OR ename LIKE 'E%' OR ename LIKE 'I%' OR ename LIKE 'O%' OR ename LIKE 'U%';

-- DISPLAY THE DETAILS WHOS NAME START WITH CONS AND END WITH VOWELS 
-- SELECT ename
-- FROM emp
-- WHERE ename NOT LIKE 'A%'
--   AND ename NOT LIKE 'E%'
--   AND ename NOT LIKE 'I%'
--   AND ename NOT LIKE 'O%'
--   AND ename NOT LIKE 'U%'
--   AND (
--         ename LIKE '%A'
--      OR ename LIKE '%E'
--      OR ename LIKE '%I'
--      OR ename LIKE '%O'
--      OR ename LIKE '%U'
--       );

-- ASSIGNMENT ON SEPCIAL OPERATORS :
-- 1. LIST ALL THE EMPLOYEES WHO ARE HAVING REPORTING MANAGERS IN DEPT 10
-- SELECT *
-- FROM emp
-- WHERE mgr IN (
--     SELECT empno FROM emp WHERE deptno = 10
-- );

-- 2. LIST ALL THE EMPLOYEES WHOSE COMMISSION IS NULL AND WORKING AS CLERK
-- SELECT *
-- FROM emp
-- WHERE comm IS NULL
-- AND job = 'CLERK';

-- 3. LIST ALL THE EMPLOYEES WHO DON'T HAVE A REPORTING MANAGER IN DEPTNO 10 OR 30
-- SELECT *
-- FROM emp
-- WHERE mgr NOT IN (
--     SELECT empno FROM emp WHERE deptno IN (10,30)
-- )
-- OR mgr IS NULL;

-- 4. WAQTD details of the employee who's name starts with 'J' and end with 'S'.
-- SELECT *
-- FROM emp
-- WHERE ename LIKE 'J%S';

-- 5. WAQTD details of the employee who's is earning 4 digit salary.
-- SELECT *
-- FROM emp
-- WHERE sal BETWEEN 1000 AND 9999;

-- 6. WAQTD details of the employee who's name has 5 characters'
-- SELECT *
-- FROM emp
-- WHERE ename LIKE '_____';

-- 7. WAQTD name and hiredate of the employee who was hired on the first day of the month in the year 1982
-- SELECT ename, hiredate
-- FROM emp
-- WHERE hiredate::TEXT LIKE '1982-__-01';

-- 8. WAQTD name of the employee which has 6 characters starts with 'A' and ends with 'A'
-- SELECT ename
-- FROM emp
-- WHERE ename LIKE 'A____A';

-- 9. WAQTD name and job of the employee if the job has a string 'MAN' in it.
-- SELECT ename, job
-- FROM emp
-- WHERE job LIKE '%MAN%';

-- 10. WAQTD NAMES OF THE EMPLOYEES HAVING CHAR 'S' AS THEIR LAST CHARACTER
-- SELECT ename
-- FROM emp
-- WHERE ename LIKE '%S';

-- 11. WAQTD DETAILS OF THE EMPLOYEES WORKING AS ANALYST AND EARNING 4 DIGIT SALARY
-- SELECT *
-- FROM emp
-- WHERE job = 'ANALYST'
-- AND sal BETWEEN 1000 AND 9999;

-- 12. WAQTD NAMES OF THE EMPLOYEES HIRED IN THE FIRST MONTH
-- SELECT ename
-- FROM emp
-- WHERE hiredate LIKE '____-01-__';


-- 13. WAQTD DETAILS OF EMPLOYEES HAVING TWO L'S PRESENT IN THE NAMES AND WORKS AS MANAGER
-- SELECT *
-- FROM emp
-- WHERE ename LIKE '%L%L%'
-- AND job = 'MANAGER';

-- 14. WAQTD NAMES OF THE EMPLOYEES IF NAME STARTS WITH 'A' OR 'J' OR 'S'
-- SELECT ename
-- FROM emp
-- WHERE ename LIKE 'A%'
-- OR ename LIKE 'J%'
-- OR ename LIKE 'S%';


-- 15. LIST ALL THE EMPLOYEE NAMES EXCEPT FOR THE EMPLOYEES WHO'S NAME HAS 'A' AS THE 3rd CHARCTER
-- SELECT ename
-- FROM emp
-- WHERE ename NOT LIKE '__A%';


-- FUNCTIONS
-- 1.SRF() - LENGTH(), 


-- SELECT LENGTH('aman');
-- SELECT 'HELLO WORLD';

-- DISPLAY THE NAME OF EMPLOYEE WHOSE NAME IS EXACTLY OF 4 CHAR


-- DISPLAY THE NAME OF EMPLOYEE WHOSE NAME IS MORE THAN 4 CHAR BUT LESS THAN 7 CHAR



-- SELECT UPPER('Aman');
-- SELECT LOWER('Aman');

-- Syntax of SubString
-- SELECT Substr('Original_string', Position ,[Length])
-- SELECT SUBSTR('QSPIDERS', 2 , 3);
-- SELECT SUBSTR('QSPIDERS', 6 , 5);
-- SELECT SUBSTR('QSPIDERS', 2); -- "SPIDERS"

-- Want last N characters → use RIGHT()
-- Want first N characters → use LEFT()
-- Want dynamic slicing → use SUBSTR() with LENGTH()

-- SELECT SUBSTR('QSPIDERS', -3 , 3); -- it will not work in postgres
-- SELECT SUBSTR('QSPIDERS', -7);
-- SELECT LEFT('AMAN',1);
-- SELECT RIGHT ('AMAN',1);

-----------------------------------------------------------
-- LOCATE not in postgres , in MySql it works
-----------------------------------------------------------
-- In POSTGRES instead of locate we use position and strpos
-- SELECT POSITION('P' IN 'QSPIDERS'); -- 3
-- SELECT STRPOS('QSPIDERS', 'I'); -- 4
-- SELECT STRPOS('QSPIDERS', 'A'); -- 0

-- For checking where the space is.....
-- SELECT STRPOS('QSPIDERS AMAN', ' '); --9


-- Extract @gmail.com
-- SELECT SUBSTRING('amanraj15112003@gmail.com'
--                  FROM POSITION('@' IN 'amanraj15112003@gmail.com'));


-- Extract everything except @gmail.com
-- SELECT SUBSTRING('john123@gmail.com'
--                  FROM 1 
--                  FOR POSITION('@' IN 'john123@gmail.com') - 1);

-----------------------------------------------------------
-- round(), ceil(), floor()
-----------------------------------------------------------
-- ROUND() Examples
-- SELECT ROUND(5.4);        -- 5
-- SELECT ROUND(5.6);        -- 6
-- SELECT ROUND(-5.4);       -- -5
-- SELECT ROUND(5.6789, 2);  -- 5.68
-- SELECT ROUND(5.6739, 2);  -- 5.67


-- -- CEIL() / CEILING() Examples
-- SELECT CEIL(5.1);         -- 6
-- SELECT CEIL(5.9);         -- 6
-- SELECT CEIL(-5.1);        -- -5
-- SELECT CEILING(3.2);      -- 4


-- -- FLOOR() Examples
-- SELECT FLOOR(5.9);        -- 5
-- SELECT FLOOR(5.1);        -- 5
-- SELECT FLOOR(-5.1);       -- -6
-- SELECT FLOOR(3.8);        -- 3

--------------------------------------------------------
-- Date and Time Function
--------------------------------------------------------
-- SELECT CURRENT_DATE;        -- Current date
-- SELECT CURRENT_TIME;        -- Current time
-- SELECT CURRENT_TIMESTAMP;   -- Current date + time
-- SELECT NOW();               -- Same as CURRENT_TIMESTAMP

-- SELECT EXTRACT(YEAR FROM NOW());
-- SELECT EXTRACT(YEAR FROM CURRENT_DATE);      -- Year
-- SELECT EXTRACT(MONTH FROM CURRENT_DATE);     -- Month
-- SELECT EXTRACT(DAY FROM CURRENT_DATE);       -- Day
-- SELECT EXTRACT(HOUR FROM CURRENT_TIMESTAMP); -- Hour
-- SELECT EXTRACT(MINUTE FROM CURRENT_TIMESTAMP);
-- SELECT EXTRACT(SECOND FROM CURRENT_TIMESTAMP);

-- SELECT AGE('2026-12-31', '2024-12-31');  
-- 2 years

-- SELECT AGE(CURRENT_DATE, '2000-01-01');
-- Age from 2000 till today

-- SELECT CURRENT_DATE + INTERVAL '5 days';
-- SELECT CURRENT_DATE - INTERVAL '2 months';
-- SELECT CURRENT_TIMESTAMP + INTERVAL '3 hours';
-- SELECT CURRENT_TIMESTAMP - INTERVAL '30 minutes';

-- SELECT DATE_TRUNC('year', CURRENT_TIMESTAMP);
-- SELECT DATE_TRUNC('month', CURRENT_TIMESTAMP);
-- SELECT DATE_TRUNC('day', CURRENT_TIMESTAMP);
-- SELECT DATE_TRUNC('hour', CURRENT_TIMESTAMP);

-- DISPLAY THE DETAILS OF EMPLOYEE WHO HIRED IN THE MONTH OF MARCH, APRIL, MAY
-- SELECT *
-- FROM emp
-- WHERE EXTRACT(MONTH FROM hiredate) IN (3, 4, 5);

-- DISPLAY THE DETAILS OF EMPLOYEE WHO HIRED ON 1981 IN THE MONTH OF FEB, DEC, APR ON WED, FRI
-- SELECT *
-- FROM emp
-- WHERE EXTRACT(YEAR FROM hiredate) = 1981
--   AND EXTRACT(MONTH FROM hiredate) IN (2, 4, 12)
--   AND EXTRACT(DOW FROM hiredate) IN (3, 5);

-- SELECT *
-- FROM emp
-- WHERE TO_CHAR(hiredate, 'YYYY') = '1981'
--   AND TO_CHAR(hiredate, 'MM') IN ('02', '04', '12')
--   AND TO_CHAR(hiredate, 'DY') IN ('WED', 'FRI');


-- EMPLAYEES HIRED WITHIN 2 YEARS
-- SELECT *
-- FROM emp
-- WHERE hiredate >= CURRENT_DATE - INTERVAL '2 years';


-- Employee with 15+ Year of experience.
-- SELECT *
-- FROM emp
-- WHERE AGE(CURRENT_DATE, hiredate) >= INTERVAL '15 years';

-- SELECT *
-- FROM emp
-- WHERE hiredate <= CURRENT_DATE - INTERVAL '15 years';

 -- SELECT *
 -- FROM emp
 -- WHERE AGE(CURRENT_DATE, hiredate) >= INTERVAL '10 years';

-------------------------------------------------------------
-- COALESCE
-------------------------------------------------------------
-- SELECT COALESCE(NULL, 10);
-- -- 10

-- SELECT COALESCE(NULL, NULL, 'Hello', 'World');
-- -- Hello

-- SELECT COALESCE(NULL, NULL);
-- -- NULL

----------------------------------------------------------------------------
-- MULTI ROW FUNCTIONS -- accept multiple inputs as argument 
-- RULE 
-- 1. Accept only one argument
-- 2. We are not supposed to write any other column name along with multirow function
-- 3. We can not write multirow function in where clause
-- 4. Multirow functions ignore null values
-- 5. Count is the multi row function that accepts * as argument
-- 6. Aways get a not null in count()
----------------------------------------------------------------------------
-- MAX()
-- MIN()
-- AVG()
-- SUM()
-- COUNT()
----------------------------------------------------------------------------
-- SELECT MAX(sal)
-- FROM emp;

-- SELECT MIN(sal)
-- FROM emp;

-- SELECT SUM(sal)
-- FROM emp;

-- SELECT COUNT(sal)
-- FROM emp;

-- SELECT AVG(sal)
-- FROM emp;
----------------------------------------------------------------------------
-- SELECT ename
-- FROM emp
-- WHERE sal = (SELECT MAX(sal) FROM emp);
----------------------------------------------------------------------------
-- SELECT COUNT(comm) FROM emp;
-- SELECT COUNT(*) FROM emp;

----------------------------------------------------------------------------
-- Q1. Display no of employees who same consist of char A.
-- SELECT COUNT(*) AS total_employees
-- FROM emp
-- WHERE ename LIKE '%A%';

-- Q2. Display max salary , min salary and avg sal of all the employees working in department no 20.
-- SELECT 
--     MAX(sal) AS max_salary,
--     MIN(sal) AS min_salary,
--     AVG(sal) AS avg_salary
-- FROM emp
-- WHERE deptno = 20;

-- Q3. Display no of employees and total salary of all the employees who is earning more than 1700
-- SELECT 
--     COUNT(*) AS total_employees,
--     SUM(sal) AS total_salary
-- FROM emp
-- WHERE sal > 1700;

----------------------------------------------------------------------------
-- GROUP BY
---------------------------------------------------------------------------- 
-- SELECT column_name,
--        aggregate_function(column_name)
-- FROM table_name
-- WHERE condition // optional
-- GROUP BY column_name
-- HAVING condition
-- ORDER BY column_name;


-- Execution Order
-- FROM
-- WHERE
-- GROUP BY
-- HAVING
-- SELECT
-- ORDER BY

-- Display no of employees in each department?
-- SELECT deptno,
--        COUNT(*) AS total_employees
-- FROM emp
-- GROUP BY deptno

-- Display no of employees in each department but there salary should be more than 2000?
-- SELECT deptno,
--        COUNT(*) AS total_employees
-- FROM emp
-- WHERE sal > 2000
-- GROUP BY deptno

-- Display max salary given to an employee in each designation.
-- SELECT job,
--        MAX(sal) AS total_sal
-- FROM emp
-- GROUP BY job;

-- Display min salary given to an employee in each designation.
-- SELECT job,
--        MIN(sal) AS total_sal
-- FROM emp
-- GROUP BY job;

-- Diplay numbers of times salaries are repeated in employee table
-- SELECT sal,
--        COUNT(*) AS frequency
-- FROM emp
-- GROUP BY sal;

-- Display Avg salary given to the employee's in each job?
-- SELECT job,
--        avg(sal) AS avg_sal
-- FROM emp
-- GROUP BY job;

-- Display no of employee earning commission in each dept?
-- SELECT deptno,
--        COUNT(*) AS employees_with_commission
-- FROM emp
-- WHERE comm IS NOT NULL
-- GROUP BY deptno

-----------------------------------------------------------------------------
-- Having
-----------------------------------------------------------------------------
-- Execution Order
-- FROM
-- WHERE
-- GROUP BY
-- HAVING
-- SELECT
-- ORDER BY
-----------------------------------------------------------------------------

-- 1. Display number of employees in each department having at least 2 employees and whose name contains 'A' or 'S'
-- SELECT deptno,
--        COUNT(*) AS total_employees
-- FROM emp
-- WHERE ename LIKE '%A%' 
--    OR ename LIKE '%S%'
-- GROUP BY deptno
-- HAVING COUNT(*) >= 2;

-- 2. Display the salary which are repeated in emp table
-- SELECT sal,
--        COUNT(*) AS frequency
-- FROM emp
-- GROUP BY sal
-- HAVING COUNT(*) > 1;

-- 3. Display job and total salary of each job if total salary of each job is more than 9500
-- SELECT job,
--        SUM(sal) AS total_salary
-- FROM emp
-- GROUP BY job
-- HAVING SUM(sal) > 9500;

-- 4. Calculate the average salary of all employees and display it only if the average exceeds 55000
-- SELECT AVG(sal) AS average_salary
-- FROM emp
-- HAVING AVG(sal) > 55000;

----------------------------------------------------------------------------------------------------------------------------------

-- 1. WAQTD NUMBER OF EMP EARNING SAL MORE THAN 1200 IN EACH JOB AND THE TOTAL SAL NEEDED TO PAY EMP OF EACH JOB MUST EXCEEDS 3800
-- SELECT job,
--        COUNT(*) AS total_employees,
--        SUM(sal) AS total_salary
-- FROM emp
-- WHERE sal > 1200
-- GROUP BY job
-- HAVING SUM(sal) > 3800;

-- 2. WAQTD JOB AND MAX SAL OF EMP IN EACH JOB IF THE MAX SAL EXCEEDS 2600
-- SELECT job,
--        MAX(sal) AS max_salary
-- FROM emp
-- GROUP BY job
-- HAVING MAX(sal) > 2600;

-- 3. WAQTD THE HIREDATE WHICH ARE DUPLICATED IN EMP TABLE
-- SELECT hiredate,
--        COUNT(*) AS frequency
-- FROM emp
-- GROUP BY hiredate
-- HAVING COUNT(*) > 1;

-- 4. WAQTD MIN AND MAX SALARIES OF EACH JOB IF MIN SAL IS MORE THAN 1000 AND MAX SAL IS LESS THAN 5000.
-- SELECT job,
--        MIN(sal) AS min_salary,
--        MAX(sal) AS max_salary
-- FROM emp
-- GROUP BY job
-- HAVING MIN(sal) > 1000
--    AND MAX(sal) < 5000;



-- 5. WAQTD deptno and number of emp working only if there are 2 emp working in each dept as manager
-- select deptno, count(*) as emp_count
-- from emp
-- where job = 'MANAGER'
-- group by deptno
-- having count(*) = 2;

-----------------------------------------------------------------------------------------------------------------------------------
-- Display no of times salaries are repeated?
-- arrange then in dec order?
-- SELECT sal,
--        COUNT(*) AS frequency
-- FROM emp
-- GROUP BY sal
-- ORDER BY frequency DESC;

-----------------------------------------------------------------------------------------------------------------------------------
-- SUB-QUERY
-----------------------------------------------------------------------------------------------------------------------------------
-- Display the details of employee who is earning salary more than allen
-- SELECT ename FROM emp
-- where sal > (SELECT sal FROM emp
-- 			 WHERE ename = 'ALLEN');

-----------------------------------------------------------------------------------------------------------------------------------

-- 1. Names of employees earning more than ADAMS
-- SELECT ename
-- FROM emp
-- WHERE sal > (
--     SELECT sal FROM emp WHERE ename = 'ADAMS'
-- );

-- 2. Name and salary of employees earning less than KING
-- SELECT ename, sal
-- FROM emp
-- WHERE sal < (
--     SELECT sal FROM emp WHERE ename = 'KING'
-- );

-- 3. Name and deptno of employees working in same dept as JONES
-- SELECT ename, deptno
-- FROM emp
-- WHERE deptno = (
--     SELECT deptno FROM emp WHERE ename = 'JONES'
-- );

-- 4. Name and job of employees working in same designation as JAMES
-- SELECT ename, job
-- FROM emp
-- WHERE job = (
--     SELECT job FROM emp WHERE ename = 'JAMES'
-- );

-- 5. Empno, ename and annual salary if annual salary > WARD’s annual salary
-- SELECT empno, ename, sal*12 AS annual_salary
-- FROM emp
-- WHERE sal*12 > (
--     SELECT sal*12 FROM emp WHERE ename = 'WARD'
-- );

-- 6. Name and hiredate of employees hired before SCOTT
-- SELECT ename, hiredate
-- FROM emp
-- WHERE hiredate < (
--     SELECT hiredate FROM emp WHERE ename = 'SCOTT'
-- );

-- 7. Name and hiredate of employees hired after the PRESIDENT
-- SELECT ename, hiredate
-- FROM emp
-- WHERE hiredate > (
--     SELECT hiredate FROM emp WHERE job = 'PRESIDENT'
-- );

-- 8. Name and salary of employees earning less than employee whose empno is 7839
-- SELECT ename, sal
-- FROM emp
-- WHERE sal < (
--     SELECT sal FROM emp WHERE empno = 7839
-- );

-- 9. All details of employees hired before MILLER
-- SELECT *
-- FROM emp
-- WHERE hiredate < (
--     SELECT hiredate FROM emp WHERE ename = 'MILLER'
-- );

-- 10. Ename and empno of employees earning more than ALLEN
-- SELECT ename, empno
-- FROM emp
-- WHERE sal > (
--     SELECT sal FROM emp WHERE ename = 'ALLEN'
-- );

-- 11. Name and salary of employees earning more than MILLER but less than ALLEN
-- SELECT ename, sal
-- FROM emp
-- WHERE sal > (
--     SELECT sal FROM emp WHERE ename = 'MILLER'
-- )
-- AND sal < (
--     SELECT sal FROM emp WHERE ename = 'ALLEN'
-- );

------------------------------------------------------------------------------------------------------------------------------------
-- JOIN
------------------------------------------------------------------------------------------------------------------------------------
-- Write a query to display department name of smith?
-- SELECT dname
-- FROM dept
-- WHERE deptno = (
--     SELECT deptno
--     FROM emp
--     WHERE ename = 'SMITH'
-- );

-- Write a query to display department name of smith and allen?
-- SELECT dname
-- FROM dept
-- WHERE deptno IN (
--     SELECT deptno
--     FROM emp
--     WHERE ename IN ('SMITH', 'ALLEN')
-- );

-- Display the department detials of employee who work as developers.
-- SELECT *
-- FROM dept
-- WHERE deptno IN (
--     SELECT deptno
--     FROM emp
--     WHERE job = 'DEVELOPER'
-- );

-- Display details of employee who is earning minimum salary
-- SELECT *
-- FROM emp
-- WHERE sal = (
--     SELECT MIN(sal)
--     FROM emp
-- );

-- SELECT * FROM dept;

-- Display department details of employee who is earning maximum salary
-- SELECT *
-- FROM dept
-- WHERE deptno = (
--     SELECT deptno
--     FROM emp
--     WHERE sal = (
--         SELECT MAX(sal)
--         FROM emp
--     )
-- );

-- WAQTD name, salary, job , hiredate of the employee working in sales dept and hired before king.
-- SELECT ename, sal, job, hiredate
-- FROM emp
-- WHERE deptno = (
--     SELECT deptno
--     FROM dept
--     WHERE dname = 'SALES'
-- )
-- AND hiredate < (
--     SELECT hiredate
--     FROM emp
--     WHERE ename = 'KING'
-- );

-- WAQTD dname name with at least 4 employees
-- SELECT dname
-- FROM dept
-- WHERE deptno IN (
--     SELECT deptno
--     FROM emp
--     GROUP BY deptno
--     HAVING COUNT(*) >= 4
-- );

-- UPDATE emp
-- SET sal = 3000
-- WHERE ename = 'ALLEN';

-- Display the details of employees getting same salary in the same department
-- SELECT *
-- FROM emp
-- WHERE (deptno, sal) IN (
--     SELECT deptno, sal
--     FROM emp
--     GROUP BY deptno, sal
--     HAVING COUNT(*) > 1
-- );

-- Display 5th, 6th, 7th record
-- SELECT *
-- FROM emp 
-- LIMIT 3 OFFSET 4;

-- Display last record
-- SELECT *
-- FROM emp
-- ORDER BY empno
-- OFFSET (SELECT COUNT(*) - 1 FROM emp)
-- LIMIT 1;

-- DISPLAY 4th maximum salary 
-- SELECT DISTINCT sal
-- FROM emp
-- ORDER BY sal DESC
-- LIMIT 1
-- OFFSET 3

-- DISPLAY DETAIL OF EMPLOYEE WHO IS EARNING 3RD AND 4TH MINIMUM SALARY
-- SELECT * 
-- FROM emp 
-- WHERE sal IN(
-- 			SELECT DISTINCT sal
-- 			FROM emp
-- 			ORDER BY sal ASC
-- 			OFFSET 2
-- 			LIMIT 2);

-- SELECT * 
-- FROM (SELECT *
-- 	  FROM dept);

------------------------------------------------------------------------------------------------------------------------------------
-- JOIN
------------------------------------------------------------------------------------------------------------------------------------
-- 1. Cartesian Join / Cross Join
-- In this join each record of table 1 will be merged with all the records of table 2.

-- ANSI (Amarican National Standard Institute)
-- SELECT *
-- FROM table1
-- CROSS JOIN table2;

-- SELECT *
-- FROM emp 
-- CROSS JOIN dept;

-- 2. Inner Join 
-- It matches record.

-- ANSI (Amarican National Standard Institute)
-- SELECT *
-- FROM table1
-- INNER JOIN table2
-- ON <join_condition>; // tn1 = tn2

-- SELECT ename, dname
-- FROM emp 
-- INNER JOIN dept
-- ON emp.deptno = dept.deptno;

-- OLD STYLE
-- SELECT *
-- FROM emp, dept
-- WHERE emp.deptno = dept.deptno;

--Display ename, sal , loc of all the employees working in CHICAGO
-- SELECT e.ename,
--        e.sal,
--        d.loc
-- FROM emp e
-- INNER JOIN dept d
-- ON e.deptno = d.deptno
-- WHERE d.loc = 'CHICAGO';

-----------------------------------------------------------------------------------------------------------------------------------

-- 1.Dname and Job for employees whose job AND department name starts with 'S'SELECT d.dname, e.job
-- FROM emp e
-- JOIN dept d
-- ON e.deptno = d.deptno
-- WHERE e.job LIKE 'S%'
-- AND d.dname LIKE 'S%';

-- 2.Dname and Mgrno for employees reporting to 7839
-- SELECT d.dname, e.mgr
-- FROM emp e
-- JOIN dept d
-- ON e.deptno = d.deptno
-- WHERE e.mgr = 7839;

-- 3.Dname and Hiredate for employees hired after 1983 in ACCOUNTING or RESEARCH dept
-- SELECT d.dname, e.hiredate
-- FROM emp e
-- JOIN dept d
-- ON e.deptno = d.deptno
-- WHERE e.hiredate > '1983-12-31'
-- AND d.dname IN ('ACCOUNTING', 'RESEARCH');

-- 4.Ename and Dname of employees getting commission in dept 10 or 30
-- SELECT e.ename, d.dname
-- FROM emp e
-- JOIN dept d
-- ON e.deptno = d.deptno
-- WHERE e.comm IS NOT NULL
-- AND e.deptno IN (10, 30);

-- 5.Dname and Empno for employees whose empno is (7839, 7902) and working in NEW YORK
-- SELECT d.dname, e.empno
-- FROM emp e
-- JOIN dept d
-- ON e.deptno = d.deptno
-- WHERE e.empno IN (7839, 7902)
-- AND d.loc = 'NEW YORK';

-----------------------------------------------------------------------------------------------------------------------------------
-- OUTER JOIN
-----------------------------------------------------------------------------------------------------------------------------------
-- 1. LEFT OUTER JOIN
-- IT GIVES MATCHED RECORD FROM BOTH THE TABLE AND UNMATCHED RECORD OF LEFT TABLES

-- SELECT *
-- FROM tb1 
-- LEFT JOIN tb2
-- ON t1.col = t2.col;

-- Display employee name and their department name
-- Even though they don’t work in any department.
-- SELECT e.ename,
--        d.dname
-- FROM emp e
-- LEFT JOIN dept d
-- ON e.deptno = d.deptno;

--------------------------------------------------------------------
-- DATABASE
--------------------------------------------------------------------

CREATE DATABASE cap;

-- connect to database
-- \c cap;

--------------------------------------------------------------------
-- DROP TABLES
--------------------------------------------------------------------

DROP TABLE IF EXISTS emp;
DROP TABLE IF EXISTS dept;

--------------------------------------------------------------------
-- CREATE TABLES WITH CONSTRAINTS
--------------------------------------------------------------------

CREATE TABLE dept (
    deptno INT PRIMARY KEY,
    dname VARCHAR(20) NOT NULL,
    loc VARCHAR(20)
);

CREATE TABLE emp (
    empno INT PRIMARY KEY,
    ename VARCHAR(20) NOT NULL,
    job VARCHAR(20),
    mgr INT,
    hiredate DATE,
    sal DECIMAL(10,2),
    comm DECIMAL(10,2),
    deptno INT,

    CONSTRAINT fk_dept
    FOREIGN KEY (deptno)
    REFERENCES dept(deptno)
);

--------------------------------------------------------------------
-- INSERT DATA
--------------------------------------------------------------------

INSERT INTO dept VALUES
(10,'ACCOUNTING','NEW YORK'),
(20,'RESEARCH','DALLAS'),
(30,'SALES','CHICAGO'),
(40,'OPERATIONS','BOSTON');

INSERT INTO emp VALUES
(7369,'SMITH','CLERK',7902,'1980-12-17',800,NULL,20),
(7499,'ALLEN','SALESMAN',7698,'1981-02-20',1600,300,30),
(7521,'WARD','SALESMAN',7698,'1981-02-22',1250,500,30),
(7566,'JONES','MANAGER',7839,'1981-04-02',2975,NULL,20),
(7654,'MARTIN','SALESMAN',7698,'1981-09-28',1250,1400,30),
(7698,'BLAKE','MANAGER',7839,'1981-05-01',2850,NULL,30),
(7782,'CLARK','MANAGER',7839,'1981-06-09',2450,NULL,10),
(7788,'SCOTT','ANALYST',7566,'1982-12-09',3000,NULL,20),
(7839,'KING','PRESIDENT',NULL,'1981-11-17',5000,NULL,10),
(7844,'TURNER','SALESMAN',7698,'1981-09-08',1500,0,30),
(7876,'ADAMS','CLERK',7788,'1983-01-12',1100,NULL,20),
(7900,'JAMES','CLERK',7698,'1981-12-03',950,NULL,30),
(7902,'FORD','ANALYST',7566,'1981-12-03',3000,NULL,20),
(7934,'MILLER','CLERK',7782,'1982-01-23',1300,NULL,10);

--------------------------------------------------------------------
-- PROJECTION
--------------------------------------------------------------------

SELECT ename FROM emp;

SELECT ename, sal FROM emp;

SELECT * FROM emp;

SELECT DISTINCT sal FROM emp;

--------------------------------------------------------------------
-- EXPRESSIONS
--------------------------------------------------------------------

SELECT ename, sal, sal*12 AS annual_salary FROM emp;

SELECT ename, sal*1.10 AS salary_hike FROM emp;

SELECT ename, sal + COALESCE(comm,0) AS total_salary FROM emp;

--------------------------------------------------------------------
-- SELECTION
--------------------------------------------------------------------

SELECT * FROM emp WHERE deptno = 20;

SELECT ename, sal FROM emp WHERE sal > 2000;

SELECT ename FROM emp WHERE job = 'MANAGER';

SELECT ename, hiredate FROM emp
WHERE hiredate > '1981-12-31';

--------------------------------------------------------------------
-- OPERATORS
--------------------------------------------------------------------

SELECT ename || ' works as ' || job FROM emp;

SELECT * FROM emp
WHERE deptno IN (10,20);

SELECT * FROM emp
WHERE sal BETWEEN 1000 AND 3000;

SELECT * FROM emp
WHERE comm IS NULL;

--------------------------------------------------------------------
-- LIKE OPERATOR
--------------------------------------------------------------------

SELECT * FROM emp WHERE ename LIKE 'S%';

SELECT * FROM emp WHERE ename LIKE '%A%';

SELECT * FROM emp WHERE ename LIKE '%A%A%';

SELECT * FROM emp WHERE ename LIKE '_____';

--------------------------------------------------------------------
-- STRING FUNCTIONS
--------------------------------------------------------------------

SELECT LENGTH('AMAN');

SELECT UPPER('aman');

SELECT LOWER('AMAN');

SELECT SUBSTR('QSPIDERS',2,3);

SELECT LEFT('AMAN',1);

SELECT RIGHT('AMAN',1);

SELECT POSITION('P' IN 'QSPIDERS');

SELECT STRPOS('QSPIDERS','I');

--------------------------------------------------------------------
-- NUMERIC FUNCTIONS
--------------------------------------------------------------------

SELECT ROUND(5.6);

SELECT CEIL(5.1);

SELECT FLOOR(5.9);

--------------------------------------------------------------------
-- DATE FUNCTIONS
--------------------------------------------------------------------

SELECT CURRENT_DATE;

SELECT CURRENT_TIMESTAMP;

SELECT EXTRACT(YEAR FROM CURRENT_DATE);

SELECT AGE(CURRENT_DATE,'2000-01-01');

SELECT CURRENT_DATE + INTERVAL '5 days';

SELECT DATE_TRUNC('month', CURRENT_TIMESTAMP);

--------------------------------------------------------------------
-- MULTI ROW FUNCTIONS
--------------------------------------------------------------------

SELECT MAX(sal) FROM emp;

SELECT MIN(sal) FROM emp;

SELECT SUM(sal) FROM emp;

SELECT AVG(sal) FROM emp;

SELECT COUNT(*) FROM emp;

--------------------------------------------------------------------
-- GROUP BY
--------------------------------------------------------------------

SELECT deptno, COUNT(*) AS total_employees
FROM emp
GROUP BY deptno;

SELECT job, MAX(sal)
FROM emp
GROUP BY job;

SELECT job, AVG(sal)
FROM emp
GROUP BY job;

--------------------------------------------------------------------
-- HAVING
--------------------------------------------------------------------

SELECT deptno, COUNT(*)
FROM emp
GROUP BY deptno
HAVING COUNT(*) >= 2;

SELECT sal, COUNT(*)
FROM emp
GROUP BY sal
HAVING COUNT(*) > 1;

--------------------------------------------------------------------
-- SUBQUERY
--------------------------------------------------------------------

SELECT ename
FROM emp
WHERE sal > (
    SELECT sal FROM emp
    WHERE ename='ALLEN'
);

SELECT *
FROM emp
WHERE sal = (
    SELECT MIN(sal)
    FROM emp
);

--------------------------------------------------------------------
-- CROSS JOIN
--------------------------------------------------------------------

SELECT *
FROM emp
CROSS JOIN dept;

--------------------------------------------------------------------
-- INNER JOIN
--------------------------------------------------------------------

SELECT e.ename, d.dname
FROM emp e
INNER JOIN dept d
ON e.deptno = d.deptno;

--------------------------------------------------------------------
-- LEFT JOIN
--------------------------------------------------------------------

SELECT e.ename, d.dname
FROM emp e
LEFT JOIN dept d
ON e.deptno = d.deptno;

--------------------------------------------------------------------
-- RIGHT JOIN
--------------------------------------------------------------------

SELECT e.ename, d.dname
FROM emp e
RIGHT JOIN dept d
ON e.deptno = d.deptno;

--------------------------------------------------------------------
-- FULL OUTER JOIN
--------------------------------------------------------------------

SELECT e.ename, d.dname
FROM emp e
FULL OUTER JOIN dept d
ON e.deptno = d.deptno;

--------------------------------------------------------------------
-- SELF JOIN (EMPLOYEE MANAGER)
--------------------------------------------------------------------

SELECT e.ename AS employee,
       m.ename AS manager
FROM emp e
LEFT JOIN emp m
ON e.mgr = m.empno;

--------------------------------------------------------------------
-- SELF JOIN SAME DEPARTMENT
--------------------------------------------------------------------

SELECT e1.ename, e2.ename, e1.deptno
FROM emp e1
JOIN emp e2
ON e1.deptno = e2.deptno
AND e1.empno <> e2.empno;

--------------------------------------------------------------------
-- ALTER TABLE
--------------------------------------------------------------------

ALTER TABLE emp
ADD COLUMN email VARCHAR(100);

ALTER TABLE emp
RENAME COLUMN email TO emp_email;

ALTER TABLE emp
DROP COLUMN emp_email;

--------------------------------------------------------------------
-- DROP TABLE
--------------------------------------------------------------------

-- DROP TABLE emp;
-- DROP TABLE dept;