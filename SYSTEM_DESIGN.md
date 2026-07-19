# System Design

## Overview

This project is a Spring Boot based Product Catalogue microservice. It exposes REST APIs to manage products and is containerized using Docker. The application is deployed on Kubernetes with support for scalability through Horizontal Pod Autoscaler (HPA).

---

## Architecture

```
                Client
                   |
                   |
             Ingress Controller
                   |
             Kubernetes Service
                   |
          ---------------------
          |                   |
      Spring Boot Pod     Spring Boot Pod
          |                   |
          ---------------------
                   |
               H2 Database
```

---

## Components

### Spring Boot Application

The application provides REST APIs for:

- Product CRUD operations
- Product search
- Health check endpoint

---

### Database

- H2 In-Memory Database
- Hibernate JPA
- Automatic table creation

---

### Docker

The application is packaged using a multi-stage Docker build.

Benefits:

- Smaller image size
- Faster deployment
- Production-ready image

---

### Kubernetes

The application is deployed using:

- Namespace
- Deployment
- NodePort Service
- Horizontal Pod Autoscaler
- Ingress

---

### Health Monitoring

The application exposes:

```
GET /health
```

Kubernetes uses:

- Readiness Probe
- Liveness Probe

to monitor application health.

---

### Version Management

Git semantic version tags:

- v1.0.0
- v1.1.0
- v2.0.0

---

### CI/CD

GitHub Actions automates:

- Build
- Test
- Docker Image Build
- Kubernetes Deployment (if configured)

---

## Design Decisions

- Spring Boot for REST API development
- H2 Database for lightweight development
- Docker multi-stage build for optimized images
- Kubernetes for scalable deployment
- HPA for automatic scaling
- Git semantic versioning for release management