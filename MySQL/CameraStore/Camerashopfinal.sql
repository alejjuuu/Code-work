/* Final project "Camera shop"
Luis Velasquez
Database FALL 2020*/

create table Customers(
Customer_id CHAR(4) PRIMARY KEY,
LastName CHAR(15),
FirstName CHAR(15),
Phone VARCHAR(13),
Address CHAR (20),
City CHAR (15),
State CHAR (2),
Zipcode CHAR (5)
);

create table Customer_purchased(
Purchase_id CHAR (5) PRIMARY KEY,
Customer_id CHAR (15),
Brand_id CHAR(4),
Quantity INT (4),
Last_Purchase DATE
);


create table Brands(
Brand_id CHAR (4) PRIMARY KEY,
Name CHAR(40),
Made_year DATE,
Price DECIMAL (6,2)
);




create table Stock_levels(
Stock_id CHAR (5) PRIMARY KEY,
Brand_id CHAR (4),
Category_code CHAR (5),
Item_description CHAR (40),
Stock_quantity CHAR (4)
);

create table Stock_category(
Category_code CHAR(5) PRIMARY KEY,
Detailed_decription CHAR(50)
);



create table Suppliers (
Supplier_id CHAR(4) PRIMARY KEY,
Stock_id CHAR (5),
Name CHAR (15),
Email CHAR (40),
Website CHAR (40),
Phone VARCHAR (13),
City CHAR (15)
);


INSERT INTO Customers
VALUES
('1001','Velasquez','Luis','8622912736','40 south first ave','mine hill','NJ','07803');
INSERT INTO Customers
VALUES
('1002','Greer','Antonio','9788341970','2268 Christie Way','Amesbury','MA','01913');
INSERT INTO Customers
VALUES
('1003','Hayes','George','7068896109','1819 Hillview Drive','Ellijay','GA','30546');
INSERT INTO Customers
VALUES
('1004','Paulsen','Joy','8014874271','2114 White River Way','Salt Lake City','UT','84106');
INSERT INTO Customers
VALUES
('1005','Prater','Amanda','7014289869','4693 Walnut Drive','Kindred','ND','58051');


INSERT INTO Customer_purchased
VALUES
('90201','1001','0101','1','2020-03-31');
INSERT INTO Customer_purchased
VALUES
('90202','1002','0102','3','2020-06-09');
INSERT INTO Customer_purchased
VALUES
('90203','1003','0103','5','2020-08-10');
INSERT INTO Customer_purchased
VALUES
('90204','1004','0104','7','2020-09-04');
INSERT INTO Customer_purchased
VALUES
('90205','1005','0105','2','2020-05-24');


INSERT INTO Brands
VALUES
('0101','Canon T8i EF-S','2020-01-01','899.99');
INSERT INTO Brands
VALUES
('0102','Canon EOS-1D XMarklll','2020-01-01','6499.99');
INSERT INTO Brands
VALUES
('0103','Canon EOS R6','2020-01-01','2499.99');
INSERT INTO Brands
VALUES
('0104','Zony A7III','2020-01-01','1899.99');
INSERT INTO Brands
VALUES
('0105','Nikon Z7','2020-01-01','3099.95');


INSERT INTO Stock_levels
VALUES
('50301','0101','001','Body + EF-S 18-55mm IS STM Lens Kit','100');
INSERT INTO Stock_levels
VALUES
('50302','0102','002','Body only','120');
INSERT INTO Stock_levels
VALUES
('50303','0103','003','Body only','85');
INSERT INTO Stock_levels
VALUES
('50304','0104','004','Body + 28-70mm','98');
INSERT INTO Stock_levels
VALUES
('50305','0105','005','24-70mm Lens Kit','70');


INSERT INTO Stock_category
VALUES
('001','Regular RGB Sensor + 24.1MP + 4K ');
INSERT INTO Stock_category
VALUES
('002','Full Frame CMOS Sensor + 20.1 Mp + 4K');
INSERT INTO Stock_category
VALUES
('003','Mirroless CMOS Sensor + 20Mp + 4K');
INSERT INTO Stock_category
VALUES
('004','Full Frame ExmorR CMOS Sensor + 24.2Mp + 4K');
INSERT INTO Stock_category
VALUES
('005','Mirroless CMOS + 45.7Mp + 4K');


INSERT INTO Suppliers
VALUES
('2000','50301','Canon','pr@cusa.canon.com','www.usa.canon.com','800-652-2666','NEW YORK');
INSERT INTO Suppliers
VALUES
('2001','50302','Canon','pr@cusa.canon.com','www.usa.canon.com','800-652-2666','NEW YORK');
INSERT INTO Suppliers
VALUES
('2002','50303','Canon','pr@cusa.canon.com','www.usa.canon.com','800-652-2666','NEW YORK');
INSERT INTO Suppliers
VALUES
('2200','50304','Sony','sony@usa.sony.com','www.usa.sony.com','800-538-7550','NEW YORK');
INSERT INTO Suppliers
VALUES
('2400','50305','Nikon','nikon@usa.nikon.com','www.usa.nikon.com','800-600-6931','NEW JERSEY');


alter table Customer_purchased add foreign key (Customer_id) references Customers (Customer_id);
alter table Customer_purchased add foreign key (Brand_id) references Brands (Brand_id);
alter table Stock_levels add foreign key (Brand_id) references Brands (Brand_id);
alter table Stock_levels add foreign key (Category_code) references Stock_category (Category_code);
alter table Suppliers add foreign key (Stock_id) references Stock_levels (Stock_id);


/*Write 10 queries that represent information that would be useful from your database.
At least 5 of those queries must be joins.  All queries must include one or more of the following:
concatenation, alias, functions, where clause.  Submit the queries and their purpose in a text
file.  Use comments to explain the purpose.*/

1)show customer last name, first name, last purchase

/* All Purchases from all Customers */

select concat(LastName,' ',FirstName)"Customer Name", Customer_purchased.Last_Purchase'Last purchase'
from Customers, Customer_purchased
where Customers.Customer_id = Customer_purchased.Customer_id;

2)show customer last name, first name, quantity * price order by price descending

/* This query could work to show all total profits or a specific day wanted */

select concat(LastName,' ',FirstName)'Customer Name', Customer_purchased.Quantity, Brands.Name,
Brands.Price, Customer_purchased.Quantity * Brands.Price as 'Total'
from Customers, Customer_purchased, Brands
where Customer_purchased.Customer_id = Customers.Customer_id
and Customer_purchased.Brand_id = Brands.Brand_id order by Brands.Price desc;

3)show customer last name, address, phone, quantity, name, price

/* This query could work as purchase summary or shipping label  */

select concat(LastName,' ',FirstName)'Customer Name',Address ,Phone ,
Customer_purchased.Quantity, Brands.Name
from Customers, Customer_purchased, Brands
where Customer_purchased.Customer_id = Customers.Customer_id
and Customer_purchased.Brand_id = Brands.Brand_id;

4)show brand name, price, stock quantity, price * stock quantity

/* All the stock value calculated   */

select Name,Price, Stock_levels.Stock_quantity "Stock Level",
round(Price * Stock_levels.Stock_quantity,2) "Total Merchandise  "
from Brands, Stock_levels
where Brands.Brand_id = Stock_levels.Brand_id;

5)show brand name, item description, and detailed description

/* Specific discont*/

select concat(LastName,' ',FirstName)'Customer Name',Brands.Name'Item(s) in discont',
 Customer_purchased.Quantity, Brands.Price,
round(Customer_purchased.Quantity * Brands.Price * .10,2) '10% off Coupon Applied',
round(Customer_purchased.Quantity * Brands.Price * .10 +
Customer_purchased.Quantity * Brands.Price,2) 'Total'
from Customers, Customer_purchased, Brands
where Customer_purchased.Customer_id = Customers.Customer_id
and Customer_purchased.Brand_id = Brands.Brand_id
and Brands.Name = 'Canon EOS-1D XMarklll';

6)show brand name, supplier name, supplier email, supplier website and phone

/* Suppliers information */

select Brands.Name, Suppliers.Name, Suppliers.Email, Suppliers.Website, Suppliers.Phone
from Brands, Suppliers,Stock_levels
where Brands.Brand_id = Stock_levels.Brand_id
and Suppliers.Stock_id = Stock_levels.Stock_id;


7)select all customers that bought more than 5 articles and give them a 20% OFF

/* Store Coupons, 20% off for more than 5 items  */

select concat(LastName,' ',FirstName)'Customer Name', Customer_purchased.Quantity, Brands.Price,
round(Customer_purchased.Quantity * Brands.Price * .20,2) '20% Coupon Applied',
round(Customer_purchased.Quantity * Brands.Price * .20 +
Customer_purchased.Quantity * Brands.Price,2) 'Total'
from Customers, Customer_purchased, Brands
where Customer_purchased.Customer_id = Customers.Customer_id
and Customer_purchased.Brand_id = Brands.Brand_id
and Customer_purchased.Quantity >= 5;



8)show brand name, made year, item description

/* All Item information */

select Name'Brand Name', Made_year "Year", Stock_levels.Item_description "Item description",
 Stock_category.Description 'Detailed description'
from Brands, Stock_levels, Stock_category
where Brands.Brand_id = Stock_levels.Brand_id
and Stock_levels.Category_code = Stock_category.Category_code;

9)show brand name, supplier name, website, phone, City

/* Current stock level and supplier contact*/

select Brands.Name'Brands Name', Stock_levels.Stock_quantity - Customer_purchased.Quantity 'Current Stock Level',
 Suppliers.Name'Supplier Name',
Suppliers.Website, Suppliers.Phone, Suppliers.City
from Customer_purchased, Brands, Suppliers, Stock_levels
where Customer_purchased.Brand_id = Brands.Brand_id
and Customer_purchased.Brand_id = Stock_levels.Brand_id
and Suppliers.Stock_id = Stock_levels.Stock_id;


10)show customer last name, address, last purchase, quantity, where customer_id = 1001

/* Last purchase from a specific customer*/

select Customers.Customer_id, Customers.LastName, Customers.FirstName, Customers.Address,
Customer_purchased.Last_Purchase,
Customer_purchased.Quantity, Brands.Name, Brands.Price
from Customers, Customer_purchased, Brands
where Customer_purchased.Customer_id = Customers.Customer_id
and Customer_purchased.Brand_id = Brands.Brand_id
and Customers.Customer_id = 1101;




/* extra help # disabling foreign keys

set foreign_key_checks=OFF;
drop table Customers;
drop table Customer_purchased;
drop table Brands;
drop table Stock_levels;
drop table Stock_category;
drop table Suppliers;
set foreign_key_checks=ON;

 # Enabling foreign keys */
