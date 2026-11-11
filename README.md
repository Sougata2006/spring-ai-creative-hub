# Spring AI Creative Hub

An AI-powered application built with **Spring Boot** and **Spring AI**, bringing multiple generative AI capabilities together in one platform.

## Overview

Spring AI Creative Hub is a project focused on exploring and integrating Generative AI capabilities into a Spring Boot application.

The goal is to build a platform that makes everyday creative tasks easier through AI-powered generation.

## Features

### Implemented

- **AI Message Generation** – Generate AI-powered responses using natural language prompts.
- **Configurable AI Responses** – Customize model options such as the AI model and maximum token limit.
- **AI Image Generation** – Generate images using text prompts.
- **Dynamic Image Generation Parameters** – Customize image quality, number of images, width and height.
- **REST API Integration** – Expose AI functionality through Spring Boot REST endpoints.

### Upcoming

- **Recipe Generation** – Generate recipes based on available ingredients and user preferences.

## Tech Stack

| Technology | Purpose |
|---|---|
| Java | Backend programming language |
| Spring Boot | Backend application framework |
| Spring AI | Generative AI integration |
| OpenAI API | AI text and image generation |
| Maven | Dependency management and build automation |

## Project Structure

```text
src/
 ├── main/
 │    ├── java/
 │    │    └── com/ai/SpringAI/
 │    │         ├── ChatService.java
 │    │         ├── ImageService.java
 │    │         ├── GenAIController.java
 │    │         └── SpringAiApplication.java
 │    │
 │    └── resources/
 │         └── application.properties
 │
 └── test/
```

## API Endpoints

### 1. AI Response Generation

Generate AI responses using a text prompt.

### 2. AI Response with Custom Options

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

Supports configurable model options such as model selection and maximum token limit.

### 3. AI Image Generation

Generate images based on user-provided text prompts.

**Endpoint:** `/generate-image`

**Method:** `GET`

**Query Parameters:**

| Parameter | Type | Default | Description |
|---|---|---|---|
| prompt | String | Required | Image generation prompt |
| quality | String | hd | Generated image quality |
| n | Integer | 1 | Number of images |
| width | Integer | 1024 | Image width |
| height | Integer | 1024 | Image height |

Example:

```http
GET /generate-image?prompt=A futuristic city&quality=hd&n=1&width=1024&height=1024
```

The endpoint generates an image and redirects the client to the generated image URL.

*Note: Available image options depend on the selected image model.*

## Getting Started

### Prerequisites

- Java JDK
- Maven (or use the included Maven Wrapper)
- IntelliJ IDEA or another Java IDE
- An OpenAI API key with available API credits

### Clone the Repository

```bash
git clone https://github.com/Sougata2006/spring-ai-creative-hub.git

cd spring-ai-creative-hub
```

### Configure API Key

Set your OpenAI API key as an environment variable.

**Windows PowerShell:**

```powershell
$env:OPENAI_API_KEY="your_api_key"
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

The initial Spring Boot backend setup and the following AI integrations have been implemented:

- AI-powered text generation with configurable model options.
- AI-powered image generation.
- Dynamic image generation parameters.
- REST API endpoints for interacting with AI services.

Recipe generation is planned for the next development phase.

The project is being developed incrementally, with new features and documentation added as development progresses.

## Author

**Sougata Paul**

- GitHub: [@Sougata2006](https://github.com/Sougata2006)
- Repository: [Spring AI Creative Hub](https://github.com/Sougata2006/spring-ai-creative-hub)

---

⭐ If you find this project interesting, feel free to explore the repository!