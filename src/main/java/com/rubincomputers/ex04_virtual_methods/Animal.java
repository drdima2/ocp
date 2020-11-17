package com.rubincomputers.ex04_virtual_methods;

abstract class Animal {
    public void careFor(){
        play();
    }

    public void play(){
        System.out.println("pet animal");
    }

}
