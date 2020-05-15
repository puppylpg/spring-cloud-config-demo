# consul-discovery-server

## 服务注册
1. 本地启动一个consul；
1. `application.yml`里配置consul的地址、本服务注册到consul所使用的`service-name`和`instance-id`；
1. 可配置自定义的健康检查（不配也有默认的）；

## 配置管理
consul也可以用来统一管理配置，更新后下发给所有的server。但这个配置是以key-value存储在consul里的。
在生产环境中，这些配置应该被持久化存储，所以一般使用`spring-cloud-config`作为统一的配置管理中心。
但是consul把自己当做配置中心倒是应该挺省事儿的，不需要额外的保存配置的git仓库之类的。

> 如果使用consul来进行配置管理，那些需要获取配置的服务要把consul的配置和本服务的配置（Eg: `spring.application.name`）
> 从`application.yml`迁移到`bootstrap.yml`里，和`spring-cloud-config`一样。
> 因为要先从consul里获取配置，再给本服务用。

其实无论是否从consul获取配置，把consul的配置一直写在`bootstrap.yml`里也挺好的，和本服务的配置区分开。
