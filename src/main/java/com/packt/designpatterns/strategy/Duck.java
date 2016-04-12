package com.packt.designpatterns.strategy;


public abstract class Duck {

    QuackBehaviour quackBehaviour;
    String name;

    public Duck() {
    }

    public abstract void display();

    public void performQuack(){
        this.quackBehaviour.quack();
    }

    public QuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
