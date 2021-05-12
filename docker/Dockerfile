# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine
LABEL maintainer="blaqfox<cschirwa@gmail.com>"

# Copy jar file
COPY healthy-dining-0.0.1-SNAPSHOT.jar /healthy-dining.jar

# run the app
CMD ["/usr/bin/java", "-jar", "/healthy-dining.jar"]