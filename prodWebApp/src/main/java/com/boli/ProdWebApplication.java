/*
* Copyright (c) 2017 architectroad@yeah.net. All Rights Reserved.
*/
package com.boli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * Product Module Web Application
 * Author: Joey Zhu (architectroad@yeah.net)
 * Date: 2017/3/13.
 * Time: 12:16
 */

@EnableAutoConfiguration
@ImportResource({"classpath*:META-INF/spring/applicationContext.xml"})
@ComponentScan("com.boli.web")
public class ProdWebApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ProdWebApplication.class, args);
    }
}
