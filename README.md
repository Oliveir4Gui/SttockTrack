# StockTrack
Api que consume dados da Brapi Api
StockTrack — Spring Boot + OpenFeign + BRAPI (PostgreSQL)

API em Spring Boot 3 que consome cotações da BRAPI
 via OpenFeign e expõe endpoints REST.
O projeto mantém PostgreSQL configurado (útil caso você queira persistir dados depois), mas o consumo da BRAPI não exige banco.


## Requisitos

Java 17+

Maven 3.9+

PostgreSQL 13+ (se for usar banco)

Token da BRAPI (BRAPI_TOKEN)

## Tecnologias

Spring Boot (Web)

Spring Cloud OpenFeign

Jackson (JSON)

Lombok

PostgreSQL (HikariCP)

(Opcional) Spring Data JPA / Flyway
