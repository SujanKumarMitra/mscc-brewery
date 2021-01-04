package com.github.sujankumarmitra.msccbrewery.service.v1;

import com.github.sujankumarmitra.msccbrewery.model.v1.CustomerV1;
import com.github.sujankumarmitra.msccbrewery.model.v1.ImmutableCustomerV1;
import org.springframework.stereotype.Service;

@Service
public class MockCustomerServiceV1 implements CustomerServiceV1 {
    @Override
    public CustomerV1 getCustomer(String customerId) {
        return new ImmutableCustomerV1(customerId, "Customer Name");
    }
}
