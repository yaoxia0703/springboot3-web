package com.springboot.web.springboot3web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import com.springboot.web.springboot3web.bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot3WebApplication {

    public static void main(String[] args) throws JsonProcessingException {
        SpringApplication.run(Springboot3WebApplication.class, args);
        /*Person person = new Person();
        person.setId(1);
        person.setName("北田先輩");
        YAMLFactory factory = new YAMLFactory().disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER);
        ObjectMapper objectMapper = new ObjectMapper(factory);
        String  a =objectMapper.writeValueAsString(person);
        System.out.println(a);*/
    }

}
