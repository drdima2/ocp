package com.rubincomputers.ex07_nested_classes.ex02;

public class A {
    private int x = 10;
    class B{
        private int x = 20;
        class C{
            private int x = 30;
            public void allTheX(){
                System.out.println(x);  //30
                System.out.println(this.x); //30
                System.out.println(B.this.x); //20
                System.out.println(A.this.x); //10

            }
        }
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.x);
        A.B b = a.new B();
        System.out.println(b.x);
        B.C c  = b.new C();
        System.out.println(c.x);
        System.out.println("=========");

        c.allTheX();
    }
}
