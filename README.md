# Minecraft-Restaurant-Website
FF14 Roleplay Restaurant Website inspired Spring Boot Example
<br />
<br />
## Purpose
This applicaitons purpose is to simulate a website for a not existing minecraft restaurant based of the idea of Final Fantasy 14 Roleplay Café websites.
This application is not meant for production, it's only a fun free time project to tinker around.
<br />
<br />
## Running The Project 
For this project you'll need Java, Gradle and MySQL. <br />
For setting up MySQL, please follow the instructions as described on [Spring Boot - Getting Started - MySQL](https://spring.io/guides/gs/accessing-data-mysql/). I used the following versions for this project:
- Gradle: 7.9<br />
- Java: 1.8<br />
- Database: MySQL: 8.0.30.0<br />
- OS: Win10<br />

After you created the database and made sure that it's running, open your terminal in the same folder all the gradle files are and type in ```./gradlew bootRun``` (perspective of a windows user).
After you've let gradle do its magic, you can acces the website on ```localhost:8080/``` in your browser.<br />
By logging in on the websites login page with the given information username:```user``` and password:```password```, you'll get redirected to ```localhost:8000/addtomenu``` where you're able to add drinks and dishes to your menu. <br />
You can read the data either in a responsive html under ```localhost:8080/menu``` or by using a database tool like "MySQL Workbench 8.0 CE" with the following SQL input:
```SELECT * FROM db_example.food```