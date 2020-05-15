package cn.com.puppylpg.client.rest;

import cn.com.puppylpg.client.consul.HelloServerConsulClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 用RestTemplate，就得自己去使用consul的client去发现服务地址，拼上接口
 *
 * @author liuhaibo on 2020/05/15
 */
@Service
public class RestTemplateClient {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    HelloServerConsulClient helloServerConsulClient;

    /**
     * 使用{@link RestTemplate}访问服务。
     */
    public Object hello() {
        String result = restTemplate.getForObject(helloServerConsulClient.oneInstance() + "/hello", String.class);
        System.out.println(result);
        return result;
    }
}
