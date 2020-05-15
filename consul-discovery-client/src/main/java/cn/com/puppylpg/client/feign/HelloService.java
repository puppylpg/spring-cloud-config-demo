package cn.com.puppylpg.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liuhaibo on 2020/05/15
 */
@FeignClient(value = "hello-server")
public interface HelloService {

    @RequestMapping(value = "/hello")
    String hello();

    @RequestMapping(value = {"/liuhaibo"})
    String helloUs();
}
