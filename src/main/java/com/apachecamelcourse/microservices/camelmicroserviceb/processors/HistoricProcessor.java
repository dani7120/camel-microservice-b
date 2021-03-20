package com.apachecamelcourse.microservices.camelmicroserviceb.processors;

import com.apachecamelcourse.microservices.camelmicroserviceb.model.Historic;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class ArticlesProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
       Historic historic =  exchange.getIn().getBody(Historic.class);
    }
}
