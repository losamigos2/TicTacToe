# Administration manual

<img src="images/Logo.png" height="100" width="300">

## 1. Introduction
This manual is intended for system administrators. It is ideal that the administrators have basic knowledge of Test Driven Development, or TDD, and also git, Gradle, Travis and Java.

## 2. What software you need
> [git](https://git-scm.com/downloads)

> [Gradle](https://gradle.org/install/)

> [Travis-Ci](https://travis-ci.org/)

> [Java v.8](https://java.com/en/download/)

## 3. How to get started
To get started you need you install the software described above if you do not have them on your machine.  
When finished you can clone the project onto your administration machine from the projects [respository](https://github.com/losamigos2/TicTacToe)
 using the command: git clone https://github.com/losamigos2/TicTacToe.git

<img src="images/Gitclone.png" width="200">

## 4. Quality control
The [readme.md](https://github.com/losamigos2/TicTacToe/blob/master/README.md) file gives the administrator information on test results from Travis-CI.

## 5. How to run project on local machine
In order to run the program on your local machine you need to run from the root of the project the command:

```./gradlew clean build run```

*The program should run on either your git bash (Windows) or terminal (Linux or Mac)*

## 6. Team structure
The team consists of 6 developers where each member has a specific role: developer, tester, administrator and product owner. The team strives for continuous delivery to make sure that the user/s of the program can have access to the most up to date version of the program. The teams strives to minimize the risks involved in deploying new versions of the program.
