package designpatterns.strategy;

/**
 * Created by esra on 12.04.2016.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {

        this.setQuackBehaviour(new Squeak());
    }

    @Override
    public void display() {
        System.out.println("I am a rubber duck!");
    }
}
