package com.github.sujankumarmitra.msscbrewery.dto.v2;

import com.github.sujankumarmitra.msscbrewery.model.v2.BeerV2;

public class CreateNewBeerResponseV2 {

    private BeerV2 createdBeer;

    public CreateNewBeerResponseV2(BeerV2 createdBeer) {
        this.createdBeer = createdBeer;
    }

    public BeerV2 getCreatedBeer() {
        return createdBeer;
    }
}
