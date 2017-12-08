# travel-notes
## Overview
This is a sample application that implements a simple Spring Boot controller and tests a basic request in the controller.

## Building the Application
If you have Java 8 in your environment, you can build the application using the Gradle wrapper included in this project.  As of the date of writing this document, the included Gradle wrapper does not work with Java 9 on the command line.  This is a known issue.  The workaround is to use a compatible version of Gradle in your environment.
## Running the Application
Since this is a gradle project, the application can be run on port 8090 by executing the command below.  Feel free to change the port to any that works in the target environment.
```aidl
gradle -Dserver.port=8090 bootRun
```
If you are running this using the Gradle wrapper, use the following command:
```
./gradlew -Dserver.port=8090 bootRun
```
If the above command line switch does not change the default port in your environment, add a `server.port=8090` or whatever port you want to the application.properties file under src/main/resources/.