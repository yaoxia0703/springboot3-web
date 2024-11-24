package com.springboot.web.springboot3web.controller;

import com.springboot.web.springboot3web.bean.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {


    @RequestMapping("/person")
    public Person getPerson() {
        Person person = new Person();
        person.setId(1);
        person.setName("北田先輩");
        return person;
    }
}
