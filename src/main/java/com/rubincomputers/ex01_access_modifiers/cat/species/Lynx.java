package com.rubincomputers.ex01_access_modifiers.cat.species;

import com.rubincomputers.ex01_access_modifiers.cat.BigCat;

public class Lynx  extends BigCat {

    public static void main(String[] args) {
        BigCat cat = new BigCat();
        // Lynx cat = new Lynx();
        System.out.println(cat.name);
        //System.out.println(cat.hasFur);
        //System.out.println(cat.hasPaws);
        //System.out.println(cat.id);
    }

}
