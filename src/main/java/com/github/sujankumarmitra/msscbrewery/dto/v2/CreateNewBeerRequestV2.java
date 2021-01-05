package com.github.sujankumarmitra.msscbrewery.dto.v2;

import com.github.sujankumarmitra.msscbrewery.model.v2.BeerStyleV2;
import com.github.sujankumarmitra.msscbrewery.model.v2.BeerV2;

public class CreateNewBeerRequestV2 implements BeerV2 {

    private String id;
    private String name;
    private BeerStyleV2 style;
    private Long upc;

    public CreateNewBeerRequestV2() {
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public BeerStyleV2 getStyle() {
        return style;
    }

    public void setStyle(BeerStyleV2 style) {
        this.style = style;
    }

    @Override
    public Long getUpc() {
        return upc;
    }

    public void setUpc(Long upc) {
        this.upc = upc;
    }
}
