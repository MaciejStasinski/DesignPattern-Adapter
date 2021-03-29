package com.company;

public class SquareBlockAdapter extends RoundBlock {
    private SquareBlock block;

    public SquareBlockAdapter(SquareBlock block) {
        this.block = block;
    }

    @Override
    public double getRadius() {
        double result;
        result = (Math.sqrt(Math.pow((block.getWidth()), 2) * 2));
        return result;
    }
}
