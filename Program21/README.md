# Program 21 – Securing REST APIs with Spring Security

Add the Spring Boot `spring-boot-starter-security` dependency. The manual configures the default HTTP security and then sets credentials in `application.properties`.

```properties
spring.security.user.name=niranjan
spring.security.user.password=murthy
server.port=8090
```

The controller endpoint shown in the manual returns `Welcome to SpringBoot Security` at `/`. For safety, replace the sample credentials before using this outside a local practical exercise.
