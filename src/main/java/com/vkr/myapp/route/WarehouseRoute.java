package com.vkr.myapp.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class WarehouseRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
          from("direct:warehouse")
                  .routeId("warehouse-route")
                  .log("${body}")
                  .log("data received !!!");
    }
}
