package com.vkr.myapp.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class CamelTestRoute extends RouteBuilder {

    @Override
    public void configure(){
        from("direct:test")
                .routeId("route-test")
                .log("${body}");
    }
}
