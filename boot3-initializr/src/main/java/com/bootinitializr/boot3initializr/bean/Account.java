package com.bootinitializr.boot3initializr.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "account")
@Data
public class Account {
    private String id;

    private String accountName;

    private String password;


}
