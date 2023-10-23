package com.topics;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// this annotation will make your application to spring boot application.`
@SpringBootApplication
public class CourseApi {
    
    public static void main(String[] args)  {
        //t make the container, to host your spring boot application
        SpringApplication.run(CourseApi.class, args);

    }
}