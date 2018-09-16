FROM openjdk:8-jre-slim
COPY target/app.jar /app.jar
CMD java ${JAVA_OPTS} -jar /app.jar