package com.company;

public class Main {

    public static void main(String[] args) {

        RoundHole hole = new RoundHole(5);
        RoundBlock roundBlock = new RoundBlock(5);

        if (hole.fits(roundBlock)) {
            System.out.println("Round block r"+roundBlock.getRadius()+" fits round hole r"+hole.getRadius());
        }

        SquareBlock smallSquareBlock = new SquareBlock(2);
        SquareBlock largeSquareBlock = new SquareBlock(20);

       // hole.fits(smallSquareBlock); - won't compile

        //Adapter
        SquareBlockAdapter smallSquareAdapter = new SquareBlockAdapter(smallSquareBlock);
        SquareBlockAdapter largeSquareAdapter = new SquareBlockAdapter(largeSquareBlock);

        if (hole.fits(smallSquareAdapter)){
            System.out.println("Square block w"+smallSquareBlock.getWidth()+" fits round hole r"+hole.getRadius());
        }

        if (!hole.fits(largeSquareAdapter)){
            System.out.println("Square block w"+largeSquareBlock.getWidth()+" does not fits round hole r"+hole.getRadius());
        }











    }
}
