package com.github.sujankumarmitra.msscbrewery.dto.v1;

import com.github.sujankumarmitra.msscbrewery.model.v1.CustomerV1;
import com.github.sujankumarmitra.msscbrewery.resource.v1.CustomerResourceV1;

/**
 * Response model of {@link CustomerResourceV1#getCustomer(String)}
 *
 * @author skmitra
 * @version 1.0
 * @see CustomerResourceV1
 */
public class GetCustomerResponseV1 {

    private CustomerV1 customer;

    public GetCustomerResponseV1(CustomerV1 customer) {
        this.customer = customer;
    }

    public CustomerV1 getCustomer() {
        return customer;
    }
}
