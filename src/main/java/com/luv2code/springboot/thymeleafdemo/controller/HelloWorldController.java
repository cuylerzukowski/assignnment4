package com.luv2code.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    // Task 5 Update: Change "/showForm" to "/Movie"
    @RequestMapping("/Movie")
    public String showForm() {
        return "helloworld-form";
    }

    // Standard process form method (you can keep this as is)
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    // Task 5 Update: Change "/processFormVersionTwo" to "/MovieName"
    @RequestMapping("/MovieName")
    public String letsShoutDude(HttpServletRequest request, Model model) {

        // read the request parameter from the HTML form
        String theName = request.getParameter("studentName");

        // convert the data to all caps
        theName = theName.toUpperCase();

        // Task 5 Update: Create the message "ABCDE is my favorite movie"
        String result = theName + " is my favorite movie";

        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }
}