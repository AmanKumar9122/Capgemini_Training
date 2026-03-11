-- Q1. Display all customers
SELECT *
FROM Customers;


-- Q2. Display all products
SELECT *
FROM Products;


-- Q3. Display all sales orders
SELECT *
FROM Sales;


-- Q4. Display total revenue generated
SELECT SUM(quantity * price_per_unit) AS total_revenue
FROM Sales;


-- Q5. Display total revenue generated for each product
SELECT product_id,
       SUM(quantity * price_per_unit) AS total_revenue
FROM Sales
GROUP BY product_id;


-- Q6. Display total orders placed by each customer
SELECT customer_id,
       COUNT(order_id) AS total_orders
FROM Sales
GROUP BY customer_id;


-- Q7. Display customers who never placed any order
SELECT c.customer_id, c.customer_name
FROM Customers c
LEFT JOIN Sales s
ON c.customer_id = s.customer_id
WHERE s.order_id IS NULL;


-- Q8. Display top 2 customers who generated the highest total revenue
SELECT c.customer_id,
       c.customer_name,
       SUM(s.quantity * s.price_per_unit) AS total_revenue
FROM Customers c
JOIN Sales s
ON c.customer_id = s.customer_id
GROUP BY c.customer_id, c.customer_name
ORDER BY total_revenue DESC
LIMIT 2;


-- Q9. Display each product with:
-- total quantity sold
-- total revenue generated
-- only products sold at least once
-- sorted by revenue descending

SELECT p.product_id,
       p.product_name,
       SUM(s.quantity) AS total_quantity_sold,
       SUM(s.quantity * s.price_per_unit) AS total_revenue
FROM Products p
JOIN Sales s
ON p.product_id = s.product_id
GROUP BY p.product_id, p.product_name
ORDER BY total_revenue DESC;


-- Q10. List customers and their total spending
-- only include customers who spent more than 50000

SELECT c.customer_id,
       c.customer_name,
       SUM(s.quantity * s.price_per_unit) AS total_spending
FROM Customers c
JOIN Sales s
ON c.customer_id = s.customer_id
GROUP BY c.customer_id, c.customer_name
HAVING SUM(s.quantity * s.price_per_unit) > 50000
ORDER BY total_spending DESC;