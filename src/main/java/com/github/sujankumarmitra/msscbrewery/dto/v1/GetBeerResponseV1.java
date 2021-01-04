package com.github.sujankumarmitra.msscbrewery.dto.v1;

import com.github.sujankumarmitra.msscbrewery.model.v1.BeerV1;
import com.github.sujankumarmitra.msscbrewery.resource.v1.BeerResourceV1;

/**
 * Response model of {@link BeerResourceV1#getBeer(String)}
 *
 * @author skmitra
 * @version 1.0
 * @see BeerResourceV1
 */
public class GetBeerResponseV1 {

    private BeerV1 beer;

    public GetBeerResponseV1() {
    }

    public GetBeerResponseV1(BeerV1 beer) {
        this.beer = beer;
    }

    public BeerV1 getBeer() {
        return beer;
    }
}
