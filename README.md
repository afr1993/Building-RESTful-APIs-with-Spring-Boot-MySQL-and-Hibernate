Library Management API

A RESTful API for managing a collection of books in a library, built with Spring Boot, Hibernate, and MySQL.

---

Technologies Used

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA (Hibernate)
- MySQL
- Maven
---
  Setup Instructions

1. Clone the repository

```bash
git clone https://github.com/your-username/library-api.git
cd library-api

2. Set up the MySQL database
Create a database named library_management:

sql

CREATE DATABASE library_management;
3. Configure the database connection
Update the application.properties file in src/main/resources:

properties

spring.datasource.url=jdbc:mysql://localhost:3306/librarydb
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

4. Run the application
Use Maven to build and run:

bash
Copiar
Editar
./mvnw spring-boot:run

API Endpoints
Method	Endpoint	Description
GET	/books	Get a list of all books
GET	/books/{id}	Get a specific book by ID
POST	/books	Add a new book
PUT	/books/{id}	Update an existing book
DELETE	/books/{id}	Delete a book by ID

Sample POST /books Request
json
{
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "isbn": "9780132350884",
  "publishedDate": "2008-08-01"
}
