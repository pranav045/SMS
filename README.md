# 📘 Student Management System (SMS)

A **Spring Boot REST API project** built with **Maven** for managing students, courses, and enrollments.  
Demonstrates layered architecture with **Entity, Repository (DAO), DTO, Service, Controller, and Exception** packages.

---

## 🚀 Features
- Student CRUD operations (Create, Read, Update, Delete)
- Course & Enrollment management
- Input validation and global exception handling
- RESTful API design with standardized responses
- PostgreSQL/MySQL integration with JPA/Hibernate

---

## 🛠️ Tech Stack
- **Backend Framework**: Spring Boot  
- **Build Tool**: Maven  
- **Database**: PostgreSQL/MySQL  
- **ORM**: Hibernate/JPA  
- **API Testing**: Postman / Swagger UI  
- **Version Control**: Git/GitHub  

---

## 📂 Project Structure

---

## 🔑 Layered Architecture

| Layer              | Responsibility |
|--------------------|----------------|
| **Entity**         | Defines database tables using JPA annotations (e.g., `Student`, `Course`). |
| **DAO**      | Traditional Data Access Objects. Encapsulates custom SQL queries or complex persistence logic beyond simple CRUD. Often used when JPA repositories are insufficient. |
| **Repository** | Spring Data abstraction (`JpaRepository`, `CrudRepository`). Provides ready‑made CRUD operations and query methods without boilerplate code. |
| **DTO**            | Data Transfer Objects for clean API request/response handling. |
| **Service**        | Contains business logic, interacts with DAO/Repository, returns DTOs. |
| **Controller**     | REST endpoints (`@RestController`) exposing APIs to clients. |
| **Exception**      | Centralized error handling with custom exceptions and `@ControllerAdvice`. |
---

## 📌 API Endpoints (Examples)

- `POST /api/students` → Add new student  
- `GET /api/students/{id}` → Get student by ID  
- `PUT /api/students/{id}` → Update student details  
- `DELETE /api/students/{id}` → Delete student  
- `GET /api/courses` → List all courses  

---

## ⚙️ Setup & Run

1. Clone the repo:  
   ```bash
   git clone https://github.com/your-username/sms-springboot.git
   
---

This format is **GitHub‑optimized**: clean headings, code blocks, tables, and examples.  
