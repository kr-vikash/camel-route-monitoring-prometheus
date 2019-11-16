package com.vkr.myapp.config;


import io.micrometer.core.instrument.MeterRegistry;
import org.apache.camel.CamelContext;
import org.apache.camel.component.micrometer.messagehistory.MicrometerMessageHistoryFactory;
import org.apache.camel.component.micrometer.routepolicy.MicrometerRoutePolicyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CamelRouteMonitorConfigure {

    @Autowired
    private CamelContext camelContext;

    @Bean
    public MeterRegistryCustomizer<MeterRegistry> setMetricsTags(){
       camelContext.addRoutePolicyFactory(new MicrometerRoutePolicyFactory());
       camelContext.setMessageHistoryFactory(new MicrometerMessageHistoryFactory());
       return registry -> registry.config().commonTags("service.name","camel-route-monitor-prometheus");
    }
}
