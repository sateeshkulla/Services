FROM tomcat:9.0.1-jre8-alpine

ADD ./target/Services.war /usr/local/tomcat/webapps

CMD ["catalina.sh", "run"]

EXPOSE 8080

#docker build -t services .
#docker run --rm -it -p 8888:8080 services

#docker ps
#docker exec -it CONTAINER_NAME /bin/bash

#http://localhost:8888/Services/api/V1/vehicles