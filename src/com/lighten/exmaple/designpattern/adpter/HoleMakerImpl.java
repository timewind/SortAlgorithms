package com.lighten.exmaple.designpattern.adpter;

// Client class
class HoleMakerImpl implements HoleMaker {

    @Override
    public void makeHole(int diameter) {
        HoleMaker maker = new Drill(diameter);
        maker.makeHole(diameter);
    }
}