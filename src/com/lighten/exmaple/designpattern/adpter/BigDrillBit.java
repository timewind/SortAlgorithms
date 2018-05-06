package com.lighten.exmaple.designpattern.adpter;

// Two adaptee objects
class BigDrillBit implements DrillBit {

    public void makeSmallHole() {
        // do nothing
    }

    public void makeBigHole() {
        System.out.println("Big hole is made byt WallBigHoleMaker");
    }
}