package com.github.sujankumarmitra.msscbrewery.model.v1;

/**
 * Interface representing domain model Beer
 *
 * @author skmitra
 * @version 1.0
 */
public interface BeerV1 {

    String getId();

    String getName();

    String getStyle();

    Long getUpc();
}
