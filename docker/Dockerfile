# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine
LABEL maintainer="blaqfox<cschirwa@gmail.com>"

# Copy jar file
COPY healthy-dining-0.0.1-SNAPSHOT.jar /healthy-dining.jar

EXPOSE 7002

#Set environment variables for Registrator to pick up (SERVICE_PORT_KEY)
ENV SERVICE_7002_NAME healthy-dining
#This environment is required for Fabio URL path routing
ENV SERVICE_7002_TAGS urlprefix-/HealthyDining/, urlprefix-/HealthyDining/v1
#This is required for Consul health check
ENV SERVICE_7002_CHECK_HTTP /actuator/health

# run the app
CMD ["/usr/bin/java", "-jar", "/healthy-dining.jar"]
