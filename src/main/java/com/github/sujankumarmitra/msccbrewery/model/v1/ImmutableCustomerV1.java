package com.github.sujankumarmitra.msccbrewery.model.v1;

/**
 * Sealed Implementation of {@link CustomerV1}
 *
 * @author skmitra
 * @version 1.0
 */
public class ImmutableCustomerV1 implements CustomerV1 {

    private final String id;
    private final String name;

    public ImmutableCustomerV1(CustomerV1 customer) {
        this(customer.getId(), customer.getName());
    }

    public ImmutableCustomerV1(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}
