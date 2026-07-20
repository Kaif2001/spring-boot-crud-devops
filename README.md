# Spring Boot CRUD DevOps Assignment

## Project Overview

This project is a Spring Boot REST API for Product Catalogue Management. It demonstrates complete DevOps practices including Docker containerization, Kubernetes deployment, Git versioning, GitHub Actions CI/CD automation, and documentation.

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
- Horizontal Pod Autoscaler (HPA)
- NGINX Ingress Routing
- Git Versioning

---

# Project Structure


spring-boot-crud-example
│
├── .github
│   └── workflows
│       └── ci.yml
│
├── k8s
│   ├── deployment.yaml
│   ├── service.yaml
│   ├── namespace.yaml
│   ├── ingress.yaml
│   ├── hpa.yaml
│   │
│   ├── product-v1
│   │   ├── deployment.yaml
│   │   ├── service.yaml
│   │   ├── namespace.yaml
│   │   ├── ingress.yaml
│   │   └── hpa.yaml
│   │
│   ├── product-v1-1
│   │   ├── deployment.yaml
│   │   ├── service.yaml
│   │   ├── namespace.yaml
│   │   ├── ingress.yaml
│   │   └── hpa.yaml
│   │
│   └── product-v2
│       ├── deployment.yaml
│       ├── service.yaml
│       ├── namespace.yaml
│       ├── ingress.yaml
│       └── hpa.yaml
│
├── screenshots
│   ├── 01-github-home.png
│   ├── 02-github-actions.png
│   ├── 03-github-tags.png
│   ├── 04-dockerhub-images.png
│   ├── ...
│   └── 15-search-api-v2.png
│
├── src
├── Dockerfile
├── CHANGELOG.md
├── README.md
├── SYSTEM_DESIGN.md
├── pom.xml
└── .gitignore

---

# API Endpoints

## Health Check

```
GET /health
```

## Get All Products

```
GET /products
```

## Get Product By ID

```
GET /product/{id}
```

## Add Product

```
POST /addProduct
```

## Update Product

```
PUT /update
```

## Delete Product

```
DELETE /delete/{id}
```

---

# Product Search

## Version 1.1

```
GET /products/search?keyword=laptop
```

## Version 2.0

```
GET /products/search?keyword=laptop&minPrice=1000&maxPrice=50000
```

---

# Git Versions

| Version | Description |
|----------|-------------|
| v1.0.0 | Basic CRUD + Health API |
| v1.1.0 | Product Search |
| v2.0.0 | Advanced Search + Validation + Exception Handling |

---

# Docker

Build Image

```bash
docker build -t kaif3108/spring-boot-crud:v2.0.0 .
```

Run Container

```bash
docker run -p 9191:9191 kaif3108/spring-boot-crud:v2.0.0
```

---

# Kubernetes Deployment

## Version 1

```bash
kubectl apply -f k8s/product-v1/
```

## Version 1.1

```bash
kubectl apply -f k8s/product-v1-1/
```

## Version 2

```bash
kubectl apply -f k8s/product-v2/
```

---

# Verify Resources

```bash
kubectl get namespaces
kubectl get pods --all-namespaces
kubectl get deployments --all-namespaces
kubectl get svc --all-namespaces
kubectl get ingress --all-namespaces
kubectl get hpa --all-namespaces
```

---

# CI/CD

GitHub Actions automatically performs:

- Checkout Repository
- Run Maven Tests
- Build Project
- Build Docker Image
- Push Docker Image to Docker Hub
- Kubernetes Deployment Placeholder
- Post Deployment Health Check Placeholder

---

# Monitoring

Health Endpoint

```
GET /health
```

Kubernetes Monitoring

- Readiness Probe
- Liveness Probe
- Horizontal Pod Autoscaler

---

# Docker Images

Docker Hub Repository

```
kaif3108/spring-boot-crud
```

Available Tags

- v1.0.0
- v1.1.0
- v2.0.0

---

# Documentation

- README.md
- CHANGELOG.md
- SYSTEM_DESIGN.md

---

# Screenshots

Project execution screenshots are available in the `screenshots` folder.

Included screenshots:

- GitHub Repository
- GitHub Actions
- GitHub Tags
- Docker Hub Images
- Project Structure
- Kubernetes Pods
- Kubernetes Deployments
- Kubernetes Services
- Kubernetes Ingress
- Kubernetes HPA
- Kubernetes Namespaces
- Health API
- Get Products API
- Search API (Version 1.1)
- Search API (Version 2.0)

---

# Author

**Mohammed Kaif**

---

# Assignment Status

✅ Docker Containerization

✅ Multi-stage Docker Build

✅ Git Versioning

✅ CHANGELOG

✅ GitHub Actions CI/CD

✅ Kubernetes Deployment

✅ Namespace Isolation

✅ HPA

✅ Ingress

✅ Resource Limits

✅ Docker Hub Deployment

✅ Vulnerability Scan