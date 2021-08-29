##How to run Project
```
1. mvn clean
2. ./mvnw spring-boot:run
```

Installing Maven[on terminal]

Brew install maven
echo 'export PATH="/usr/local/opt/openjdk/bin:$PATH"' >> ~/.zshrc


Creating Spring boot project using spring init

Start.spring.io

Add dependencies :
Spring boot web
Spring Data JPA
MySql

Run Spring boot : [ on IDE terminal]

		Mvn clean
		./mvnw spring-boot:run

Creating git repo for new project

Login into your account on web -> name project and create repo

To push code into git from comman line , we need to create our ssh key from the host computer and provide it to the git account.

To create SSH key:  ssh-keygen -t rsa [on Terminal]
cd ~/.ssh/
.ssh % ls
cat id_rsa.pub
copy the generated SSH key and Goto your git profilesettingSSH key and paste there
on your IDE’s terminal
vi .git/config
copy the SSH link from your profile and change the URL and exit

Some Git Commands

Git init ----------- to initialise the git
Git add  file name----------- to add files
Git push -f origin master -------- to push the files in master repo
