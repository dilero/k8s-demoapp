package com.womanday.kubernetes.demo.controller;

import com.womanday.kubernetes.demo.model.Animal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/")
    public Animal index() {
        return new Animal("cat", "zip", "white");
    }


}
