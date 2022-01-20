/*Luis Velasquez
Data base 10/31/20 
*/


create table Artists(
ArtistsId int (5) NOT NULL, 
Name varchar(40)NULL,
PRIMARY KEY(ArtistsId)
);

create table Albums(
AlbumId int(6) primary key,
Name varchar(40) NOT NULL,
ArtistsId int(5),
FOREIGN KEY(ArtistsId) REFERENCES Artists (ArtistsId)
);

create table Songs(
songId int(6) primary key,
Name varchar(40) NOT NULL,
AlbumId int(6) NULL,
FOREIGN KEY(AlbumId) REFERENCES Albums(AlbumId)
);

alter table Artists modify Name varchar(40) not null;
alter table Artists add unique (Name);
alter table Artists add birthdate date;
alter table Artists add solo char(1);
alter table Albums add tracks int(2);
alter table Songs add duration decimal(4,2);
alter table Artists modify column Name varchar(30); 
alter table Artists drop column birthdate;

SHOW CREATE TABLE Artists;
SHOW CREATE TABLE Albums;
SHOW CREATE TABLE Songs;
