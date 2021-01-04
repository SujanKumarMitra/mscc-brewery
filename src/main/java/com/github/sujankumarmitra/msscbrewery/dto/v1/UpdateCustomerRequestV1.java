package com.github.sujankumarmitra.msscbrewery.dto.v1;

import com.github.sujankumarmitra.msscbrewery.model.v1.CustomerV1;

/**
 * Request Body POJO for {@link com.github.sujankumarmitra.msscbrewery.resource.v1.CustomerResourceV1#updateCustomer(String, UpdateCustomerRequestV1)}
 * 
 * @author skmitra
 * @version 1.0
 */
public class UpdateCustomerRequestV1 implements CustomerV1 {

    private String id;
    private String name;

    public UpdateCustomerRequestV1() {
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
