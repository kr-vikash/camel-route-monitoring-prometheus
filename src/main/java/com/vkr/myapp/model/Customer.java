package com.vkr.myapp.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class Customer {
    private String name;
    private String phoneNo;
    private String product;
    private UUID sequenceNumber;

    @Override
    public String toString(){
        return "name:"+name +",phoneNo:"+phoneNo+",product:"+product+",seqNo:"+sequenceNumber;
    }
}
