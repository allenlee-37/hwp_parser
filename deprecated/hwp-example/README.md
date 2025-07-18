hwp-example/hwp-example 경로에서 터미널 명령어 실행

```
mvn clean package
```

BUILD SUCCESS 일 시,

```
java -cp "target/hwp-example-1.0-SNAPSHOT.jar;C:\Users\KT\.m2\repository\kr\dogfoot\hwplib\1.1.10\hwplib-1.1.10.jar;C:\Users\KT\.m2\repository\com\google\code\gson\gson\2.10.1\gson-2.10.1.jar" com.example.App
```

실행 후 같은 폴더에 output.json 확인
