
# 🚀 Intern Portal Backend

This repository contains the **backend service** for the Intern Portal web application. It provides RESTful APIs that deliver intern data, referral performance, and leaderboard statistics to the frontend.

---

## 📌 Project Overview

This backend handles the following key responsibilities:

- Serving **dummy intern profile data** (name, referral code, donations, etc.)
- Serving **dummy leaderboard data** with rank, performance, and stats
- Connecting to **MongoDB database** (can be local or MongoDB Atlas)
- Providing APIs consumed by the React frontend

---

## 🛠️ Tech Stack

- **Java 21**
- **Spring Boot 3**
- **MongoDB** – NoSQL database for storing leaderboard and intern data
- **Spring Data MongoDB** – For database interaction
- **Lombok** – Simplifies Java boilerplate (getters/setters/constructors)
- **Maven** – Build and dependency management

---

## 🔌 API Endpoints

| Method | Endpoint              | Description                           |
|--------|-----------------------|---------------------------------------|
| `GET`  | `/api/leaderboard`    | Returns all leaderboard entries       |
| `GET`  | `/api/intern`         | Returns current intern's profile data |

Both endpoints return dummy/static data fetched from MongoDB.

---

## 🧩 MongoDB Schema

### 📄 LeaderboardEntry

```json
{
  "_id": "ObjectId",
  "rank": 1,
  "name": "Sarah Chen",
  "referralCode": "sarah2025",
  "donationsRaised": 28500,
  "referrals": 42
}
```

### 📄 InternProfile

```json
{
  "_id": "ObjectId",
  "name": "John Doe",
  "referralCode": "john2025",
  "donationsRaised": 15000,
  "referrals": 21
}
```

---

## 🧪 Sample Response (GET /api/leaderboard)

```json
[
  {
    "rank": 1,
    "name": "Sarah Chen",
    "referralCode": "sarah2025",
    "donationsRaised": 28500,
    "referrals": 42
  },
  {
    "rank": 2,
    "name": "Michael Rodriguez",
    "referralCode": "mike2025",
    "donationsRaised": 24800,
    "referrals": 38
  }
]
```

---

## ⚙️ Getting Started Locally

1. **Clone the repository**

```bash
git clone (https://github.com/jatin-ukey21/Backend-internPortal)
cd intern-portal-backend
```

2. **Set up MongoDB**

- Either install and run MongoDB locally at:
  
  ```bash
  mongodb://localhost:27017/internportal
  ```

- Or use **MongoDB Atlas**, and set the URI in:

```properties
# application.properties
spring.data.mongodb.uri=mongodb+srv://<username>:<password>@cluster.mongodb.net/internportal
```

3. **Build and run the project**

```bash
./mvnw spring-boot:run
```

4. **Verify endpoints**

- Open browser or Postman:

  - http://localhost:8080/api/leaderboard
  - http://localhost:8080/api/intern

---

## 📂 Project Structure

```
src/
├── config/
│   └── DummyDataSeeder.java
├── controller/
│   ├── InternController.java
│   └── LeaderboardController.java
├── DTO/
│   ├── InternDTO.java
│   └── LeaderboardEntryDTO.java
├── entities/
│   └── LeaderboardEntry.java
├── repositories/
│   └── LeaderboardRepository.java
├── services/
│   ├── InternService.java
│   └── LeaderboardService.java
└── BackendInternPortalApplication.java
```

---

### 🔗 Frontend Repository

[Link to Frontend Repo](https://github.com/jatin-ukey21/Frontend-internPortal)

---

Thank you for reviewing this backend service! ⚙️🔥
