package DuckExample.Ducks;

import DuckExample.*;

public class RedHeadDuck extends Duck {

    @Override
    protected void display() {
        System.out.println("I am RedHeadDuck");
    }

    public RedHeadDuck() {
        System.out.println("Hello I am RedHeadDuck");
        flyBehaviour = new Fly_At_More_Height();
        quackBehaviour = new QuackQuack();
    }

    public static void main(String[] args) {

        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
        redHeadDuck.swim();
    }
}
