# Spring Boot Starter Project

##  Introduction
-   This project contains template with basic structure for Spring Boot.
-   Project is build with` maven` build tool. It can be easily upgraded to `gradle` if required.
-   The template contains default configration of spring boot and servlet container. These configurations can be modified  using  `application.properties` file is present in project structure.
-   The template is provided with basic Health Check Api to check if the project is deployed and working correctly.
-   Demo test Case for Health Check Api is also included in the template. This can help to create test cases for other features.
-   Spring Boot Starter Project also includes implementation of simple CRUD operations with a `USER` entity.
-   API flow is  `Controller -> Service -> Repository`.
-   User request will hit on backend  `Controller`.
-   `Service` class contains implementation of API provided in  `Controller`.
-   `Repository` is an interface to support database operation through  [JPA](https://docs.spring.io/spring-data/jpa/docs/1.3.4.RELEASE/reference/html/jpa.repositories.html).
-   To learn more about CRUD operation please check [this](https://examples.javacodegeeks.com/enterprise-java/spring/boot/spring-boot-crud-operations-example/) tutorial.

## Default features
-   A simple web application built using Spring Boot.
-   A health check API to monitor the functionaing of the project.

## What is required
-   IntelliJ IDEA
-   Java installed with version 8 or higher
-   Maven

## Creating Spring Boot Starter Project
-   [Using Spring.io initializer](https://www.javacodegeeks.com/2018/02/create-spring-boot-project-spring-initializer.html)
-   [Using IntelliJ or any similar IDE and Maven simple project](https://www.jetbrains.com/help/idea/spring-boot.html)
-   [Using Spring Tool Suite](https://www.javatpoint.com/creating-spring-boot-project-using-sts)
-   [Using CLI](https://www.tutorialspoint.com/springbootcli/springbootcli_creating_project.htm)

## Creating Spring Boot Application
-   Spring Boot creates `Stane-ALone` Application. It means it is not required to install Tomcat Sever on your own (Perks of using Spring Boot 😉). Learn more about this feature from [here](https://dzone.com/articles/what-is-spring-boot#:~:text=Being%20Standalone,applications%20that%20you%20can%20run.&text=You%20may%20think%20that%20running,run%20command%20and%20everything%20works.).
-   Default Port to run an application is 8080. We can change the port of application in the `application.properties` file. Check the `application.properties` file to check port configuration changed by me.Check more details for `application.properties`  from  [here](https://www.javatpoint.com/spring-boot-properties).

## Database configuration 
-   Create a PostgreSQL database with the name  `SPRINGBOOT_STARTER` and add the credentials to `application.properties`. <br/>

-   The default credentials and driver followed for this project :<br/>
    ```spring.datasource.driver-class-name=org.postgresql.Driver
    spring.datasource.url=jdbc:postgresql://localhost:6001/SPRINGBOOT_STARTER
    spring.datasource.username=postgres
    spring.datasource.password=root
    spring.jpa.show-sql=true

-   You can change database from postgreSQL to MySQL/Oracle by just changing these properties mentioned in `application.properties`. <br/>

## CRUD API Guide

1.  To Create New USER use following url with POST Request
```json
   http://localhost:8088/user/add`
```
> set content type as in header as application/json
> set request body as raw with JSON payload

```json
 {
    "name": "ekta",
    "emailAddress": "ektatankgmail.com",
    "phoneNumber": "9999922222"
}
```
2.  To get list of all USER following endpoint with GET Request
```json
  http://localhost:8088/user/users
```
3.  To get a particular  USE using userid, use following url with GET request
```json
  http://localhost:8088/user/id/{userId}
```
4.  To get a particular  USER using username, use following url with GET request
```json
  http://localhost:8088/user/name/{userName}
```
5.  To update USER in database, use following url with PUT request
```json
   http://localhost:8088/user/update
```
> set content type as in header as application/json for PUT request
> set request body as raw with JSON payload to update user

```json
 {
    "userId": 4,
    "name": "Ekta Tank",
    "phoneNumber": "9999999999 ",
    "emailAddress": "ektatank@gmail.com"
}
```
6.  To delete list of all USER following endpoint with DELETE Request
```json
  http://localhost:8088/user/delete/users
```
7.  To delete a particular USER using userid, use following url with DELETE request
```json
  http://localhost:8088/user/delete/id/{userId}
```
8.  To delete a particular USER using username, use following url with DELETE request
```json
  http://localhost:8088/user/delete/name/{userName}
```
