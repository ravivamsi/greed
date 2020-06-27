# greedpro 

Greedy Algorithm powered by Alpaca API 

## Technical Specifications

- Maven 
- JDK 1.8 


## TODO
`																`
- Environment Variables - Key, Secret, BaseURL
- Send Alert - Email Notification
- Send Alert - SMS Notification
- Daily Account Summary
- Weekly Account Summary 
- Monthly Account Summary 
- Quarterly Account Summary 
- Yearly Account Summary 
- Models 	- com.greedpro.alpaca.models
- Services 	- com.greedpro.alpaca.services
- Scalp		- com.greedpro.alpaca.scalp
- Swing 	- com.greedpro.alpaca.swing
- Invest	- com.greedpro.alpaca.invest


## API

Refer to the Postman Collection

## Docker

Use the Dockerfile in the repository to build the image 

```
$ docker build -t trader .
Sending build context to Docker daemon  18.56MB
Step 1/8 : FROM maven:3.6.0-jdk-11-slim AS build
3.6.0-jdk-11-slim: Pulling from library/maven
27833a3ba0a5: Pull complete 
16d944e3d00d: Pull complete 
6aaf465b8930: Pull complete 
0684138f4cb6: Pull complete 
67c4e741e688: Pull complete 
933857515267: Pull complete 
4f31e2918c2c: Pull complete 
70a0a987b087: Pull complete 
8369c7ef3731: Pull complete 
7a73ce905393: Pull complete 
c702b567a1e8: Pull complete 
Digest: sha256:4f0face24d2f79439a8fa394555b09be99c9ad537b9b19983fb8cc358818a42d
Status: Downloaded newer image for maven:3.6.0-jdk-11-slim
 ---> c7428be691f8
Step 2/8 : COPY src /home/app/src
 ---> 929203139b26
Step 3/8 : COPY pom.xml /home/app
 ---> c4703c349a14
Step 4/8 : RUN mvn -f /home/app/pom.xml clean package
 ---> Running in 407faab61f3d
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------------< com.greedpro:trader >-------------------------
[INFO] Building trader 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:3.1.0:clean (default-clean) @ trader ---
[INFO] 
[INFO] --- maven-resources-plugin:3.1.0:resources (default-resources) @ trader ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ trader ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 32 source files to /home/app/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:3.1.0:testResources (default-testResources) @ trader ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/app/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ trader ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /home/app/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.22.2:test (default-test) @ trader ---
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.greedpro.TraderApplicationTests

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.1.RELEASE)

2020-06-27 01:59:31.026  INFO 92 --- [           main] com.greedpro.TraderApplicationTests      : Starting TraderApplicationTests on 407faab61f3d with PID 92 (started by root in /home/app)
2020-06-27 01:59:31.043  INFO 92 --- [           main] com.greedpro.TraderApplicationTests      : No active profile set, falling back to default profiles: default
2020-06-27 01:59:33.124  INFO 92 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.ws.config.annotation.DelegatingWsConfiguration' of type [org.springframework.ws.config.annotation.DelegatingWsConfiguration$$EnhancerBySpringCGLIB$$545cf036] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2020-06-27 01:59:33.316  INFO 92 --- [           main] .w.s.a.s.AnnotationActionEndpointMapping : Supporting [WS-Addressing August 2004, WS-Addressing 1.0]
2020-06-27 01:59:34.528  INFO 92 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2020-06-27 01:59:35.507  INFO 92 --- [           main] com.greedpro.TraderApplicationTests      : Started TraderApplicationTests in 5.357 seconds (JVM running for 8.276)
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 7.711 s - in com.greedpro.TraderApplicationTests
2020-06-27 01:59:36.737  INFO 92 --- [extShutdownHook] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- maven-jar-plugin:3.1.1:jar (default-jar) @ trader ---
[INFO] Replacing main artifact with repackaged archive
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  01:20 min
[INFO] Finished at: 2020-06-27T01:59:50Z
[INFO] ------------------------------------------------------------------------
Removing intermediate container 407faab61f3d
 ---> f76b7ae3b3ae
Step 5/8 : FROM openjdk:11-jre-slim
11-jre-slim: Pulling from library/openjdk
8559a31e96f4: Pull complete 
65306eca6b8e: Pull complete 
ddbf88050b6e: Pull complete 
0cb03c61bf26: Pull complete 
Digest: sha256:afd1c9c9138dc4bfe062f15ce74b2d0d9518d8f6f8309881e8f821cb5b182bf0
Status: Downloaded newer image for openjdk:11-jre-slim
 ---> 030d68516e3a
Step 6/8 : COPY --from=build /home/app/target/trader-0.0.1-SNAPSHOT.jar /usr/local/lib/trader.jar
 ---> 183f5a143bc9
Step 7/8 : EXPOSE 8080
 ---> Running in 1eff9ce2c977
Removing intermediate container 1eff9ce2c977
 ---> 0c6e9e79446c
Step 8/8 : ENTRYPOINT ["java","-jar","/usr/local/lib/trader.jar"]
 ---> Running in ba2228655190
Removing intermediate container ba2228655190
 ---> 99073be17a92
Successfully built 99073be17a92
Successfully tagged trader:latest
```

You should see the image build with the following command

```
$ docker images
REPOSITORY          TAG                 IMAGE ID            CREATED             SIZE
trader              latest              99073be17a92        12 seconds ago      222MB
```
 