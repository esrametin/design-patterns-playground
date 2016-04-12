package designpatterns.strategy;


public class Run {

    public static void main(String[] args){

        Duck mallardDuck = new MallardDuck();
        Duck rubberDuck = new RubberDuck();

        mallardDuck.display();
        mallardDuck.performQuack();

        rubberDuck.display();
        rubberDuck.performQuack();
    }
}
