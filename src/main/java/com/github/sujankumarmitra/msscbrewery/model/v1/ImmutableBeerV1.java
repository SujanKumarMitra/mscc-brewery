package com.github.sujankumarmitra.msscbrewery.model.v1;

/**
 * Sealed implementation of {@link BeerV1}
 *
 * @author skmitra
 * @version 1.0
 */
public class ImmutableBeerV1 implements BeerV1 {
    private final String id;
    private final String name;
    private final String style;
    private final Long upc;

    public ImmutableBeerV1(String id, String name, String style, Long upc) {
        this.id = id;
        this.name = name;
        this.style = style;
        this.upc = upc;
    }

    public ImmutableBeerV1(BeerV1 beer) {
        this(
                beer.getId(),
                beer.getName(),
                beer.getStyle(),
                beer.getUpc()
        );
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
    public String getStyle() {
        return style;
    }

    @Override
    public Long getUpc() {
        return upc;
    }
}
