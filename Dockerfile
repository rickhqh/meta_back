FROM openjdk:8
VOLUME /tmp
ADD meta.jar meta.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/meta.jar"]
RUN echo "Asia/Shanghai" > /etc/timezone
