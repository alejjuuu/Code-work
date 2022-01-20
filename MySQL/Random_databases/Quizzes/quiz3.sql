/*quiz 3 
database
Luis Velasquez*/

1)
alter table Employee add primary key (DeptID);

2)
alter table Dept add foreign key(DeptID) references Employee(DeptID);

3)
alter table Employee modify HireDate date not null;

4)
alter table Employee add salary decimal(9,2);

5)
/* char is faster and store values that are always the same example file that dont have 
different length, varchar is more has more length and is less efficient than Char  depending 
on how much data is stored obviously */

6)
select * from Employee;
or
describe Employee;

7) 
select concat (EmpLastName,' ',EmpFirstName) "Employee names" from Employee;

8)
select EmpLastName, HireDate from Employee order by HireDate;

9)
select DeptName from Dept where Location ='Toledo';

10) 
select EmpLastName, DeptID from Employee where salary > 50000;