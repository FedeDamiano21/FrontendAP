FROM amazoncorretto:8-alpine-jdk 
MAINTAINER federico 
copy target/portfoliofd-0.0.1-SNAPSHOT.jar portfoliofd-app.jar
entrypoint ["java","-jar","/portfoliofd-app.jar"]
CMD ["/bin/sh"]

