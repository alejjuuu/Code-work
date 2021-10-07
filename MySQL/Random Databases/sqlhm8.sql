/* Luis Velasquez Homework 8
11/24/20*/ 

1)
select avg (CreditLimit) "Average of Clients" from Client;

2)
select OrderNum, OrderDate from WorkOrders;
select date_format(OrderDate, "%m/%d/%y")"OrderDate" from WorkOrders;

3)
select TaskID, ScheduledDate from OrderLine;
select date_format(ScheduledDate, "%m %d %y")"SchuledDate" from OrderLine;
select 67949 OrderNum;

4)
select sum(Price) "Total price" from Tasks;
select min(Price) "Min price" from Tasks;
select max(Price) "Max price" from Tasks;

5)
select ClientName,CreditLimit from Client;
select ClientName, Balance - CreditLimit "AvailableCredit" from Client order by AvailableCredit;

6)
select OrderNum, TaskID, Day(ScheduledDate) from OrderLine;

7)
select ClientName,City from Client where Balance < 5000;

8)
select LastName from Consultant where Rate > 20 and Rate <25;

9)
select ClientName, City from Client where ClientName like 'H%';

10)
select Category, Price from Tasks where Category like '%minor';
/*could not get an output from this question; that's the answer I believe 
is appropriate*/


