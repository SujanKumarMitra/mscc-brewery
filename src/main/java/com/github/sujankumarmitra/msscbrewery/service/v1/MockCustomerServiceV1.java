package com.github.sujankumarmitra.msscbrewery.service.v1;

import com.github.sujankumarmitra.msscbrewery.model.v1.CustomerV1;
import com.github.sujankumarmitra.msscbrewery.model.v1.ImmutableCustomerV1;
import org.springframework.stereotype.Service;

import static java.lang.String.valueOf;
import static java.util.UUID.randomUUID;

/**
 * Fake Service Class impl of {@link CustomerServiceV1}
 *
 * @author skmitra
 * @version 1.0
 */
@Service
public class MockCustomerServiceV1 implements CustomerServiceV1 {
    @Override
    public CustomerV1 getCustomer(String customerId) {
        return new ImmutableCustomerV1(customerId, "Customer Name");
    }

    @Override
    public CustomerV1 createNewCustomer(CustomerV1 customerToCreate) {
        return new ImmutableCustomerV1(
                valueOf(randomUUID()),
                customerToCreate.getName()
        );
    }

    @Override
    public void updateCustomer(CustomerV1 customerToUpdate) {
        return;
    }

    @Override
    public void deleteCustomer(String customerId) {
        return;
    }
}
