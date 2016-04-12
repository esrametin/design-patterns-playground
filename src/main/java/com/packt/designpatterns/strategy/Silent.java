package com.packt.designpatterns.strategy;

/**
 * Created by esra on 12.04.2016.
 */
public class Silent implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("..................");
    }
}
