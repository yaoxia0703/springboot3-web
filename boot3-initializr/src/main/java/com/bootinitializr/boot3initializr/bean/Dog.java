package com.bootinitializr.boot3initializr.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

//@Import()
@ConfigurationProperties(prefix = "dog")
@Component
@Data
public class Dog {
    private String id;
    private String name;
}
