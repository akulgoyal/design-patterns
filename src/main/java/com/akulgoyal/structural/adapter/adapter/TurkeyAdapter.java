package com.akulgoyal.structural.adapter.adapter;

import com.akulgoyal.structural.adapter.adaptee.Turkey;
import com.akulgoyal.structural.adapter.target.Duck;

import java.util.stream.Stream;

public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {

        Stream.iterate(1, num -> num++)
                .limit(5)
                .forEach(num -> turkey.fly());
    }
}