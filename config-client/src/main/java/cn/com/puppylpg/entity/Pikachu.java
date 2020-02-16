package cn.com.puppylpg.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 使用{@link Value}的配置注入方式，在配置变更刷新之后，
 * 该服务的配置不会更新，所以推荐{@link PikachuChangeWhenAutoFresh}
 */
@Data
@Component
public class Pikachu {

    @Value("${pikachu.name}")
    private String name;

    @Value("${pikachu.color}")
    private String color;

    @Value("${pikachu.gender}")
    private String gender;
}
