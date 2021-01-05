package com.github.sujankumarmitra.msscbrewery.exception.v2;

import static java.text.MessageFormat.format;

public class BeerNotFoundExceptionV2 extends RuntimeException {

    private final String beerId;

    public BeerNotFoundExceptionV2(String beerId) {
        super(format("Beer of id [{0}] not found", beerId));
        this.beerId = beerId;
    }

    public String getBeerId() {
        return beerId;
    }
}