# Spring AI Creative Hub

An AI-powered application built with **Spring Boot** and **Spring AI**, bringing multiple generative AI capabilities together in one platform.

## Overview

Spring AI Creative Hub is a project focused on exploring and integrating Generative AI capabilities into a Spring Boot application.

The goal is to build a platform that makes everyday creative tasks easier through AI-powered generation.

## Features

### Implemented

- **AI Message Generation** – Generate AI-powered responses using natural language prompts.
- **Configurable AI Responses** – Customize model options such as the AI model and maximum token limit.
- **REST API Integration** – Expose AI functionality through Spring Boot REST endpoints.

### Upcoming

- **Recipe Generation** – Generate recipes based on available ingredients and user preferences.
- **Photo Generation** – Generate images using AI based on text prompts.

## Tech Stack

| Technology | Purpose |
|---|---|
| Java | Backend programming language |
| Spring Boot | Backend application framework |
| Spring AI | Generative AI integration |
| OpenAI API | AI-powered text generation |
| Maven | Dependency management and build automation |

## Project Structure

```text
src/
 ├── main/
 │    ├── java/
 │    │    └── com/ai/SpringAI/
 │    │         ├── ChatService.java
 │    │         ├── GenAIController.java
 │    │         └── SpringAiApplication.java
 │    │
 │    └── resources/
 │         └── application.properties
 │
 └── test/
```

## API Endpoints

### AI Response Generation

Generate AI responses using a text prompt.

### AI Response with Custom Options

**Endpoint:** `/ask-ai-options`

**Method:** `GET`

**Query Parameter:**

| Parameter | Type | Description |
|---|---|---|
| prompt | String | Input prompt for AI generation |

Example:

```http
GET /ask-ai-options?prompt=Suggest a healthy breakfast
```

The endpoint uses configurable model options for generating responses.

## Getting Started

### Prerequisites

- Java JDK
- Maven (or use the included Maven Wrapper)
- IntelliJ IDEA or another Java IDE
- An OpenAI API key

### Clone the Repository

```bash
git clone https://github.com/Sougata2006/spring-ai-creative-hub.git

cd spring-ai-creative-hub
```

### Configure API Key

Set your OpenAI API key as an environment variable:

```text
OPENAI_API_KEY=your_api_key
```

Configure it in `application.properties`:

```properties
spring.ai.openai.api-key=${OPENAI_API_KEY}
```

**Important:** Never commit API keys or sensitive credentials to GitHub.

### Run the Application

Using Maven Wrapper:

**Windows:**

```powershell
.\mvnw.cmd spring-boot:run
```

**Linux / macOS:**

```bash
./mvnw spring-boot:run
```

## Project Status

**Backend – Phase 1 completed.**

The initial Spring Boot backend setup and AI-powered text generation integration have been implemented.

Additional AI capabilities, including recipe and image generation, are planned for upcoming development phases.

## Author

**Sougata Paul**

- GitHub: [@Sougata2006](https://github.com/Sougata2006)
- Repository: [Spring AI Creative Hub](https://github.com/Sougata2006/spring-ai-creative-hub)

---

⭐ If you find this project interesting, feel free to explore the repository!