package com.company;

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundBlock block){
        boolean result;
        result = (this.getRadius() >= block.getRadius());
        return result;
    }
}
