Employee CRUD Project — Spring Boot

A complete Employee Management CRUD Application built using Spring Boot, REST API, HTML, CSS, and JavaScript.
This project supports Create, Read, Update, and Delete (CRUD) operations for managing employee data using both API and a web interface.

------------------------------------------------------------
FEATURES
• Add new employee
• View all employees
• Update employee details
• Delete employee
• REST API using Spring Boot
• HTML + CSS + JavaScript Web UI
• Auto refresh employee table after operations
• Success and error messages shown on UI

------------------------------------------------------------
TECH STACK
Backend: Spring Boot
Language: Java
Database: MySQL
ORM: Hibernate / JPA
Build Tool: Maven
Frontend: HTML, CSS, JavaScript

------------------------------------------------------------
API ENDPOINTS
GET     /employee       - Fetch all employees
GET     /employee/{id}    - Fetch employee by ID
POST     /employee       - Add new employee
PUT     /employee/{id}    - Update employee
DELETE    /employee/{id}    - Delete employee

------------------------------------------------------------
PROJECT STRUCTURE
employee-crud-springboot/
 ├─ src/main/java/.../controller
 ├─ src/main/java/.../service
 ├─ src/main/java/.../repository
 ├─ src/main/java/.../entity
 ├─ src/main/resources/application.properties
 ├─ pom.xml
 └─ index.html

------------------------------------------------------------
HOW TO RUN THE PROJECT

Backend:
1. Open the project in IntelliJ / STS / Eclipse
2. Run: SpringBootCrudApplication.java
3. Server starts at http://localhost:8080

Frontend:
1. Open index.html in any browser
2. UI automatically communicates with backend using fetch() API

------------------------------------------------------------
AUTHOR
Aman Singh
GitHub: https://github.com/TheNameIzAman

If you like this project, please star the repository!
