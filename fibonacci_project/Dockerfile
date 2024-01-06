# 使用 Java 官方镜像作为基础镜像
FROM openjdk:17

# 将 JAR 文件添加到容器中
ADD target/fibonacci_project-0.0.1-SNAPSHOT.jar my-spring-boot-app.jar

# 暴露应用程序的端口
EXPOSE 8080

# 运行 JAR 文件
ENTRYPOINT ["java", "-jar", "/my-spring-boot-app.jar"]