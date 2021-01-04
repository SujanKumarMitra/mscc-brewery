package com.github.sujankumarmitra.msccbrewery.service.v1;

import com.github.sujankumarmitra.msccbrewery.model.v1.BeerV1;
import com.github.sujankumarmitra.msccbrewery.model.v1.ImmutableBeerV1;
import org.springframework.stereotype.Service;

@Service
public class MockBeerServiceV1 implements BeerServiceV1 {
    @Override
    public BeerV1 getBear(String beerId) {
        return new ImmutableBeerV1(beerId, "Beer Name", "Beer Style", 1L);
    }
}
