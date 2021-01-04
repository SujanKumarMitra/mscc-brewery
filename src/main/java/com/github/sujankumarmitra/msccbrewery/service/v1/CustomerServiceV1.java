package com.github.sujankumarmitra.msccbrewery.service.v1;

import com.github.sujankumarmitra.msccbrewery.model.v1.CustomerV1;

/**
 * Service Layer of Domain Model {@link CustomerV1}
 *
 * @author skmitra
 * @version 1.0
 */
public interface CustomerServiceV1 {

    CustomerV1 getCustomer(String customerId);
}
