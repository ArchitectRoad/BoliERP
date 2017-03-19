/*
* Copyright (c) 2017 architectroad@yeah.net. All Rights Reserved.
*/
package com.boli.web;

import com.boli.service.intfc.prod.IProdSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Product Controller
 *
 * Author: Joey Zhu (architectroad@yeah.net)
 * Date: 2017/3/10.
 * Time: 18:46
 */
@Controller
public class ProdController {

    @Autowired
    IProdSvc prodService;

    @RequestMapping("/prodList")
    @ResponseBody
    private List<String> getProdList () {
        return prodService.getProdList();
    }
}

