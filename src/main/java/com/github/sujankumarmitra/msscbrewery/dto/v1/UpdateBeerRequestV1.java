package com.github.sujankumarmitra.msscbrewery.dto.v1;

import com.github.sujankumarmitra.msscbrewery.model.v1.BeerV1;

/**
 * Request Body POJO of {@link com.github.sujankumarmitra.msscbrewery.resource.v1.BeerResourceV1#updateBeer(String, UpdateBeerRequestV1)} )}
 *
 * @author skmitra
 * @version 1.0
 */
public class UpdateBeerRequestV1 implements BeerV1 {

    private String id;
    private String name;
    private String style;
    private Long upc;

    public UpdateBeerRequestV1() {
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
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
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
