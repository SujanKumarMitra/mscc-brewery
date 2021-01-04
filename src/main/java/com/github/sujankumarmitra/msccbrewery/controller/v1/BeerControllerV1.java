package com.github.sujankumarmitra.msccbrewery.controller.v1;

import com.github.sujankumarmitra.msccbrewery.dto.v1.GetBeerResponseV1;
import com.github.sujankumarmitra.msccbrewery.model.v1.BeerV1;
import com.github.sujankumarmitra.msccbrewery.service.v1.BeerServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerControllerV1 {

    private BeerServiceV1 beerService;

    @Autowired
    public BeerControllerV1(BeerServiceV1 beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<GetBeerResponseV1> getBeer(@PathVariable String beerId) {
        BeerV1 bear = beerService.getBear(beerId);
        return ResponseEntity.ok(new GetBeerResponseV1(bear));
    }
}
