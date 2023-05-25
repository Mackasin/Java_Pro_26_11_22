use classicmodels;

select * from offices where officeCode in (4,5,6,7);
select * from offices where officeCode >=4 and officeCode<=7;
select * from offices order by officeCode limit 3,4;

select * from products where productName like '1936%';

select * from products where productVendor in ('Motor City Art Classics' , 'Exoto Designs') and productScale like '1:24';

select * from orders where shippedDate is null;

select * from offices order by city desc;

select * from products order by productVendor asc;
