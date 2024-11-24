package com.springboot.web.springboot3web.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@JacksonXmlRootElement
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private Integer id;

    private String name;

}
