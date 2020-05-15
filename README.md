# spring-cloud-demo
Demos about spring cloud.

## consul
需要自己先起一个单独的consul服务（集群）。
### 服务注册中心
- consul-discovery-server：把自己注册到consul上；
- consul-discovery-client：从consul上发现服务；

### 健康检查
### 配置中心
consul也可用作配置中心。但是貌似不方便持久化。

TODO

## spring-cloud-config
注册中心。这里是使用的eureka作为注册中心。

使用spring-cloud-config作为配置中心的好处是持久化，比如从git仓库中取配置。

