package com.rubincomputers.ex07_nested_classes.ex03;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Outer {
    private int length = 5;
    public void calculate(){
        final int width=20;  //must be final
        // int width=20;
        class Inner{
            public void multiply(){
                System.out.println(length * width);
            }
        }
        Inner inner = new Inner();
        inner.multiply();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.calculate();


        List<Integer> ar = Arrays.asList(3,4,5);

        ar.stream().forEach( (i)-> System.out.println(i));

    }


}
