package com.vpuzin.java.course.myfirstapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${app.name}")
    private String appName;
    @Value("${app.author}")
    private String appAuthor;

    // expose "/" return hello world
    @GetMapping("/")
    public String sayHello() {
        return this.appName + this.appAuthor;
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a workout!!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "lucky!";
    }
}
