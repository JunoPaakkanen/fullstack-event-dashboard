# 🚀 Event Data Dashboard

> **A Full-Stack Prototype demonstrating Polyglot Persistence using Spring Boot, PostgreSQL, and Elasticsearch.**

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.0-green)
![Docker](https://img.shields.io/badge/Docker-Enabled-blue)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Relational-blue)
![Elasticsearch](https://img.shields.io/badge/Elasticsearch-NoSQL-yellow)

## 📖 Project Overview

This project is an architectural proof-of-concept designed to solve the challenge of **handling distinct data types** in a microservices environment.

The core problem addressed is scalability: transactional user data requires strict consistency, while high-volume event logs require rapid indexing and searchability. This application implements a **Hybrid Data Architecture**:
* **PostgreSQL** manages the "Source of Truth" (User profiles, transactional data).
* **Elasticsearch** acts as the high-speed engine for unstructured event logs and analytics.

## 🚧 Current Status: Backend Prototype

*This project is currently in active development.*

The **Backend Microservice** is fully functional, capable of persisting data to both databases simultaneously via Docker containers. The **Frontend Dashboard** is currently in the planning/early development phase.

## 🛠️ Tech Stack

* **Language:** Java 21
* **Framework:** Spring Boot 3 (Web, Data JPA, Data Elasticsearch)
* **Databases:**
    * **PostgreSQL:** Relational data storage.
    * **Elasticsearch:** NoSQL event indexing.
* **DevOps:** Docker & Docker Compose (Orchestration).
* **Planned Frontend:** React.js

## ⚙️ Architecture & Design

The system decouples data writes to ensure performance:
1.  **User Service:** Processes transactional requests (e.g., `Create User`) and commits to PostgreSQL.
2.  **Event Service:** Asynchronously captures side-effects (e.g., `USER_CREATED` events) and indexes them in Elasticsearch.

This separation allows the application to handle massive log volumes without degrading the performance of critical user operations.

## 🚀 Getting Started

If you want to run the backend prototype locally:

### Prerequisites
* Docker & Docker Compose
* Java 21 JDK
* Maven

### Installation
1.  **Clone the repository**
    ```bash
    git clone https://github.com/JunoPaakkanen/fullstack-event-dashboard.git
    cd fullstack-event-dashboard
    ```

2.  **Start the Infrastructure**
    Spin up the PostgreSQL and Elasticsearch containers:
    ```bash
    docker-compose up -d
    ```

3.  **Run the Application**
    ```bash
    mvn spring-boot:run
    ```

4.  **Test the API**
    You can use cURL to trigger the dual-write logic:
    ```bash
    # Create a user (Saves to Postgres -> Triggers Log to Elastic)
    curl -X POST http://localhost:8080/api/users \
    -H "Content-Type: application/json" \
    -d '{"name": "John", "email": "john@example.com"}'
    ```

## 🗺️ Roadmap

* [x] **Infrastructure:** Docker Compose environment for Polyglot Persistence.
* [x] **Backend:** Spring Boot implementation of User and Event services.
* [x] **Database:** Connection to PostgreSQL and Elasticsearch.
* [ ] **API:** Advanced search endpoints for filtering logs by date/type.
* [ ] **Frontend:** React Dashboard for visualizing event metrics.
* [ ] **CI/CD:** GitHub Actions pipeline.

## 👤 Author

**Juno Paakkanen**
* ICT Engineering Student @ Hämeen ammattikorkeakoulu, HAMK
* https://www.linkedin.com/in/juno-paakkanen-3628ba334/

---
