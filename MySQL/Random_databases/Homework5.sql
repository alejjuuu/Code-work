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