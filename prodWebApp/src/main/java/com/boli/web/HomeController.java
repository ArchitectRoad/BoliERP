/*
* Copyright (c) 2017 architectroad@yeah.net. All Rights Reserved.
*/
package com.boli.web;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/**
 * Author: Joey Zhu (architectroad@yeah.net)
 * Date: 2017/3/10.
 * Time: 18:46
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    private String home() {
        return "架构路上的一亩三分地，与您分享一路所思、所获";
    }

    @RequestMapping("/hello/{name}")
    @ResponseBody
    private String hello(@PathVariable String name) {
        return "Hello，" + name + "! 架构路上的一亩三分地，与您分享一路所思、所获。";
    }

}