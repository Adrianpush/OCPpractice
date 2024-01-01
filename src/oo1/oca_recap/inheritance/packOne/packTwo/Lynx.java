package oo1.oca_recap.inheritance.packOne.packTwo;

import oo1.oca_recap.inheritance.packOne.BigCat;

public class Lynx extends BigCat {
    public static void main(String[] args) {

        BigCat bigCat = new BigCat();
        // Calling protected value hasFur using reference of type BigCat does not benefit from protected.
//        boolean fur = bigCat.hasFur;
//
        // Calling protected value hasFur using reference of type Lynx (which extends BigCat) does benefit from protected.
        Lynx lynx = new Lynx();
        boolean lynxFur = lynx.hasFur;
    }
}
