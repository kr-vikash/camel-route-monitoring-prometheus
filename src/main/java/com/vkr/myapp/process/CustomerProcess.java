package com.vkr.myapp.process;

import com.vkr.myapp.model.Customer;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CustomerProcess implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        Message message= exchange.getIn();
        Customer customer= (Customer) message.getBody();
        customer.setSequenceNumber(UUID.randomUUID());
        message.setBody(customer);
    }
}
