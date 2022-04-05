## working with microservices


### Building docker images commands
- From commandline with maven -- inside target microservice => `mvn spring-boot:build-image -DskipTests`
- Run `docker-compose up` to start the services from the configuration yaml file.
- To manually run an image => `docker run -p 8000:8000 zenjdocker/mmv2-currency-exchange-service:0.0.1-SNAPSHOT `