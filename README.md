# Running the application
- Tech stack: Spring Boot, Java, Kafka, Elasticsearch, postgresql, prometheus, grafana, docker and kibana
- Run mvn install -DskipTests command
- Then go to docker-compose folder and run docker-compose up command to run kafka cluster and twitter-to-kafka-service together
- Check the pom.xml file and spring-boot-maven-plugin section in twitter-to-kafka-service, where we configure 
the build-image goal to create docker image with mvn install command
- Check the services.yml file under docker-compose folder which includes the compose definition 
for microservice, twitter-to-kafka-service
