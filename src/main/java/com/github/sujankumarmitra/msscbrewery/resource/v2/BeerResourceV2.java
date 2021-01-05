package com.github.sujankumarmitra.msscbrewery.resource.v2;

import com.github.sujankumarmitra.msscbrewery.dto.v2.*;
import com.github.sujankumarmitra.msscbrewery.exception.v2.BeerNotFoundExceptionV2;
import com.github.sujankumarmitra.msscbrewery.model.v2.BeerV2;
import com.github.sujankumarmitra.msscbrewery.service.v2.BeerServiceV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestController
@RequestMapping("/api/v2/beer")
public class BeerResourceV2 {

    private BeerServiceV2 beerService;

    @Autowired
    public BeerResourceV2(BeerServiceV2 beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<GetBeerResponseV2> getBeer(@PathVariable String beerId) {
        BeerV2 beer = beerService.getBeer(beerId);
        return ResponseEntity.ok(new GetBeerResponseV2(beer));
    }

    @PostMapping
    public ResponseEntity<CreateNewBeerResponseV2> createNewBeer(
            @RequestBody CreateNewBeerRequestV2 newBeer) {
        BeerV2 createdBeer = beerService.createBeer(newBeer);
        return ResponseEntity
                .status(CREATED)
                .body(new CreateNewBeerResponseV2(createdBeer));
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<Void> updateBeer(
            @PathVariable String beerId,
            @RequestBody UpdateBeerRequestV2 updateBeerRequest) {
        updateBeerRequest.setId(beerId);
        beerService.updateBeer(updateBeerRequest);
        return ResponseEntity
                .noContent()
                .<Void>build();
    }

    @DeleteMapping("/{beerId}")
    public ResponseEntity<Void> deleteMapping(@PathVariable String beerId) {
        beerService.deleteBeer(beerId);
        return ResponseEntity
                .noContent()
                .<Void>build();
    }

    @ExceptionHandler(BeerNotFoundExceptionV2.class)
    public ResponseEntity<BeerNotFoundResponseV2> handleBeerNotFoundException(BeerNotFoundExceptionV2 exception) {
        return ResponseEntity
                .status(NOT_FOUND)
                .body(new BeerNotFoundResponseV2(exception));
    }

}
