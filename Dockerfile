# ---------- Stage 1 : Build ----------
FROM maven:3.9.6-eclipse-temurin-11 AS builder

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

# ---------- Stage 2 : Runtime ----------
FROM eclipse-temurin:11-jre

WORKDIR /app

COPY --from=builder /app/target/*.jar app.jar

EXPOSE 9191

HEALTHCHECK --interval=30s --timeout=5s --start-period=40s --retries=3 \
CMD wget --no-verbose --tries=1 --spider http://localhost:9191/health || exit 1

ENTRYPOINT ["java","-jar","app.jar"]