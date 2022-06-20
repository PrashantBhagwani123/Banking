FROM openjdk:16-alpine3.13
EXPOSE 8088
Add Banking-Account/target/banking-account-docker.jar banking-account-docker.jar
ENTRYPOINT ["java","-jar","banking-account-docker.jar"]