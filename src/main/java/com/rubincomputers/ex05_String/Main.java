package com.rubincomputers.ex05_String;

public class Main {
    public static void main(String[] args) {
        //String a = new String ("Vova");
        //String b = new String("Vova");
        String a = "Vova";
        String b = "Vova";
        System.out.println(a.equals(b));


        StringBuilder sb1 = new StringBuilder("vovka");
        StringBuilder sb2 = new StringBuilder("vovka");
        System.out.println(sb1.equals(sb2));
    }
}
