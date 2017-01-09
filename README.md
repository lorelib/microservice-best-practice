# 微服务最佳实践

## hosts配置
### windows
    修改C:\Windows\System32\drivers\etc\hosts配置，
    添加：127.0.0.1	discovery discovery1 discovery2 config-server gateway movie user feign ribbon

## 启动services-discovery应用
> 单机

    java -jar services-discovery-1.0.jar
    访问：
        http://discovery:8010

> 高可用

    java -jar services-discovery-1.0.jar --spring.profiles.active=discovery1
    java -jar services-discovery-1.0.jar --spring.profiles.active=discovery2
    访问：
        http://discovery1:8011   
        http://discovery2:8012
        
## 配置中心
    java -jar config-server-1.0.jar
    访问：
    http://localhost:8020/microservice-identity-auth-dev.properties
    http://localhost:8020/microservice-identity-auth/dev

## 启动user服务
    java -jar microservice-user-1.0.jar
    访问：
        http://localhost:8030/user/1
    
## 启动organization服务
    java -jar microservice-organization-1.0.jar
    访问：
        http://localhost:8050/user/1
    
## 启动spring-boot-admin
    
    http://localhost:8040/
    
## API GATEWAY

## 日志

    spring-cloud-config暂不支持在clent端yml文件通过占位符${}读取config-server中配置的属性,
    折中的方式是通过设置系统属性LOG_HOME来配置文件存放目录


***注意：当服务发现是 Eureka 及 Consul 时，Config Server支持与之联合使用；如果是 Zookeeper 做服务发现，目前不支持与之联合使用。***
    
***bootstrap.yml 文件中的内容不能放到 application.yml 中，否则config部分无法被加载，
因config部分的配置先于 application.yml 被加载，而 bootstrap.yml 中的配置会先于 application.yml 加载***


-------------------------------------------------------------
# 打成WAR包，使部署到web容器

1. 修改pom.xml文件
    
    > 将packaging配置jar改成war
    
    > 添加
    
        `<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-tomcat</artifactId>
            <scope>provided</scope>
        </dependency>`
        
      避免内嵌的容器干扰需要部署的容器，需设置scope为provided
      
2. @SpringBootApplication启动类继承SpringBootServletInitializer，并且覆盖configure方法

3. 添加相应的web.xml文件。