package com.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController // to build Rest API use the annotation @RestController
public class CurrencyConfigurationController {

    // http://localhost:8080/courses
//Will return course details Course:id, name, author

    @Autowired //Spring will create an instance of CurrencyServiceConfiguration
    private CurrencyServiceConfiguration configuration;

    @RequestMapping("/currency-configuration") //When someone keys in the url it should return the following
    public CurrencyServiceConfiguration retrieveAllCourses() {


        return configuration;
    }

}
