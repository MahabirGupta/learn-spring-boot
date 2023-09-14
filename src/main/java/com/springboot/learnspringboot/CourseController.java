package com.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController // to build Rest API use the annotation @RestController
public class CourseController {

    // http://localhost:8080/courses
//Will return course details Course:id, name, author

    //    create a list of courses
    @RequestMapping("/courses") //When someone keys in the url it should return the following
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWA", "Udemy"),
                new Course(2, "Learn DevOps", "Udemy"),
                new Course(3, "Learn Azure", "Udemy"),
                new Course(4, "Learn GCP", "Udemy")


        );
    }

}
