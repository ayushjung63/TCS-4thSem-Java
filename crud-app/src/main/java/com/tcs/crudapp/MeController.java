package com.tcs.crudapp;

import org.springframework.web.bind.annotation.*;

@RestController
public class MeController {

    @RequestMapping(value = "/me",method = RequestMethod.GET)
    public String me(@RequestParam("name") String name){
        return "My name is "+name;
    }

    @RequestMapping(value = "/greet/{message}",method = RequestMethod.GET)
    public String sayGreet(@PathVariable("message") String message){
        return message +" my dear students";
    }
}
