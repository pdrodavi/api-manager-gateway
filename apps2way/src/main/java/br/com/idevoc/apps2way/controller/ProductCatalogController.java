package br.com.idevoc.apps2way.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductCatalogController {

    @GetMapping("/version")
    public String getVersionInfo(){
        return "Version - V2";
    }

}