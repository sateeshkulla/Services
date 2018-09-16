FROM tomcat:9.0.1-jre8-alpine

FROM maven:3.5-jdk-8-alpine

WORKDIR /app
ADD pom.xml /app/pom.xml
#RUN ["mvn", "dependency:resolve"]
#RUN ["mvn", "verify"]

ADD src /app/src
ADD WebContent/WEB-INF/web.xml /app/WEB-INF/web.xml
ADD WebContent /app/WebContent
RUN ["mvn", "package", "-X"]


ADD /app/target/Services.war /usr/local/tomcat/webapps

CMD ["catalina.sh", "run"]

EXPOSE 8080

#docker build -t services .
#docker run --rm -it -p 8888:8080 services

#docker ps
#docker exec -it CONTAINER_NAME /bin/bash

#http://localhost:8888/Services/api/V1/vehicles