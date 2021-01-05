package com.github.sujankumarmitra.msscbrewery.model.v2;

public class ImmutableBeerV2 implements BeerV2 {

    private final String id;
    private final String name;
    private final BeerStyleV2 style;
    private final Long upc;

    public ImmutableBeerV2(BeerV2 beer) {
        this(
                beer.getId(),
                beer.getName(),
                beer.getStyle(),
                beer.getUpc()
        );
    }

    public ImmutableBeerV2(String id, String name, BeerStyleV2 style, Long upc) {
        this.id = id;
        this.name = name;
        this.style = style;
        this.upc = upc;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BeerStyleV2 getStyle() {
        return style;
    }

    @Override
    public Long getUpc() {
        return upc;
    }
}
