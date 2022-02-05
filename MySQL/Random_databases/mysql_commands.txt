show databases;  #exact
use <databasename>; 
show tables;  #exact
describe <tablename>;

--Data Definition Language (DDL)
--column level PK
create table name
(column datatype primary key,
...
);

--table level PK
create table name
(column datatype,
...
primary key (column));

--composite PK must be table level
create table name
(column datatype,
column datatype,
...
primary key (column, column));

--foreign key
create table name
(column datatype,
...
foreign key (column) references table (column));

--not null
create table name
(column datatype primary key,
column datatype not null,
...
);
