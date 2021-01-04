package com.github.sujankumarmitra.msscbrewery.dto.v1;

import com.github.sujankumarmitra.msscbrewery.model.v1.CustomerV1;

public class CreateNewCustomerRequestV1 implements CustomerV1 {

    private String id;
    private String name;

    public CreateNewCustomerRequestV1() {
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
