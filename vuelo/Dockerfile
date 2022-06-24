FROM ubuntu:20.04

WORKDIR /usr/src/app


RUN apt-get update && \
    apt-get install -y openjdk-11-jre-headless && \
    apt-get clean;


EXPOSE 80

COPY . .

CMD ["java", "-jar" , "vuelo.jar"]