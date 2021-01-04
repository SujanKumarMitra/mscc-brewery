package com.github.sujankumarmitra.msscbrewery.dto.v1;

import com.github.sujankumarmitra.msscbrewery.model.v1.BeerV1;

public class CreateNewBeerResponseV1 {

    private BeerV1 createdBeer;

    public CreateNewBeerResponseV1(BeerV1 createdBeer) {
        this.createdBeer = createdBeer;
    }

    public BeerV1 getCreatedBeer() {
        return createdBeer;
    }
}
