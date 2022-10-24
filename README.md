# mall电商项目
## 一、nacos服务注册与发现

1. 首先，修改 pom.xml 文件，引入 Nacos Discovery Starter。

   ```
    <dependency>
        <groupId>com.alibaba.cloud</groupId>
        <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
    </dependency>
   ```

2. 在应用的 /src/main/resources/application.properties 配置文件中配置 Nacos Server 地址

   ```
    spring.cloud.nacos.discovery.server-addr=127.0.0.1:8848
   ```

3. 使用 应用入口使用`@EnableDiscoveryClient` 注解开启服务注册与发现功能

4. 增加配置，在application.properties 中添加基本配置信息

   ```
    spring.application.name=service-provider
    server.port=18082
   ```

## 二、 Feign远程调用

1. 引入OpenFeign
2. 编写接口，在接口上添加注解`@FeignClient("service-provider")`
3. 在接口上声明调用service-provider的哪个接口
4. 在入口添加注解

## 三、nacos配置中心

1. 导入相关依赖

2. 创建bootstrap.propertities

   ```properties
   spring.application.name=name
   spring.cloud.nacos.config.server-addr=127.0.0.1:8848
   ```

3. 使用注解`@RefreshScope`和`@value`

4. 配置中心创建配置name.properties
