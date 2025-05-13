# ------------------------------
# 阶段1：构建 JAR（需 Maven 环境）
# ------------------------------
FROM maven:3.8.6-openjdk-8 AS builder

# 复制项目代码到容器
WORKDIR /build
COPY pom.xml .
RUN mvn dependency:go-offline -B

COPY src ./src
RUN mvn clean package -DskipTests

# ------------------------------
# 阶段2：运行环境（仅保留 JAR）
# ------------------------------
FROM openjdk:8-jdk-alpine

# 设置时区（同上）
RUN apk add --no-cache tzdata && \
    cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && \
    echo "Asia/Shanghai" > /etc/timezone && \
    apk del tzdata

WORKDIR /app
# 从阶段1复制打包好的 JAR（路径需匹配模块名）
COPY --from=builder /build/xy-club-auth-starter/target/xy-club-auth-*.jar app.jar

EXPOSE 3011
CMD ["java", "-Xmx512m", "-jar", "app.jar"]