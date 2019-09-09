# everydayJAXRSstory
Exercises and Demystification for JAXRS 2.0


_**every version contains one exercise to complete. Once the exercise is completed, set the the status to **Done** and raised the version by 1. The version no. follows the decimal pattern**_
---
## v0.0.1
create a blank repository with readme.md, .gitignore and license file. checkout this repository to your local workspace and import it to your	favorite IDE as simple maven project. run mvn command `clean install` on project (It should return "**BUILD SUCCESS**" as output in the end and should create a jar file under target dir of the project with name "**artifactId-version.jar**"). Delete App.java and AppTest.java file if any get created during the project import. update the version to 0.0.1 in pom.xml and status as **Done** in readme.md file, then check-in all the updated files back to git.

_Status_ : _**Done**_

## v0.0.2
convert the project to webapp through maven. build a war file using maven and deploy it to external tomcat server. once war is deployed sucessfully. user should be able to access the url "http://localhost:8080/everydayJAXRSstory/services" and it should land the user to welcome page showing a welcome note "Welcome to everydayJAXRSstory !!". Use java based deployment configurarion instead of web.xml.
