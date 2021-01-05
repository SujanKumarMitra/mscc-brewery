package com.github.sujankumarmitra.msscbrewery.dto.v2;

import com.github.sujankumarmitra.msscbrewery.exception.v2.BeerNotFoundExceptionV2;

import java.text.MessageFormat;

import static java.text.MessageFormat.format;

public class BeerNotFoundResponseV2 {

    private String beerId;
    private String message;

    public BeerNotFoundResponseV2(String beerId) {
        this.beerId = beerId;
        this.message = format("Beer of id [{0}] not found", beerId);
    }

    public BeerNotFoundResponseV2(String beerId, String message) {
        this.beerId = beerId;
        this.message = message;
    }

    public BeerNotFoundResponseV2(BeerNotFoundExceptionV2 exception) {
        this(exception.getBeerId());
    }

    public String getBeerId() {
        return beerId;
    }

    public String getMessage() {
        return message;
    }
}
