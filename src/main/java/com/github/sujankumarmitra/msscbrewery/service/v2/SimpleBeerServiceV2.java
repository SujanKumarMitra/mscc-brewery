package com.github.sujankumarmitra.msscbrewery.service.v2;

import com.github.sujankumarmitra.msscbrewery.exception.v2.BeerNotFoundExceptionV2;
import com.github.sujankumarmitra.msscbrewery.model.v2.BeerV2;
import com.github.sujankumarmitra.msscbrewery.model.v2.ImmutableBeerV2;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.String.valueOf;
import static java.util.UUID.randomUUID;

@Service
public class SimpleBeerServiceV2 implements BeerServiceV2 {

    protected Map<String, BeerV2> beerMap;

    public SimpleBeerServiceV2() {
        this.beerMap = new LinkedHashMap<>();
    }

    @Override
    public BeerV2 getBeer(String beerId) throws BeerNotFoundExceptionV2 {
        BeerV2 beer = beerMap.get(beerId);
        if (beer == null)
            throw new BeerNotFoundExceptionV2(beerId);
        return beer;
    }

    @Override
    public BeerV2 createBeer(BeerV2 beerToCreate) {
        String newBeerId = valueOf(randomUUID());
        BeerV2 newBeer = new ImmutableBeerV2(
                newBeerId,
                beerToCreate.getName(),
                beerToCreate.getStyle(),
                beerToCreate.getUpc()
                );
        beerMap.put(newBeerId, newBeer);
        return newBeer;
    }

    @Override
    public void updateBeer(BeerV2 beerToUpdate) throws BeerNotFoundExceptionV2 {
        String id = beerToUpdate.getId();
        BeerV2 beerPresent = beerMap.get(id);
        if(beerPresent == null)
            throw new BeerNotFoundExceptionV2(id);
        beerMap.put(id,beerToUpdate);
    }

    @Override
    public void deleteBeer(String beerId) throws BeerNotFoundExceptionV2 {
        BeerV2 removedBeer = beerMap.remove(beerId);
        if(removedBeer == null)
            throw new BeerNotFoundExceptionV2(beerId);
    }
}
