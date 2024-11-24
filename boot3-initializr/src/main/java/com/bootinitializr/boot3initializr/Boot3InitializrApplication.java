package com.bootinitializr.boot3initializr;

import com.bootinitializr.boot3initializr.bean.Dog;
import com.bootinitializr.boot3initializr.bean.Pig;
import com.bootinitializr.boot3initializr.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//主
public class Boot3InitializrApplication {

    public static void main(String[] args) {

        var ioc = SpringApplication.run(Boot3InitializrApplication.class, args);
        /*var pig = ioc.getBean(Pig.class);
        var dog = ioc.getBean(Dog.class);
        System.out.println(dog);
        System.out.println(pig);*/
//        var user = ioc.getBean(User.class);
//        System.out.println(user);
//        System.out.println(user.getDogs().get(1).getName());

    }

}
