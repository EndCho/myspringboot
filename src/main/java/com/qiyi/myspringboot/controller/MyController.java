package com.qiyi.myspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Kent Lee
 * 2018/8/2
 */
@Controller
public class MyController {
    @RequestMapping(value = "/out")
    @ResponseBody
    public String out(){
        return "success";
    }
}
