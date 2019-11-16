package com.vkr.myapp.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CustomerRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("direct:customer")
                .routeId("customer-route")
                .log("data send for process")
                .process("customerProcess")
                .to("direct:warehouse")
                .log("${body}").end();
    }
}
