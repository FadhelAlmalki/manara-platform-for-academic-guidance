# Manara Platform for Academic Guidance

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.1-6DB33F?logo=springboot)
![Java](https://img.shields.io/badge/Java-17-ED8B00?logo=java)
![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?logo=mysql)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3-005F0F?logo=thymeleaf)
![Maven](https://img.shields.io/badge/Maven-3-C71A36?logo=apachemaven)

## Table of Contents

- [About](#about)
- [Demo](#demo)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Configuration](#configuration)
  - [Run Locally](#run-locally)
- [Project Structure](#project-structure)
- [Pages & Endpoints](#pages--endpoints)

## About

Manara helps high school graduates in Saudi Arabia choose the right academic path. It connects students with expert advisors, provides detailed information about colleges and universities, and offers a centralized platform for academic guidance.

![Manara Platform Home](assets/home.png)

## Demo

Watch the full walkthrough: [Senior Project.mp4](assets/Senior%20Project.mp4)

## Features

- **Academic College Page** — browse detailed information about colleges, required skills, and career opportunities.
- **Saudi Universities Page** — comprehensive list of universities in Saudi Arabia with links to their websites.
- **Academic Advisors Page** — connect with volunteer advisors who offer expert guidance.
- **Suggest a College** — submit new colleges not yet listed on the platform.
- **Become an Advisor** — advisors can register voluntarily to offer their expertise.
- **Contact Us** — reach out for support or inquiries.

## Tech Stack

| Layer        | Technology                        |
| ------------ | --------------------------------- |
| Backend      | Spring Boot 3.4.1, Java 17        |
| Frontend     | Thymeleaf, HTML, CSS              |
| Database     | MySQL 8.0                         |
| ORM          | Spring Data JPA / Hibernate       |
| Build        | Maven                             |
| Utilities    | Lombok, Spring DevTools           |

## Getting Started

### Prerequisites

- Java 17+
- MySQL 8.0+
- Maven 3+

### Configuration

Copy the example properties file and update with your database credentials:

```bash
cp src/main/resources/application-example.properties src/main/resources/application.properties
```

### Run Locally

```bash
# Clone the repository
git clone https://github.com/FadhelAlmalki/manara-platform-for-academic-guidance.git
cd manara

# Build and run
./mvnw spring-boot:run
```

The app starts at `http://localhost:8081`.

## Project Structure

```
manara/
├── src/main/java/com/seniorproject/manara/
│   ├── AdvisorsPage/          # advisor listing
│   ├── AdvisorFormPage/       # advisor registration form
│   ├── CollegeFormPage/       # suggest a college form
│   ├── CollegePage/           # college listing
│   ├── ContactUsPage/         # contact form
│   ├── HomePage/              # home controller
│   └── UniversityPage/        # university listing
├── src/main/resources/
│   ├── templates/             # Thymeleaf views
│   └── application.properties # database & app config
└── assets/                   # app screenshots and demo
```

## Pages & Endpoints

| Route                               | Description             |
| ----------------------------------- | ----------------------- |
| `/`                                 | Home page               |
| `/colleges`                         | College listings        |
| `/universities`                     | University listings     |
| `/advisors`                         | Advisor listings        |
| `/advisors/advisorForm`             | Advisor registration    |
| `/colleges/collegeForm`             | Suggest a college       |
| `/contactPage/contactUs`            | Contact form            |


