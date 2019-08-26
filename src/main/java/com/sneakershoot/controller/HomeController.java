/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sneakershoot.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author martuanasution
 */
@RestController

public class HomeController {
    
    @RequestMapping("/home")
    
    public String index() {
        return "Ini adalah Home";
    }
}
