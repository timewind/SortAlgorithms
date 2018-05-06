package com.lighten.exmaple.designpattern.adpter;

// Adapter class
class Drill implements HoleMaker {

    private DrillBit drillBit;

    public Drill(int diameter) {
        drillBit = getMakerByDiameter(diameter);
    }

    @Override
    public void makeHole(int diameter) {
        if (isSmallDiameter(diameter)) {
            drillBit.makeSmallHole();
        } else {
            drillBit.makeBigHole();
        }
    }

    private DrillBit getMakerByDiameter(int diameter) {
        if (isSmallDiameter(diameter)) {
            return new SmallDrillBit();
        }
        return new BigDrillBit();
    }

    private boolean isSmallDiameter(int diameter) {
        return diameter < 10;
    }
}
