package com.github.sujankumarmitra.msscbrewery.model.v2;

public interface BeerV2 {
    String getId();

    String getName();

    BeerStyleV2 getStyle();

    Long getUpc();
}
