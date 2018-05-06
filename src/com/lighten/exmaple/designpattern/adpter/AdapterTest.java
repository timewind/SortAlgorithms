package com.lighten.exmaple.designpattern.adpter;

public class AdapterTest {

    public static void main(String[] args) {
        HoleMaker maker = new HoleMakerImpl();
        maker.makeHole(1);
        maker.makeHole(2);
        maker.makeHole(30);
        maker.makeHole(40);
    }
}
