package com.github.sujankumarmitra.msscbrewery.resource.v1;

import com.github.sujankumarmitra.msscbrewery.dto.v1.CreateNewBeerRequestV1;
import com.github.sujankumarmitra.msscbrewery.dto.v1.CreateNewBeerResponseV1;
import com.github.sujankumarmitra.msscbrewery.dto.v1.GetBeerResponseV1;
import com.github.sujankumarmitra.msscbrewery.dto.v1.UpdateBeerRequestV1;
import com.github.sujankumarmitra.msscbrewery.model.v1.BeerV1;
import com.github.sujankumarmitra.msscbrewery.service.v1.BeerServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerResourceV1 {

    private BeerServiceV1 beerService;

    @Autowired
    public BeerResourceV1(BeerServiceV1 beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<GetBeerResponseV1> getBeer(@PathVariable String beerId) {
        BeerV1 bear = beerService.getBear(beerId);
        return ResponseEntity.ok(new GetBeerResponseV1(bear));
    }

    @PostMapping
    public ResponseEntity<CreateNewBeerResponseV1> createNewBeer(
            @RequestBody @Valid CreateNewBeerRequestV1 createNewBeerRequest) {
        BeerV1 newBeer = beerService.createNewBeer(createNewBeerRequest);
        return ResponseEntity
                .status(CREATED)
                .body(new CreateNewBeerResponseV1(newBeer));
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<Void> updateBeer(
            @PathVariable String beerId,
            @RequestBody @Valid UpdateBeerRequestV1 beerToUpdate) {
        beerToUpdate.setId(beerId);
        beerService.updateBeer(beerToUpdate);

        return ResponseEntity
                .noContent()
                .<Void>build();
    }
}
