package core.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myconfig2 {

    @Bean
    public Dog dog(){
        return new Dog();
    }
}
