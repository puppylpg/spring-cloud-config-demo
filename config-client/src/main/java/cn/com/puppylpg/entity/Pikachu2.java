package cn.com.puppylpg.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "pikachu")
public class Pikachu2 {

    private String name;

    private String color;

    private String gender;
}
