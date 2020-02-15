package cn.com.puppylpg.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

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
