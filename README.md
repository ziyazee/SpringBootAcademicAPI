# Spring Boot Rest API

An API is developed for storing and retrieving Academics information

# Language

* Java

# Frameworks

* Spring Boot

# Other technologies

 * web
 * JPA
 * H2

# Installations

* java 1.8
* maven

# How to deploy

* Clone the repo  
* Run the following commands
    * mvn install
    * java -jar target/AcademicsInfoAPI-0.0.1-SNAPSHOT.jar
* Open the browser and run localhost:8080

# Usage

The API has 3 categories:

* department
* faculty
* student

#### Student

Post request:  
`localhost:8080/students`

Get request:  
`localhost:8080/students`       
`localhost:8080/students/{usn}`


#### Faculty

Post request:  
`localhost:8080/faculties`

Get request:  
`localhost:8080/faculties`  
`localhost:8080/faculties/{usn}`

####  Department

Get request:  
`localhost:8080/department`  
`localhost:8080/department/branch/{branch}`  
`localhost:8080/department/year/{year}`


eg: `localhost:8080/department/branch/ise`
