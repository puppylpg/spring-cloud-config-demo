# consul-discovery-client

## 服务发现
使用`DiscoveryClient`（实际实现是`ConsulDiscoveryClient`）发现服务，根据服务名获取实例，然后获取其url，使用。

貌似还可以直接用feign不用考虑url，直接就调用了。但是尚不清楚为啥哪个loadbalance挂了，导致feign也挂了。

client一般没必要注册在consul上。

