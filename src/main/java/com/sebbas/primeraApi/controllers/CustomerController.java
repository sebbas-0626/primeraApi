package com.sebbas.primeraApi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {



    @GetMapping("/prueba")
public String prueba(){
    return "hello java";
}
    @GetMapping("/prueba2")
    public String prueba2(){
        return "hello java lista de arreglos";
    }
}
