
1. Spring 中 Bean的Scope有哪些？它们分别代表什么含义？

- 文档 ：https://docs.spring.io/spring/docs/3.0.0.M3/reference/html/ch04s04.html

| Scope  |  Description | 
|---     |---           |
| singleton  |   Scopes a single bean definition to a single object instance per Spring IoC container.       |
| prototype  |   Scopes a single bean definition to any number of object instances.     |
| request  | Scopes a single bean definition to the lifecycle of a single HTTP request; that is each and every HTTP request will have its own instance of a bean created off the back of a single bean definition. Only valid in the context of a web-aware Spring ApplicationContext.  |
| session  | Scopes a single bean definition to the lifecycle of a HTTP Session. Only valid in the context of a web-aware Spring ApplicationContext.  |
| global session  | Scopes a single bean definition to the lifecycle of a global HTTP Session. Typically only valid when used in a portlet context. Only valid in the context of a web-aware Spring ApplicationContext.  |

- singleton: 容器生命周期内只有一个共享实例对象
- prototype： 每次都会产生一个新的实例
- request：针对每个HTTP请求会实例化一个新的实例
- session：针对每次HTTP请求实例化，在HTTP session期间有效
- global session：在一个全局的http session中，一个bean定义对应一个bean实例。典型情况下，仅在使用portlet context的时候有效。

1. Spring 中 的AOP的通知有几种类型，对每种Advice写至少一个Test Case来验证它们的工作机制。

- Before advice – Run before the method execution
- After returning advice – Run after the method returns a result
- After throwing advice – Run after the method throws an exception
- Around advice – Run around the method execution, combine all three advices above.


1. 在本地安装MySQL数据库服务，添加一个名为bj_grad的用户（无密码），并以该用户登录创建一个名为grad_setup的Database，在该Database下成功创建三张表(使用客户端工具Sequel Pro来访问服务，需要安装）：
    ```
    t_user(id: id, varchar: name)
    t_role(int: id, varchar: code, varchar: name)
    t_privilege(int: id, varchar: code, varchar: name)
    t_role_privilege(varchar: role_code, varchar: privilege_code)
    Note: id均为Primary Key，t_role和t_privilege表中的code均为Unique的
    ```
1. 创建一个工程，添加依赖：Spring Web, Spring AOP, Spring Data JPA，MySQL, Flyway, Spring Test, jUnit5，并且确保Server(./gradlew bootRun)能够正常启动。

1. 动手实践：https://spring.io/guides/gs/accessing-data-jpa/，将代码提交到你在 https://github.com/tw-graduate-step-up中的Repository中。

