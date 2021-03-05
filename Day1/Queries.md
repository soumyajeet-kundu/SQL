<b>Q1. Display the name of movies, movie type is starts with Drama.<b>

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


-------------------Advanced Queries----------------------

1.Write the query to display productionid, production name with total number movies produced by each. Query: select p.productionid, m.moviename, count(m.productionid) from movies as m inner join productions as p on p.productionid=m.productionid group by p.productionid;

2.Write the query to display production name, owner name have produced more than 2 movies. Query: select p.Ownername,p.Productionid ,p.Productionname, count(m.Movienname) from productions as p left join movie as m ON p.Productionid = m.Productionid group by p.Productionid having count(Movienname)>=2;

3.Write the query to display production name, owner name have produced maximum movies Query: select p.Productionid ,p.Productionname, max(mv.Moviename) from productions as p left join movies as mv ON p.Productionid = mv.Productionid group by p.Productionid ORDER BY 'Productionid' DESC LIMIT 1;

4.Write the query to display the moviename, heroname and productionname acted in the producer name= ’Subaskaran’. Query: select p.Productionname, m.Moviename, m.Heroname, m.language from productions as p left join movies as m on p.productionid = m.Productionid where language !='Subaskaran';

5.Write the query to display the moviename, heroname whose productionid ends with 82. Query: select p.Productionname, m.Moviename, m.Heroname, m.language, m.productionid from productions as p left join movies as m on p.productionid = m.Productionid where p.productionid like "%82";

6.Write the query to display the productionname, ownername who has not produced the movie. Query: select p.Productionname, p.Ownername from productions as p left join movie as m on p.Productionid = m.Productionid group by p.productionid having count(m.Movienname)=0;

7.Write the query to display the productionname, ownername who has not produced the ‘hindi’ movie. Query: select p.Productionname, m.Moviename, m.Heroname, m.language from productions as p left join movies as m on p.productionid = m.Productionid where language !='hindi';

8.Write the query name to display the heroinename who acted in the different productions but not in same production id.

Ans: Amy

9.Write the query to display the heroname who acted in maximum languages. Query: Select p.Productionid ,m.Heroname, max(m.Language) from productions as p left join movie as m ON p.Productionid = m.Productionid group by m.Heroname;

10.Write the query to display the production name, owner name who has produced movie for more languages. Query:

11.Write the query to display the productionname, producername who has not produced any movie Query: select p.productionname, p.ownername from productions as p left join movies as m on p.productionid = m.productionid group by p.productionid having count(m.moviename)=0;
