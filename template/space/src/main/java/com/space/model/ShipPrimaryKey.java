package com.space.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ShipPrimaryKey implements Serializable {
    private String name;
    private int shipId;

    public ShipPrimaryKey() {
    }
}
