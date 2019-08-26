/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sneakershoot.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author martuanasution
 */
@RestController

public class IndexController {

    @RequestMapping({"/hello"})
    
    public String index() {
        return "Ini adalah Index";
    }
}
