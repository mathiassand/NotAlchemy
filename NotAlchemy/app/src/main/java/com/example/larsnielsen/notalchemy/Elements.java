package com.example.larsnielsen.notalchemy;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Created by Anders on 22-Apr-17.
 */

public class Elements {
    int value;
    boolean activation;
    public Elements(int value, boolean activation) {
        this.value = value;
        this.activation = activation;
    }

    public int getValue() {
        return value;
    }

    public boolean isActivation() {
        return activation;
    }
}
