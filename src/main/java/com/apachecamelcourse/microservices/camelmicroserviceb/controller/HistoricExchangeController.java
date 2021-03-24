package com.apachecamelcourse.microservices.camelmicroserviceb.controller;

import com.apachecamelcourse.microservices.camelmicroserviceb.model.Historic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HistoricExchangeController {
    
    @GetMapping("/historic/title/{title}")
    public Historic test(@PathVariable("title") String title){
        Historic historic = new Historic();
        historic.setTitle(title);
        return historic;
    }
}
