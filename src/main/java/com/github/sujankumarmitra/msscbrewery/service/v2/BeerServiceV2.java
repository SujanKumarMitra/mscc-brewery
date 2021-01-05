package com.github.sujankumarmitra.msscbrewery.service.v2;

import com.github.sujankumarmitra.msscbrewery.exception.v2.BeerNotFoundExceptionV2;
import com.github.sujankumarmitra.msscbrewery.model.v2.BeerV2;

public interface BeerServiceV2 {

    BeerV2 getBeer(String beerId) throws BeerNotFoundExceptionV2;

    BeerV2 createBeer(BeerV2 beerToCreate);

    void updateBeer(BeerV2 beerToUpdate) throws BeerNotFoundExceptionV2;

    void deleteBeer(String beerId) throws BeerNotFoundExceptionV2;
}
