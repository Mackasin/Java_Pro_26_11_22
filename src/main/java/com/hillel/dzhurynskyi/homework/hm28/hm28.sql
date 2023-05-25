use classicmodels;

-- task 1
select @employeeNumber := employeeNumber
from employees
where lastName = 'Jennings'
  and firstName = 'Leslie';
insert into customers(customerNumber, customerName, contactLastName, contactFirstName, phone, addressLine1, city,
                      country, salesRepEmployeeNumber)
values (9999, 'Maksym crp.', 'Leonov', 'Mark', '+3802154623', 'street', 'Kiev', 'Ukraine', @employeeNumber);

SELECT @customerNumber := customerNumber
FROM customers
WHERE customerName = 'Maksym crp.';
SELECT @productCode := productCode
FROM products
WHERE productName = '1996 Moto Guzzi 1100i';
insert into orders(orderNumber, orderDate, requiredDate, shippedDate, status, customerNumber)
values (99999999, '2022-01-01', '2022-02-01', '2022-02-01', 'Shipped', @customerNumber);
SELECT @orderNumber := orderNumber
FROM orders
WHERE customerNumber = @customerNumber;
INSERT INTO order_details(orderNumber, productCode, quantityOrdered, priceEach, orderLineNumber)
VALUES (@orderNumber, @productCode, 4, 800.34, 5);
-- task 2
UPDATE customers c
SET c.customerName = CONCAT(c.customerName, ' Superstar')
where c.customerName in
      (select s.customerName
       from (select c.customerName, COUNT(*) as ordersAmount
             from customers c
                      LEFT JOIN orders o ON c.customerNumber = o.customerNumber
             GROUP BY c.customerNumber
             HAVING ordersAmount > 10) as s);
-- task 3
SELECT @customerNumber := customerNumber
FROM customers
WHERE customerName = 'Diecast Collectables';

DELETE
FROM payments
WHERE customerNumber = @customerNumber;

DELETE
FROM order_details
WHERE orderNumber IN (SELECT orderNumber
                      FROM orders
                      WHERE customerNumber = @customerNumber);

DELETE
FROM orders
WHERE customerNumber = @customerNumber;
