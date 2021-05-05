package Duck;

import Duck.Fly.FlyWithWings;
import Duck.Quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a Mallard Duck");
    }

}
