FROM java:8
VOLUME /tmp
ADD eureka-server-0.0.1-SNAPSHOT.jar /hello.jar
EXPOSE 9000
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "/hello.jar"]