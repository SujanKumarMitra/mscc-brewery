package com.github.sujankumarmitra.msccbrewery.service.v1;

import com.github.sujankumarmitra.msccbrewery.model.v1.BeerV1;

/**
 * Service Layer of Domain Model {@link BeerV1}
 *
 * @author skmitra
 * @version 1.0
 */
public interface BeerServiceV1 {

    BeerV1 getBear(String beerId);

    BeerV1 createNewBeer(BeerV1 newBeer);
}
