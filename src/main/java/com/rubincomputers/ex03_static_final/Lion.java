package com.rubincomputers.ex03_static_final;

public final class Lion  extends Cat{

    @Override
    void clean() {
        super.clean();
        System.out.println("Lion.clean");
    }
}
