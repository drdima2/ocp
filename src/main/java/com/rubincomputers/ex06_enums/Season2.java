package com.rubincomputers.ex06_enums;

public enum Season2 {
    WINTER{
        public void desc(){
            System.out.println("very cold");
        }

    },
    SUMMER{
        public void desc(){
            System.out.println("very hot");
        }

    },
    SPRING{
        public void desc(){
            System.out.println("very hot");
        }
    }, FALL{
        public void desc(){
            System.out.println("very hot");
        }
    }
    ;
    abstract void desc();

}
