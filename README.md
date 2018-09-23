
1. Spring 中 Bean的Scope有哪些？它们分别代表什么含义？


1. Spring 中 的AOP的通知有几种类型，对每种Advice写至少一个Test Case来验证它们的工作机制。
1. 在本地安装MySQL数据库服务，添加一个名为bj_grad的用户（无密码），并以该用户登录创建一个名为grad_stepup的Database，在该Database下成功创建三张表(使用客户端工具Sequel Pro来访问服务，需要安装）：
    ```
    t_user(id: id, varchar: name)
    t_role(int: id, varchar: code, varchar: name)
    t_privilege(int: id, varchar: code, varchar: name)
    t_role_privilege(varchar: role_code, varchar: privilege_code)
    Note: id均为Primary Key，t_role和t_privilege表中的code均为Unique的
    ```
1. 创建一个工程，添加依赖：Spring Web, Spring AOP, Spring Data JPA，MySQL, Flyway, Spring Test, jUnit5，并且确保Server(./gradlew bootRun)能够正常启动。

1. 动手实践：https://spring.io/guides/gs/accessing-data-jpa/，将代码提交到你在 https://github.com/tw-graduate-step-up中的Repository中。

