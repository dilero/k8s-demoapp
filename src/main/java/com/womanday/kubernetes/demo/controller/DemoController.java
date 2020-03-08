package com.womanday.kubernetes.demo.controller;

import com.womanday.kubernetes.demo.model.Pet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class DemoController {
    private static Logger logger = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping("/")
    public String index() {
        List<String> names = Arrays.asList("Amterdam", "Berlin");
        names.forEach( each-> logger.info("Each for equal "+ each+ " : " + each.equals(each)));
        return "Each for equal";
    }

    @RequestMapping("/mypet")
    public Pet getMyPet() {
        return new Pet("cat", "zipzip", "white");
    }




}
