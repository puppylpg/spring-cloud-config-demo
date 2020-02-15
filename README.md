[toc]

在注册中心eureka上注册spring cloud config server和client。client从server获取配置，并提供服务。

# eureka
由于是单点，自己不能注册自己。

# config-server
- 配置git仓库地址，这里密码被我隐去了；
- 配置eureka注册地址；

# config-client
- 由于要从config server获取配置，所以要把config server的地址写在bootstrap.yml里；
- 当然用了eureka之后，不再用`spring.cloud.config.uri`，而是`spring.cloud.config.discovery.service-id`，写下server的`spring.application.name`；
- 所以eureka的配置地址也必须写在bootstrap.yml中；
- 不知道为啥要引入`spring-boot-starter-web`，不引入就错了……原作者只要是eureka client都引入了这个包。再探究吧，要吐了。。。

# 使用
依次启动eureka、config-server、config-client。
访问`http://localhost:8082/auto-show`或`http://localhost:8082/show`
