use classicmodels;

SELECT e.employeeNumber, e.firstName, e.lastName, o.city
FROM employees e
         left join offices o on o.officeCode = e.officeCode
where o.city in ('Tokyo', 'Paris');


SELECT e.employeeNumber, e.lastName, e.firstName, COUNT(c.salesRepEmployeeNumber) AS clients_amount
FROM employees e
         LEFT JOIN customers c ON e.employeeNumber = c.salesRepEmployeeNumber
GROUP BY e.employeeNumber
ORDER BY clients_amount DESC;


SELECT em.employeeNumber, em.firstName, em.lastName, em.reportsTo, e.firstName, e.lastName
FROM employees e
         LEFT JOIN employees em ON e.employeeNumber = em.reportsTo
WHERE e.lastName = 'Bondur'
  AND e.firstName = 'Gerard';


SELECT e.employeeNumber, e.lastName, e.firstName, COUNT(c.salesRepEmployeeNumber) AS clients_amount
FROM employees e
         LEFT JOIN customers c ON e.employeeNumber = c.salesRepEmployeeNumber
GROUP BY e.employeeNumber
HAVING clients_amount < 5
ORDER BY clients_amount DESC;


SELECT e.employeeNumber, e.lastName, e.firstName, COUNT(od.customerNumber) AS orders_non_shipped
FROM employees e
         LEFT JOIN customers c ON e.employeeNumber = c.salesRepEmployeeNumber
         LEFT JOIN orders od ON c.customerNumber = od.customerNumber
WHERE !(od.status = 'Shipped')
GROUP BY e.employeeNumber
ORDER BY orders_non_shipped DESC;


(SELECT e.employeeNumber, e.lastName, e.firstName, COUNT(od.customerNumber) AS shipped_orders_amount
 FROM employees e
          LEFT JOIN customers c ON e.employeeNumber = c.salesRepEmployeeNumber
          LEFT JOIN orders od ON c.customerNumber = od.customerNumber
 WHERE od.status = 'Shipped'
 GROUP BY e.employeeNumber
 ORDER BY shipped_orders_amount DESC LIMIT 1)
UNION
(SELECT e.employeeNumber, e.lastName, e.firstName, COUNT(od.customerNumber) AS shipped_orders_amount
 FROM employees e
          LEFT JOIN customers c ON e.employeeNumber = c.salesRepEmployeeNumber
          LEFT JOIN orders od ON c.customerNumber = od.customerNumber
 WHERE od.status = 'Shipped'
 GROUP BY e.employeeNumber
 ORDER BY shipped_orders_amount LIMIT 1);