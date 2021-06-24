package br.com.idevoc.appsway.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductCatalogController {

    @GetMapping("/version")
    public String getVersionInfo(){
        return "Version - V1";
    }

    @PostMapping
    public String post(@RequestBody String name) {
        return name;
    }

}
