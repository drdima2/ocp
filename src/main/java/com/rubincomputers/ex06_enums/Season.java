package com.rubincomputers.ex06_enums;

public enum Season {
    WINTER("Low"),
    SPRING("Medium"),
    SUMMER("High"),
    FALL("Medium");

    private String expectedVisitor;


    private Season(String expectedVisitor) {
        System.out.println("enum constructor");
        this.expectedVisitor = expectedVisitor;
    }

    public void printExpectedVisitors(){
        System.out.println(expectedVisitor);
    }
}
