package com.yourock.spring;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("com.yourock.spring")
public class MyConfig {

    @Bean
    @Scope("prototype")
    public Cat catBean() {
        return new Cat();
    }

    @Bean
    @Scope("prototype")
    public Person personBean () {
        return new Person(catBean());
    }
}
