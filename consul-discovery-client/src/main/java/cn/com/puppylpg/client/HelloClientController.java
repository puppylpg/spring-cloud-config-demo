package cn.com.puppylpg.client;

import cn.com.puppylpg.client.consul.HelloServerConsulClient;
import cn.com.puppylpg.client.feign.CustomFeignClient;
import cn.com.puppylpg.client.rest.RestTemplateClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 使用服务发现请求服务提供者，并提供新接口。
 * 提供了两种请求方法：RestTemplate和feign。
 *
 * @author liuhaibo on 2020/05/15
 */
@RestController
public class HelloClientController {

    @Autowired
    RestTemplateClient restTemplateClient;

    @Autowired
    CustomFeignClient customFeignClient;

    @Autowired
    HelloServerConsulClient helloServerConsulClient;

    @GetMapping(value = "rest-template-hello")
    public Object helloByRest() {
        return restTemplateClient.hello();
    }

    @GetMapping(value = "feign-hello")
    public Object helloByFeign() {
        return customFeignClient.hello();
    }

    /**
     * 获取所有服务实例
     */
    @GetMapping(value = "/services")
    public Object services() {
        return helloServerConsulClient.allInstances();
    }

    /**
     * 从所有服务中选择首个服务
     */
    @GetMapping(value = "/first")
    public String first() {
        return helloServerConsulClient.oneInstance();
    }

    /**
     * 从所有服务中选择一个服务（轮询）
     */
    @GetMapping(value = "/choose")
    public String choose() {
        return helloServerConsulClient.choose();
    }
}
