package com.apachecamelcourse.microservices.camelmicroserviceb.processors;

import com.apachecamelcourse.microservices.camelmicroserviceb.model.Historic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HistoricTransformer {

    Logger LOG = LoggerFactory.getLogger(HistoricTransformer.class);

    public Historic processTitle(Historic historic){
        historic.setTitle("Transforming title");
        LOG.info("HistoricTransformer Historic : {}", historic);
        return  historic;
    }
}
