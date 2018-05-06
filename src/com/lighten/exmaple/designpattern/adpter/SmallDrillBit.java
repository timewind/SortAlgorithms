package com.lighten.exmaple.designpattern.adpter;

public class SmallDrillBit implements DrillBit {

    @Override
    public void makeSmallHole() {
        System.out.println("Small hole is made byt WallSmallHoleMaker");
    }

    @Override
    public void makeBigHole() {
        // do nothing
    }
}