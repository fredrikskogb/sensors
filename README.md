Fetch real time data from mocked temperature sensors.
### Tech stack:
- Java 21
- Spring Boot 3
- Docker with PostgreSQL

### Try it out:
- `$ docker compose up --build`. Ports in use 5434:5432.
- Start the spring boot app. Ports in use 8080.
- Test an endpoint `$ curl -v http:localhost:8080/stream/temperature/1`
- All endpoints: http://localhost:8080/swagger-ui/index.html#

![ER-diagram](src/main/resources/static/images/er_diagram.png)