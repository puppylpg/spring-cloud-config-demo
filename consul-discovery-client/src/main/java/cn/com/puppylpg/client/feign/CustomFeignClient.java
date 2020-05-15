package cn.com.puppylpg.client.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Feign不再需要server name了，都写在接口{@link HelloService}上了。
 *
 * TODO: 不能命名为FeignClient，貌似feign会自动为{@link HelloService}生成一个名为feignClient的bean。
 * TODO: 另外feign应该也用了load balance，所以会随着load balance一起挂掉
 *
 * @author liuhaibo on 2020/05/15
 */
@Service
public class CustomFeignClient {

    @Autowired
    private HelloService helloService;

    public Object hello() {
        return helloService.hello();
    }

}
