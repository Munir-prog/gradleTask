FROM openjdk
COPY someProgram.jar someProgram.jar
EXPOSE 16262
CMD ["java", "-Dcom.sun.management.jmxremote=true", "-Dcom.sun.management.jmxremote.rmi.port=16262", "-Dcom.sun.management.jmxremote.port=16262", "-Dcom.sun.management.jmxremote.authenticate=false", "-Dcom.sun.management.jmxremote.ssl=false", "-Djava.rmi.server.hostname=172.17.0.2", "-Dcom.sun.management.jmxremote.host=172.17.0.2", "-jar", "someProgram.jar"]
