package com.bootinitializr.boot3initializr.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "pig")
@Component
@Data
public class Pig {

    private String id;

    private String name;


}
