package com.vkr.myapp.route;

import org.apache.camel.builder.RouteBuilder;

public class CustomerRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("direct:customer")
                .routeId("customer-route")
                .process("customerProcess")
                .log("${body}").end();
    }
}
