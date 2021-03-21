package com.apachecamelcourse.microservices.camelmicroserviceb.processors;

import com.apachecamelcourse.microservices.camelmicroserviceb.model.Historic;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HistoricProcessor implements Processor {

    Logger LOG = LoggerFactory.getLogger(HistoricProcessor.class);

    @Override
    public void process(Exchange exchange) throws Exception {
       Historic historic =  exchange.getIn().getBody(Historic.class);
       String value = historic.doSomething();
        LOG.info("Historic Processor value: {}", value);
    }
}
