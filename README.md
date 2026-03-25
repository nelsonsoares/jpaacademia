# JPA Academia 🏋️‍♂️

![Java](https://img.shields.io/badge/Java-25-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.4-green)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-blue)

> **[🇧🇷 Leia a documentação em Português aqui](README_PT_BR.md)**

## 📖 About

**JPA Academia** is a RESTful API developed to manage a gym system. It allows the registration of students, physical assessments, and enrollments using **Java**, **Spring Boot**, and **Hibernate (JPA)**.

This project was developed as part of a study on JPA (Java Persistence API) and database relationships.

## 🚀 Technologies

- **Java 25**
- **Spring Boot 4.0.4**
- **Spring Data JPA**
- **PostgreSQL**
- **Lombok**
- **Maven**
- **Jakarta Validation**

## ⚙️ How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/jpaacademia.git
   ```

2. **Configure the Database**
   Update the `src/main/resources/application.yaml` file with your PostgreSQL credentials:
   ```yaml
   spring:
     datasource:
       url: jdbc:postgresql://localhost:5432/jpaacademia
       username: YOUR_USERNAME
       password: YOUR_PASSWORD
   ```

3. **Build and Run**
   ```bash
   mvn spring-boot:run
   ```

## 📦 API Endpoints & Usage

### 📅 Date Format
This API uses the **Brazilian date format (`dd/MM/yyyy`)**.
Example input: `"15/03/1984"`.

| Method | Endpoint | Description | JSON Example |
| :--- | :--- | :--- | :--- |
| `POST` | `/alunos` | Create a new student | `{"nome": "John", "cpf": "123...", "bairro": "Center", "dataNascimento": "15/03/1990"}` |
| `GET` | `/alunos` | List all students | - |
| `POST` | `/matriculas` | Enroll a student | `{"alunoId": 1}` |
| `GET` | `/matriculas` | List all enrollments | - |

---

Developed with 💙 by [Your Name]
