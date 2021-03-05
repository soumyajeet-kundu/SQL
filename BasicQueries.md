Q1. Display the name of movies, movie type is starts with Drama.
Query-SELECT moviename,movieType FROM movie where movieType="Drama%";

Q2. Display the movies acted by actor Ayushmann.
Query-SELECT moviename FROM movie where heroName="Ayushmann";

Q3. Display the count of movies, having length above 18.
Query- SELECT count(*) from movie where length>18;

Q4. Display the movie having minimum length.
Query-SELECT MovieName From movie where length=(Select min(length) from movie);

Q5. Display all the details of movie, the language that first name starts with ‘T’.
Query- SELECT * from movie where language like "T%";

Q6. Display the movie name, hero name, heroine name whose having maximum length.
Query- SELECT movieName, heroName , heroIne from movie where length = (SELECT max(length) from movie);

Q7. Display the movie name, hero name, heroine name the movie released after 15 march 2018.
Query-SELECT movieName from movie where releaseDate>"2018-03-15";

Q8. Display the count of thriller movies.
Query-SELECT count(*) from movie where movieType like "%thriller";

Q9. Display the count of movies whose released before 15 march 2018
Query- SELECT * from movie where releaseDate<"2018-03-15";

Q10. Display the release date of the movie name ‘Zero’.
Query- SELECT releaseDate from movie where movieName="Zero";

Q11.Display the actor name that acted with ‘Amy’.
Query-SELECT heroName from movie where heroIne="Amy";

Q12.Display the Count of maximum movies released in a month of October.
Query-SELECT * from movie where monthname(releaseDate)="october";

Q13.Display the movienames whose production id for different languages.
Query-
