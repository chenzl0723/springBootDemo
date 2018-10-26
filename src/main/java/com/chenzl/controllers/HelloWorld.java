package com.chenzl.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenzl on 2018/10/26.
 */
@RestController
public class HelloWorld {

    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String sayHello(){
        return "Hello World";
    }
}
