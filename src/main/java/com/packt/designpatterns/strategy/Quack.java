package com.packt.designpatterns.strategy;

/**
 * Created by esra on 12.04.2016.
 */
public class Quack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Quack quack!");
    }
}
