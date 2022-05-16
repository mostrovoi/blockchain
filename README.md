## Blockchain TCP Server 

This sample project is to show how to receive message via TCP by using Spring Boot and Spring Integration. 

The project has been developed using hexagonal architecture providing the following benefits:

- Easier to test
- Adaptable to changes

## Tools used

Kotlin: as programming language

Spring boot: as development framework 

Maven: as software project management

Junit/mockk: Unit testing

## How to run

Tested with Java OpenJDK 11

Execute the following command from terminal line:

    mvn clean package

This will build the binary jar

    java -jar  tcpserver-0.0.1-SNAPSHOT.jar

This will start up a new server and will listen for incoming connections on port 20000 (configurable)

## How to test it

You can use telnet in order to connect to the server:

    telnet localhost 20000

The following commands are supported:

    WHO - Returns the number of users connected
    
    WHY - Returns the ultimate answer
    
    WHERE - Returns the machine id where the user is connected

## Future improvements

Journey where the e2e functionality is tested should be added

Project should be dockerized and added a pipeline for easier deployment

Some unit tests are rather naive and should have better implementation covering all edge cases

Monitoring dashboards covering the 4 golden signals should be added for the project for better observability


