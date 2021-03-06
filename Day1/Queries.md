<b>Q1. Display the name of movies, movie type is starts with Drama.</b>

Query-SELECT moviename,movieType FROM movie where movieType="Drama%";
<br>

<b>Q2. Display the movies acted by actor Ayushmann.</b>

Query-SELECT moviename FROM movie where heroName="Ayushmann";
<br>

<b>Q3. Display the count of movies, having length above 18.</b>

Query- SELECT count(*) from movie where length>18;
<br>

<b>Q4. Display the movie having minimum length.</b>

Query-SELECT MovieName From movie where length=(Select min(length) from movie);
<br>

<b>Q5. Display all the details of movie, the language that first name starts with ‘T’.</b>

Query- SELECT * from movie where language like "T%";
<br>

<b>Q6. Display the movie name, hero name, heroine name whose having maximum length.</b>

Query- SELECT movieName, heroName , heroIne from movie where length = (SELECT max(length) from movie);
<br>

<b> Q7. Display the movie name, hero name, heroine name the movie released after 15 march 2018.</b>

Query-SELECT movieName from movie where releaseDate>"2018-03-15";
<br>

<b>Q8. Display the count of thriller movies.</b>

Query-SELECT count(*) from movie where movieType like "%thriller";
<br>

<b>Q9. Display the count of movies whose released before 15 march 2018</b>

Query- SELECT * from movie where releaseDate<"2018-03-15";
<br>

<b>Q10. Display the release date of the movie name ‘Zero’.</b>

Query- SELECT releaseDate from movie where movieName="Zero";
<br>

<b>Q11.Display the actor name that acted with ‘Amy’.</b>

Query-SELECT heroName from movie where heroIne="Amy";
<br>

<b>Q12.Display the Count of maximum movies released in a month of October.</b>

Query-SELECT * from movie where monthname(releaseDate)="october";
<br>

<b>Q13.Display the movienames whose production id for different languages.</b>

Query-


<br><br>
-------------------Advanced Queries----------------------

<b>1.Write the query to display productionid, production name with total number movies produced by each.</b> 

Query: select p.productionId, m.movieName, count(m.productionId) from movies as m inner join productions as p on p.productionId=m.productionId group by p.productionId;

<b>2.Write the query to display production name, owner name have produced more than 2 movies. </b>

Query: select p.ownerName,p.productionId ,p.productionName, count(m.movieName) from productions as p left join movie as m ON p.Productionid = m.Productionid group by p.productionId having count(movieName)>=2;

<b>3.Write the query to display production name, owner name have produced maximum movies.</b> 

Query: select p.productionId ,p.productionName, max(mv.movieName) from productions as p left join movies as mv ON p.productionId = mv.productionId group by p.productionId ORDER BY 'productionId' DESC LIMIT 1;

<b>4.Write the query to display the moviename, heroname and productionname acted in the producer name= ’Subaskaran’.</b> 

Query: select p.productioName, m.movieName, m.heroName, m.language from productions as p left join movies as m on p.productionId = m.productionId where language !='Subaskaran';

<b>5.Write the query to display the moviename, heroname whose productionid ends with 82.</b> 

Query: select p.productionName, m.Moviename, m.heroName, m.language, m.productionId from productions as p left join movies as m on p.productionId = m.productionId where p.productionId like "%82";

<b>6.Write the query to display the productionname, ownername who has not produced the movie. </b>

Query: select p.productionName, p.ownerName from productions as p left join movie as m on p.productionId = m.productionId group by p.productionId having count(m.movieName)=0;

<b>7.Write the query to display the productionname, ownername who has not produced the ‘hindi’ movie. </b>

Query: select p.productionName, m.movieName, m.heroName, m.language from productions as p left join movies as m on p.productionId = m.productionId where language !='hindi';


<b>8.Write the query name to display the heroinename who acted in the different productions but not in same production id.

Ans: Amy </b>

<b>9.Write the query to display the heroname who acted in maximum languages. </b>

Query: Select p.productionId ,m.heroName, max(m.language) from productions as p left join movie as m ON p.productionId = m.productionId group by m.heroName;

<b> 10.Write the query to display the production name, owner name who has produced movie for more languages. </b>
Query:

<b>11.Write the query to display the productionname, producername who has not produced any movie </b>

Query: select p.productionName, p.ownerName from productions as p left join movies as m on p.productionId = m.productionId group by p.productionId having count(m.movieName)=0;
