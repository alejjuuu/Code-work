
1)	Display the title of all movies with a female director.

select movie.title "title", director.gender "Gender"
from movie, moviedirector, director
where movie.movieid = moviedirector.movieid
and director.directorid = moviedirector.directorid
and director.gender = 'F';

2)	Display the firstname and
lastname of each director of the movie with a title “Avengers: Endgame”.

select firstname, lastname, movie.title
from director, moviedirector, movie
where director.directorid = moviedirector.directorid
and movie.movieid = moviedirector.movieid
and movie.title ='Avengers: Endgame';

3)	Display each movie title, reviewer, and number of stars.

select title, reviewer, stars
from movie, review
where review.movieid = movie.movieid;


4)	Display the average budget for all movies released in 2018.

select avg(budget)
from movie
where releasedate like '%2018';


5.	Display a list of all movie titles,
role, and actor last name for actors in all movies.

select title, cast.role, actor.lname
from movie, cast, actor
where movie.movieid = cast.movieid
and cast.actorid = actor.actorid;

6.	Display a list of movie titles that have received 1 or 2 star revsiews.

select title, stars
from movie, review
where review.movieid = movie.movieid
and review.stars = 1 and review.stars =2;

7.	Display a list of movie titles that are not in the English language.

select language
from movie
where language != 'English';

8.	Display the first and last name
of all actors that do not have a dateofbirth listed.

select fname, lname
from actor
where dateofbirth = NULL;

9.	Display a list of movie titles, director first and
 last name under the heading “Director Name”, and actors’
 fname and lname under the heading “Actor Name”.  Order the output
  by movie title.

select title'Title', concat(director.firstname,' ', director.lastname) "Director name",
concat(actor.fname,' ',actor.lname) "Actor name"
from movie, moviedirector, director, cast, actor
where movie.movieid = cast.movieid
and cast.actorid = actor.actorid
and movie.movieid = moviedirector.movieid
and moviedirector.directorid = director.directorid;


10.	Display a list of actor lname and dateofbirth.
 Format the dateofbirth like 05/14/2019.

select lname'Last name', date_format(dateofbirth,'%d/%m/%y')'Date'
from actor;
