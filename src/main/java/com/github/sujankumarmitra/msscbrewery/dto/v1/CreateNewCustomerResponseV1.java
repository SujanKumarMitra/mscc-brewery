package com.github.sujankumarmitra.msscbrewery.dto.v1;

import com.github.sujankumarmitra.msscbrewery.model.v1.CustomerV1;

public class CreateNewCustomerResponseV1 {

    public CustomerV1 createdCustomer;

    public CreateNewCustomerResponseV1(CustomerV1 createdCustomer) {
        this.createdCustomer = createdCustomer;
    }

    public CustomerV1 getCreatedCustomer() {
        return createdCustomer;
    }
}
