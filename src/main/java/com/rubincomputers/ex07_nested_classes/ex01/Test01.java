package com.rubincomputers.ex07_nested_classes.ex01;

public class Test01 {
    public static void main(String[] args) {
        //Outer.Inner inner = new Outer.Inner();

        Outer outer = new Outer();
        Outer.Inner inner =  outer.new Inner();
        inner.go();

    }
}
