/*
* Copyright (c) 2017 architectroad@yeah.net. All Rights Reserved.
*/
package com.boli.service.intfc.prod;

import java.util.List;

/**
 * Product Service Interface
 * Author: Joey Zhu (architectroad@yeah.net)
 * Date: 2017/3/11.
 * Time: 11:01
 */
public interface IProdSvc {
    public List<String> getProdList();

    public String sayHello (String name);
}
