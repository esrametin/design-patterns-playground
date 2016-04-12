package com.packt.designpatterns.strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {

        this.setQuackBehaviour(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I am a mallard duck!");
    }
}
