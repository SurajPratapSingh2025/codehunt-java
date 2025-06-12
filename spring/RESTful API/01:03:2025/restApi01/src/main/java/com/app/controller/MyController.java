package com.app.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.controller.service.MyService;

@RestController
@RequestMapping("/api")
public class MyController {
    
    @Autowired
    private MyService myService;
    
    @GetMapping("/readsales")  // Note the leading slash
    public Map<Integer,Integer> readSalesData(){
        return myService.salesData();
    }
}