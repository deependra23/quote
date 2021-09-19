##How to install maven on MAC
```
Brew install maven
echo 'export PATH="/usr/local/opt/openjdk/bin:$PATH"' >> ~/.zshrc

```
##How to run Project
```
1. mvn clean
2. ./mvnw spring-boot:run
```

## RUN MY SQL ON DOCKER
```
docker run --name quote-mysql -p 3307:3306 -e 
MYSQL_ROOT_PASSWORD=Krishna -e MYSQL_USER=Radha -e MYSQL_PASSWORD=Krishna 
-d mysql:8.0 --lower_case_table_names=1
```

## To check database entries
```
1. Run command below from terminal
    docker exec -it pms-mysql /bin/sh
2. once we see container prompt, Run the command given below
    mysql -u root -pKrishna
3. choose database
    use event;
4. list tables
    show tables;



