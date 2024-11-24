package com.bootinitializr.boot3initializr.helloController;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        log.info("hello:入りました");
        return "hello,日本";
    }

}
