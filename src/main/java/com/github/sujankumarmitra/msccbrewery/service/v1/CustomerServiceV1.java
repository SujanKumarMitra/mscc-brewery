package com.github.sujankumarmitra.msccbrewery.service.v1;

import com.github.sujankumarmitra.msccbrewery.model.v1.CustomerV1;

public interface CustomerServiceV1 {

    CustomerV1 getCustomer(String customerId);
}
