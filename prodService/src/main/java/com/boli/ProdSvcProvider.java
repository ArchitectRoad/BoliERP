/*
* Copyright (c) 2017 architectroad@yeah.net. All Rights Reserved.
*/
package com.boli;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Service Provider Entry Class
 *
 * Author: Joey Zhu (architectroad@yeah.net)
 * Date: 2017/3/13.
 * Time: 13:58
 */
public class ProdSvcProvider {
    public static void main(String[] args) throws Exception {
        //本地启动spring容器，适用于开发阶段调试
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"META-INF/spring/applicationContext.xml"});
        context.start();
        System.out.println("启动成功");
        System.in.read(); // 按任意键退出

        //内置Tomcat方式启动
//        SpringApplication.run(ProdSvcImpl.class, args);

        //Dubbo spring容器方式启动
//        com.alibaba.dubbo.container.Main.main(args);
    }
}
