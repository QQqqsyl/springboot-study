package com.syl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "hello , wukongnotnull, 你好， 悟空非空也，大家好好上课，不要挂机";
    }

}
