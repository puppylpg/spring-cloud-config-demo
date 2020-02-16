package cn.com.puppylpg.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 使用{@link ConfigurationProperties}注入配置，在配置变更并刷新后，
 * 该服务的配置可以直接热更新
 */
@Data
@Component
@ConfigurationProperties(prefix = "pikachu")
public class PikachuChangeWhenAutoFresh {

    private String name;

    private String color;

    private String gender;
}
