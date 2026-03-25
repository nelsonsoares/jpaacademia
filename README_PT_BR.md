# JPA Academia 🏋️‍♂️

![Java](https://img.shields.io/badge/Java-25-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.4-green)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-blue)

> **[🇺🇸 Read the documentation in English here](README.md)**

## 📖 Sobre

**JPA Academia** é uma API RESTful desenvolvida para gerenciar um sistema de academia. Ela permite o cadastro de alunos, avaliações físicas e matrículas utilizando **Java**, **Spring Boot** e **Hibernate (JPA)**.

Este projeto foi desenvolvido como parte de um estudo sobre JPA (Java Persistence API) e relacionamentos de banco de dados.

Este projeto foi proposto pela formação Java da **DIO** do módulo sobre: **Conhecendo o Spring DataJPA na Prática**.

## 🚀 Tecnologias

- **Java 25**
- **Spring Boot 4.0.4**
- **Spring Data JPA**
- **PostgreSQL**
- **Lombok**
- **Maven**
- **Jakarta Validation**

## ⚙️ Como Executar

1. **Clone o repositório**
   ```bash
   git clone https://github.com/seu-usuario/jpaacademia.git
   ```

2. **Configure o Banco de Dados**
   Atualize o arquivo `src/main/resources/application.yaml` com suas credenciais do PostgreSQL:
   ```yaml
   spring:
     datasource:
       url: jdbc:postgresql://localhost:5432/jpaacademia
       username: SEU_USUARIO
       password: SUA_SENHA
   ```

3. **Construa e Execute**
   ```bash
   mvn spring-boot:run
   ```

## 📦 Endpoints e Uso da API

### 📅 Formato de Data
Esta API utiliza o **formato Brasileiro de data (`dd/MM/yyyy`)**.
Exemplo de entrada: `"15/03/1984"`.

| Método | Endpoint | Descrição | Exemplo JSON |
| :--- | :--- | :--- | :--- |
| `POST` | `/alunos` | Cadastra um novo aluno | `{"nome": "João", "cpf": "123...", "bairro": "Centro", "dataNascimento": "15/03/1990"}` |
| `GET` | `/alunos` | Lista todos os alunos | - |
| `POST` | `/matriculas` | Realiza a matrícula de um aluno | `{"alunoId": 1}` |
| `GET` | `/matriculas` | Lista todas as matrículas | - |

---

Desenvolvido com 💙 por Nelson Soares
