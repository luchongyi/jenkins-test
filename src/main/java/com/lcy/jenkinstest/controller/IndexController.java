package com.lcy.jenkinstest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("jenkins")
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "start ok";
    }

}
