# Changelog

All notable changes to this project are documented in this file.

## [v2.0.0] - 2026-07-19

### Added
- Enhanced `/products/search` endpoint with keyword and price range filters.
- Global Exception Handling using `@ControllerAdvice`.
- Input validation for Product API.
- Improved Kubernetes health probes.
- Kubernetes HPA support.
- Ingress configuration.

### Changed
- Migrated database from MySQL to H2.
- Improved Deployment configuration.
- Updated Docker image.

---

## [v1.1.0] - 2026-07-19

### Added
- `/products/search` endpoint.
- Keyword-based product search.

---

## [v1.0.0] - 2026-07-19

### Initial Release

Features:

- Product CRUD API
- `/health` endpoint
- Docker support
- Kubernetes Deployment
- NodePort Service
- H2 Database