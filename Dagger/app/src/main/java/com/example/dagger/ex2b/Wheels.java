package com.example.dagger.ex2b;


public class Wheels {
    // Third-party class - cannot be annotated it with @Inject

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
