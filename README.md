# Spring Boot CRUD DevOps Assignment

## Project Overview

This project is a Spring Boot REST API for Product Catalogue Management. It demonstrates complete DevOps practices including Docker containerization, Kubernetes deployment, Git versioning, CI/CD automation, and documentation.

---

# Technologies Used

- Java 11
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Docker
- Kubernetes
- GitHub Actions
- Git

---

# Features

- Product CRUD APIs
- Product Search
- Enhanced Search with Filters
- Health Endpoint
- Global Exception Handling
- Input Validation
- Docker Multi-stage Build
- Kubernetes Deployment
- Horizontal Pod Autoscaler
- Ingress Routing
- Git Versioning

---

# Project Structure

```
spring-boot-crud-example
│
├── src
├── k8s
│   ├── deployment.yaml
│   ├── service.yaml
│   ├── ingress.yaml
│   ├── hpa.yaml
│   └── namespace.yaml
│
├── Dockerfile
├── README.md
├── CHANGELOG.md
├── SYSTEM_DESIGN.md
└── pom.xml
```

---

# API Endpoints

## Health Check

```
GET /health
```

---

## Get All Products

```
GET /products
```

---

## Get Product By ID

```
GET /product/{id}
```

---

## Add Product

```
POST /addProduct
```

---

## Update Product

```
PUT /update
```

---

## Delete Product

```
DELETE /delete/{id}
```

---

## Search Product

Version 1.1

```
GET /products/search?keyword=laptop
```

Version 2.0

```
GET /products/search?keyword=laptop&minPrice=1000&maxPrice=50000
```

---

# Local Setup

Clone Repository

```bash
git clone https://github.com/Kaif2001/spring-boot-crud-devops.git
```

Go to Project

```bash
cd spring-boot-crud-example
```

Run

```bash
mvn spring-boot:run
```

Application

```
http://localhost:9191
```

---

# Docker

Build

```bash
docker build -t spring-boot-crud:v1 .
```

Run

```bash
docker run -p 9191:9191 spring-boot-crud:v1
```

---

# Kubernetes

Create Namespace

```bash
kubectl apply -f k8s/namespace.yaml
```

Deploy Application

```bash
kubectl apply -f k8s/deployment.yaml
```

Create Service

```bash
kubectl apply -f k8s/service.yaml
```

Create HPA

```bash
kubectl apply -f k8s/hpa.yaml
```

Create Ingress

```bash
kubectl apply -f k8s/ingress.yaml
```

---

# Verify Deployment

```bash
kubectl get all -n spring-boot
```

---

# CI/CD

GitHub Actions pipeline performs:

- Build
- Test
- Docker Image Build
- Kubernetes Deployment (if configured)

---

# Logging

Spring Boot logs can be viewed using:

```bash
kubectl logs <pod-name> -n spring-boot
```

---

# Monitoring

Health Endpoint

```
/health
```

Kubernetes uses

- Readiness Probe
- Liveness Probe

---

# Version History

| Version | Description |
|----------|-------------|
| v1.0.0 | Initial Release |
| v1.1.0 | Product Search |
| v2.0.0 | Enhanced Search and Exception Handling |

---

# Author

Mohammed Kaif