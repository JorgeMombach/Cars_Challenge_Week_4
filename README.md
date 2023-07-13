# Cars_Challenge_Week_4
This project was developed by Jorge Mombach for the week 4' challenge.

It consists on the creation of 2 endpoints. One GET and one POST for a table called car_tb.

## 1. POST RESQUEST
When a POST request is made using Postman or even the IDE it should be done like this:

path = localhost:8080/cars/post

 Using the following JSON examplein the body:

 ```json
{
    "name": "X5",
    "brand": "BMW",
    "color": "Black",
    "fabricationYear": "2017/2018"
}
 ```

For this example the resulted return shoukd look like this:

"Car successfully added!"

Only 4 brands are allowed to be posted -> Ford, Chevrolet, BMW and Volvo (they can be written in upper or lower case).

Other brands won't be accepted making not possible to add a new car.

## 2. GET REQUEST
When a GET request is made it should be done like this:

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

