# everydayJAXRSstory
Exercises and DEMYSTIFICATION of JAXRS 2.0


_**every version contains one exercise to complete. Once the exercise is completed, set the the status to **Done** and raised the version by 1. The version no. follows the decimal pattern**_
---

## v0.0.1
create a blank repository with readme.md, .GITIGNORE and license file. checkout this repository to your local workspace and import it to your	favorite IDE as simple MAVEN project. run MVN command `clean install` on project (It should return "**BUILD SUCCESS**" as output in the end and should create a jar file under target DIR of the project with name "**artifactId-version.jar**"). Delete App.java and AppTest.java file if any get created during the project import. update the version to 0.0.1 in pom.xml and status as **Done** in readme.md file, then check-in all the updated files back to GIT.

_Status_ : _**Done**_

## v0.0.2
Build a war file using MAVEN and deploy it to external TOMCAT server. once war is deployed successfully. user should be able to access the URL "http://localhost:8080/everydayJAXRSstory/services/welcome" and it should land the user to welcome page showing a welcome note "Welcome to everydayJAXRSstory !!". Use java for deployment configuration instead of web.xml and use JAXRS and Jersey for the implementation instead of SERVLET.

_Status_ : _**Done**_

## v0.0.3
Mr. Hacker used to give tutions. He like to teach Kids, Math and Hindi. He charges per Hour basis to their parents. Mr. Hacker needs a web based service which can store the details of the hours tought by him to each Kid so that he can collect correct tution fees from parents of the students. Because Mr. Hacker is a geeky person so he wants the output of the services be in JSON or XML format. He wants the Name of the Kid, the List of Dates with the respective no. of hours tought to the Kid on that date as a detail in the output. Besause this application doesn't deal with huge data so use file system and java serialization to store and retrive the data.

_Status_ : 
