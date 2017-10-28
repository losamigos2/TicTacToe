# Development Manual

# TicTacToe

## 1. Introduction
<div style="text-align: justify">
This manual is intended for system developers. It is ideal that the administrators have basic knowledge of Test Driven Development, or TDD, and Java.
<div>

## 2. What software you need
<div style="text-align: justify">
* [git](https://git-scm.com/downloads)
* [Gradle](https://gradle.org/install/)
* [Java v.8](https://java.com/en/download/)
<div>

## 3. How to get started
<div style="text-align: justify">
* To get started you need to install the software listed in chapter 2
* Clone the git repository to your machine using the command: git clone https://github.com/losamigos2/TicTacToe.git
![Image of git clone](images/Gitclone.png)
<div>

## 4. How to build and run
<div style="text-align: justify">
* Use the following command to clean, build and run: ![Image of command](images/Gradlerun.png)
<div>

## 5. How to handle new changes
<div style="text-align: justify">
You should work on new features on a new branch, which would be named the same as the feature, for simplicity. Then when adding the new feature you should follow this procedure:

* git status
* git checkout -b [new branch]
* git add .
git commit -m [informative commit message]
git push origin [the new branch]

After this a pull request is made, then other members approve and merge to master.
<div>

## 6. Coding rules
<div style="text-align: justify">
Appropriate coding rules can be found in the [Design Report](https://github.com/losamigos2/TicTacToe/blob/master/docs/DesignReport.md), chapter 4.
<div>
