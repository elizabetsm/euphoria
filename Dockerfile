FROM kubespheredev/java-11-centos7

WORKDIR ./app
COPY target/OPEN_PROJECT-1.0-SNAPSHOT.jar ./app.jar

CMD ["java", "-jar", "app.jar"]