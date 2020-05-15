package cn.com.puppylpg.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author liuhaibo on 2019/01/25
 */
@RequestMapping("hello")
@RestController
public class HelloController {

    // root

    /**
     * pichu@Archer ~ $ curl "localhost:8090/hello"
     * Hello: Fri Jan 25 15:26:05 CST 2019
     */
    @RequestMapping
    public String sayHello() {
        return "Hello: " + new Date();
    }

    // get

    /**
     * 多个路径使用同一个方法。
     * <p>
     * pichu@Archer ~ $ curl "localhost:8090/hello/liuhaibo"
     * Hello: puppy & puppylpg. Fri Jan 25 15:26:11 CST 2019
     * <p>
     * pichu@Archer ~ $ curl "localhost:8090/hello/liuguilin"
     * Hello: puppy & puppylpg. Fri Jan 25 15:26:15 CST 2019
     */
    @RequestMapping(value = {"/liuhaibo", "/liuguilin"})
    public String sayHelloToUs() {
        return "Hello: puppy & puppylpg. " + new Date();
    }

}
