package com.github.sujankumarmitra.msscbrewery.dto.v1;

import com.github.sujankumarmitra.msscbrewery.model.v1.CustomerV1;

/**
 * Response Body POJO for {@link com.github.sujankumarmitra.msscbrewery.resource.v1.CustomerResourceV1#createNewCustomer(CreateNewCustomerRequestV1)}
 *
 * @author skmitra
 * @version 1.0
 */
public class CreateNewCustomerResponseV1 {

    public CustomerV1 createdCustomer;

    public CreateNewCustomerResponseV1(CustomerV1 createdCustomer) {
        this.createdCustomer = createdCustomer;
    }

    public CustomerV1 getCreatedCustomer() {
        return createdCustomer;
    }
}
