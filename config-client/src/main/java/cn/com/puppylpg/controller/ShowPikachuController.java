package cn.com.puppylpg.controller;

import cn.com.puppylpg.entity.Pikachu;
import cn.com.puppylpg.entity.Pikachu2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ShowPikachuController {

    @Autowired
    Pikachu pikachu;

    @Autowired
    Pikachu2 pikachu2;

    @RequestMapping(value = "show")
    public Object show() {
        return pikachu;
    }

    @RequestMapping(value = "auto-show")
    public Object showAutoConfiguredPikachu() {
        return pikachu2;
    }
}
