package com.github.sujankumarmitra.msscbrewery.dto.v2;

import com.github.sujankumarmitra.msscbrewery.model.v2.BeerV2;

public class GetBeerResponseV2 {

    private BeerV2 beer;

    public GetBeerResponseV2(BeerV2 beer) {
        this.beer = beer;
    }

    public BeerV2 getBeer() {
        return beer;
    }
}
