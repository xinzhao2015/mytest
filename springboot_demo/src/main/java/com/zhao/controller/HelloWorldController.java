package com.zhao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhao
 * @date 2019/6/10 10:51
 */

@RestController
public class HelloWorldController {

    @Autowired
    private Environment env;

    @RequestMapping("/info")
    public String info(){
        return "HelloWorld  "+env.getProperty("url");
    }

}
