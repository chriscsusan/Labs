-- #1
SELECT * FROM northwind.customers;
-- #2
select distinct customers.country_region from customers;
-- #3
select * from customers where customers.last_name like 'B%';
-- #4
select * from orders limit 100;
-- #5
select * from customers where customers.zip_postal_code in ('1010', '3012', '12209', '05023');
-- #6
select * from orders where orders.ship_country_region is not null;
-- #7
select * from customers order by customers.country_region, customers.city;
-- #8
insert customers (company, last_name, first_name, job_title, city) values ('Company F', 'Mulder', 'Fox', 'Special Agent', 'Washington DC');
-- #9
update orders set orders.ship_zip_postal_code = '97201' where orders.ship_city='Portland';
-- #10
delete from order_details where order_details.quantity = '1';
-- #11
SELECT min(quantity), max(quantity), avg(quantity) from order_details;
-- #12
SELECT min(quantity), max(quantity), avg(quantity) from order_details group by order_details.order_id;
-- #13
select customer_id from orders where id='65';
-- #14
SELECT * FROM orders inner JOIN customers on orders.customer_id=customers.id;
SELECT * FROM orders left JOIN customers on orders.customer_id=customers.id;
SELECT * FROM orders right JOIN customers on orders.customer_id=customers.id;
-- #15
select employees.first_name from employees where employees.notes is not null;
-- #16.
select orders.ship_city from orders where orders.ship_name like "Francisco%";