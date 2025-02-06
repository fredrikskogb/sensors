### Tech stack:
- Java 21
- Spring Boot 3
- Docker with PostgreSQL

### Try it out:
- `$ docker compose up --build`
- Start the spring boot app
- Test an endpoint `$ curl -v http:localhost:8080/stream/temperature/1`
- All endpoints: http://localhost:8080/swagger-ui/index.html#

![ER-diagram](src/main/resources/static/images/er_diagram.png)