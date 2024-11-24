package com.bootinitializr.boot3initializr.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Component
@ConfigurationProperties(prefix = "user")
@Data
public class User {
    private String id;

    private String name;

    private int age;

    private List<Dog> dogs;

    private Pig pig;

    private Map<String, Account> accountMap;

}
