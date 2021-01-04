package com.github.sujankumarmitra.msccbrewery.dto.v1;

import com.github.sujankumarmitra.msccbrewery.model.v1.CustomerV1;

public class GetCustomerResponseV1 {

    private CustomerV1 customer;

    public GetCustomerResponseV1(CustomerV1 customer) {
        this.customer = customer;
    }

    public CustomerV1 getCustomer() {
        return customer;
    }
}
