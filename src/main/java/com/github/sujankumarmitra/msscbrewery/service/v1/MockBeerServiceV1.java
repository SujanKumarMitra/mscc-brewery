package com.github.sujankumarmitra.msscbrewery.service.v1;

import com.github.sujankumarmitra.msscbrewery.model.v1.BeerV1;
import com.github.sujankumarmitra.msscbrewery.model.v1.ImmutableBeerV1;
import org.springframework.stereotype.Service;

import static java.lang.String.valueOf;
import static java.util.UUID.randomUUID;

/**
 * Fake Service Class impl of {@link BeerServiceV1}
 *
 * @author skmitra
 * @version 1.0
 */
@Service
public class MockBeerServiceV1 implements BeerServiceV1 {
    @Override
    public BeerV1 getBear(String beerId) {
        return new ImmutableBeerV1(beerId, "Beer Name", "Beer Style", 1L);
    }

    @Override
    public BeerV1 createNewBeer(BeerV1 newBeer) {
        return new ImmutableBeerV1(
                valueOf(randomUUID()),
                newBeer.getName(),
                newBeer.getStyle(),
                newBeer.getUpc()
        );
    }

    @Override
    public BeerV1 updateBeer(BeerV1 beerToUpdate) {
        return new ImmutableBeerV1(beerToUpdate);
    }
}
