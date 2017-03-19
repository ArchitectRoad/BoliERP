/*
* Copyright (c) 2017 architectroad@yeah.net. All Rights Reserved.
*/
package com.boli.service.impl.prod;

import com.boli.service.intfc.prod.IProdSvc;

import java.util.ArrayList;
import java.util.List;

/**
 * Product service implementation
 * Author: Joey Zhu (architectroad@yeah.net)
 * Date: 2017/3/11.
 * Time: 10:43
 */
public class ProdSvcImpl implements IProdSvc {
    @Override
    public List<String> getProdList() {
        ArrayList<String> results = new ArrayList<String> ();
        results.add("Prod1");
        results.add("Prod2");
        return results;
    }

    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
