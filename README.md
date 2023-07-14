# Cars_Challenge_Week_4
This project was developed by Jorge Mombach for the week 4' challenge.

It consists on the creation of 2 endpoints -> one GET and one POST, using a table called car_tb in the MySQL databse.

It was made using Java 11, Maven (to manage dependencies), SpringBoot 2.7.13 and MySQL 8.

This dependencies were used in the project:
- Spring web
- MySQL driver
- Spring Data JDBC
- Spring Data JPA

The project was made in accordance with the following rules:

- idChassi: (type:long(this should be the primary key of your table andunique)

- name: (type:String)

- brand : (type:String, must accept only Ford, Chevrolet, BMW, Volvo)

- color: (type:String)

- fabricationYear: (type:String)

●Rule 1 - The “brand” field should accept only thebrands(Ford,Chevrolet,BMW,Volvo) and in case of sending another field that is not these 4 brands, send an exception and not let the request execute successfully.

●Rule 2 - The above payload must be registered in thedatabase.

●Rule 3 - When a GET is called, the IdChassi must be passed and the corresponding car saved by the POST in the database must be returned.

●Rule 4 - Nulls must not be saved in the database or returned in the OUTPUT or ENTRY DTOs, this validation must occur and in case of null, throw an exception as described above.

●Rule 5 - Projects that do not have the correct database configuration will have a discounted grade.

●Rule 6 - The fields must be in English like the payload above.

●Rule 7 - The controller, service and repository needs to use the semantic components annotations

## 1. POST RESQUEST
When a POST request is made using Postman or even the IDE it should look like this:

path = localhost:8080/cars/post

 Using the following JSON example in the body:

 ```json
{
    "name": "X5",
    "brand": "BMW",
    "color": "Black",
    "fabricationYear": "2017/2018"
}
 ```

For this example the resulted return should look like this:

"Car successfully added!"

Only 4 brands are allowed to be posted -> Ford, Chevrolet, BMW and Volvo (they can be written in upper or lower case).

Other brands won't be accepted making not possible to add a new car.

## 2. GET REQUEST
When a GET request is made it should look like this:

path = localhost:8080/cars/get/{idChassi}

Notice that in orther for this to run you should use the id created in the post above. ex. /cars/get/1

The expected result should look like this:

 ```json
{
    "idChassi": 1,
    "name": "X5",
    "brand": "BMW",
    "color": "Black",
    "fabricationYear": "2017/2018"
}
 ```

