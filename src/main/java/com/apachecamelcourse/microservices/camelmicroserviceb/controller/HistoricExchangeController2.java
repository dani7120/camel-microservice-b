package com.apachecamelcourse.microservices.camelmicroserviceb.controller;

import com.apachecamelcourse.microservices.camelmicroserviceb.model.Historic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HistoricExchangeController2 {
    
    @GetMapping("/historic/body/{body}")
    public Historic test(@PathVariable("body") String body){
        Historic historic = new Historic();
        historic.setBody(body);
        return historic;
    }
}
