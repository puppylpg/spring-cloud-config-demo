package cn.com.puppylpg.client.consul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;

/**
 * @author liuhaibo on 2020/05/15
 */
@Service
public class HelloServerConsulClient {

    @Autowired
    private LoadBalancerClient loadBalancer;

    @Autowired
    private DiscoveryClient discoveryClient;

    private static final String SERVICE_NAME = "hello-server";

    /**
     * 获取所有服务实例
     */
    public Object allInstances() {
        return discoveryClient.getInstances(SERVICE_NAME);
    }

    /**
     * 从所有服务中选择一个服务（轮询）
     *
     * http://10.236.25.253:8080
     */
    public String choose() {
        // TODO: 为什么load balance会找不到实例
        return loadBalancer.choose(SERVICE_NAME).getUri().toString();
    }

    public String oneInstance() {
        return discoveryClient.getInstances(SERVICE_NAME).stream().findFirst().get().getUri().toString();
    }
}
