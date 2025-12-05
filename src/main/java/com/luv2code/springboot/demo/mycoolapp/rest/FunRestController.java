package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
    
  
    @GetMapping("/name")
    public String getMyName() {
        return "My name is Cuyler"; 
    }

    // Task Requirement: Show your favorite movie
    @GetMapping("/movie")
    public String getFavoriteMovie() {
        return "My favorite movie is Moneyball]";
    }

    // Task Requirement: Show your favorite music
    @GetMapping("/music")
    public String getFavoriteMusic() {
        return "My favorite music is Jack Johnson";
    }

    // expose a new endpoint for "workout"

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    // expose a new endpoint for "fortune"

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day.";
    }

}






