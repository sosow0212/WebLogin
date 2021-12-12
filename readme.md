## Spring-boot 회원가입 및 로그인 기능 구현

### dependency 
- Spring Boot DevTools
- Lombok
- Spring Data JPA
- MariaDB Driver
- Spring Security
- Spring Web
- Oauth2-client
- Thymeleaf


### 참고사항
- MariaDB 사용
- Application.properties는 아래 코드 입력하시면 됩니다.

Application.properties
```aidl
server.port=8080

spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
spring.datasource.username=아이디
spring.datasource.password=패스워드
spring.datasource.url=jdbc:mysql://localhost:3306/스키마

# create, update, none, create-drop, validate,
spring.jpa.hibernate.ddl-auto=update

## Jpa Properties
spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.format_sql=true

## Logging Level
logging.level.org.hibernate.type.descriptor.sql=debug

spring.security.user.name=root
spring.security.user.password=root
spring.security.user.roles=ADMIN
```