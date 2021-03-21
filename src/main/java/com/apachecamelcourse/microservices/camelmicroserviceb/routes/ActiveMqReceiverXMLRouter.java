package com.apachecamelcourse.microservices.camelmicroserviceb.routes;

import com.apachecamelcourse.microservices.camelmicroserviceb.model.Historic;
import com.apachecamelcourse.microservices.camelmicroserviceb.processors.HistoricProcessor;
import com.apachecamelcourse.microservices.camelmicroserviceb.processors.HistoricTransformer;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqReceiverXMLRouter extends RouteBuilder {

    private final HistoricProcessor articlesProcessor;
    private final HistoricTransformer historicTransformer;

    @Autowired
    public ActiveMqReceiverXMLRouter(HistoricProcessor articlesProcessor, HistoricTransformer historicTransformer) {
        this.articlesProcessor = articlesProcessor;
        this.historicTransformer = historicTransformer;
    }

    @Override
    public void configure() throws Exception {
        from("activemq:my-xml-format-queue")
                .unmarshal().jacksonxml(Historic.class)
                .process(articlesProcessor)
                .transform().method("historicTransformer")
                .to("log:activemq-xml-receiver");
    }
}
