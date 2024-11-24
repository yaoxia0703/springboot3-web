package com.springboot.web.springboot3web.controller;

import com.springboot.web.springboot3web.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
@Controller//适配 服务端渲染， 前后不分离模式
public class WelcomeController {


    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("welcome")
    public String welcome(@RequestParam("name") String name, Model model) {
        //模板的逻辑视图名称
        //跳转
        model.addAttribute("name", name);
        model.addAttribute("imageUrl", "/xu.jpg");
        return "welcome";
    }

    @GetMapping("personList")
    public String personList(Model model) {
        List<Person> personList = Arrays.asList(
                new Person(1, "遠藤さん"),
                new Person(2, "北田さん"),
                new Person(3, "松山さん"),
                new Person(4, "宮武さん"),
                new Person(5, "南さん")
        );
        //int a=10/0;
        model.addAttribute("personList", personList);
        return "personList";
    }
}
