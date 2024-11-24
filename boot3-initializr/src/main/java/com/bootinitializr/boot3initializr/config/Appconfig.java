package com.bootinitializr.boot3initializr.config;

import com.bootinitializr.boot3initializr.bean.Dog;
import com.bootinitializr.boot3initializr.bean.Pig;
import com.bootinitializr.boot3initializr.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//@Configuration
@SpringBootConfiguration
//@EnableConfigurationProperties(Dog.class)//外部提供組導入
public class Appconfig {

//    @Scope("prototype")//複数Bean取得
//    @Bean("userhaha")
//    public User user() {
//        return new User("abd", "韓さん", 44);
//
//    }

//    @Bean
//    public Pig pig(){
//        return new Pig();
//    }
}
