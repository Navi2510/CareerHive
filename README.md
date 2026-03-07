# 🎯 CareerHive

A comprehensive **Job Portal Web Application** built with Spring Boot and modern web technologies. CareerHive connects job seekers with employers, providing a seamless platform for job discovery, applications, and recruitment management.

---

## 📋 Table of Contents

- [Features](#features)
- [Tech Stack](#tech-stack)
- [Prerequisites](#prerequisites)
- [Installation & Setup](#installation--setup)
- [Running the Application](#running-the-application)
- [Project Structure](#project-structure)
- [Usage Guide](#usage-guide)
- [Contributing](#contributing)
- [License](#license)

---

## ✨ Features

### For Job Seekers
- **User Registration & Authentication** - Secure signup and login with role-based access
- **Profile Management** - Create and manage comprehensive job seeker profiles
- **Resume Upload** - Upload and store resumes (PDF support)
- **Profile Photo** - Upload profile pictures for better visibility
- **Job Search** - Advanced search with filters:
  - Search by job title and location
  - Filter by employment type (Full-Time, Part-Time, Freelance)
  - Filter by work arrangement (Remote, Office, Hybrid)
  - Filter by posting date (Today, Last 7 days, Last 30 days)
- **Job Applications** - Apply to jobs with a single click
- **Saved Jobs** - Bookmark favorite job postings for later
- **Skills Management** - Add and manage professional skills
- **Work Authorization & Employment Preferences** - Specify work eligibility and job preferences

### For Recruiters
- **Job Posting** - Create and manage job listings
- **Candidate Management** - View all applicants for posted jobs
- **Application Tracking** - Track candidate applications and status
- **Job Analytics** - View total candidates for each job posting
- **Profile Management** - Manage company information and recruiter profile
- **Delete Job Postings** - Remove job listings when needed

### General Features
- **Responsive Design** - Mobile-friendly interface using Bootstrap 5
- **Security** - Spring Security with authentication and authorization
- **Database Persistence** - MySQL for reliable data storage
- **Clean Architecture** - MVC pattern with separation of concerns

---

## 🛠 Tech Stack

### Backend
- **Framework**: Spring Boot 3.4.2
- **Java Version**: Java 21
- **Database**: MySQL
- **ORM**: Spring Data JPA (Hibernate)
- **Security**: Spring Security 6
- **Build Tool**: Maven
- **Templating**: Thymeleaf

### Frontend
- **HTML5 / CSS3 / JavaScript**
- **Bootstrap 5.3.3** - Responsive UI components
- **jQuery 3.6.0** - DOM manipulation
- **Font Awesome 6.7.2** - Icons
- **WebJars Locator** - Static resource management

### Additional Libraries
- **Validation**: Spring Validation Framework
- **Development Tools**: Spring Boot DevTools (hot reload)
- **Testing**: Spring Boot Test

---

## 📋 Prerequisites

Before you begin, ensure you have the following installed:

1. **Java Development Kit (JDK) 21**
   - Download from [Oracle JDK](https://www.oracle.com/java/technologies/downloads/#java21) or use [OpenJDK](https://openjdk.java.net/)

2. **MySQL Server 8.0 or later**
   - Download from [MySQL](https://www.mysql.com/downloads/)
   - Ensure MySQL is running on your system

3. **Maven 3.6.0 or later**
   - Download from [Maven](https://maven.apache.org/download.cgi)
   - Or use your IDE's built-in Maven

4. **Git** (Optional, for version control)
   - Download from [Git](https://git-scm.com/)

5. **IDE** (Recommended)
   - IntelliJ IDEA, Eclipse, or VS Code with Java extensions

---

## 🚀 Installation & Setup

### Step 1: Clone the Repository

```bash
git clone https://github.com/Navi2510/CareerHive.git
cd CareerHive
