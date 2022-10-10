## Spring 注解自动装配

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">

    <context:annotation-config/>

</beans>
```

## 注解说明

- @Autowired 自动装配通过类型、名字。如果Autowired不能唯一自动装配上属性、则需要通过@Quqlifier(value="
  xxx")
- @Nullable 字段标记了这个注解说明此字段可以为空
- @Resource 自动装配先通过名字、在类型
    - 如果无法使用Resource，那么可能是jdk版本太低或者太高的问题
    - pom.xml导入以下配置 “javax.annotation-api-1.3.2.jar”

```xml
       <!-- https://mvnrepository.com/artifact/javax.annotation/javax.annotation-api -->
<dependency>
    <groupId>javax.annotation</groupId>
    <artifactId>javax.annotation-api</artifactId>
    <version>1.3.2</version>
</dependency>
```
  



