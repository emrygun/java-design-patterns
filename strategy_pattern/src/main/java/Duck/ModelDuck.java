package Duck;

import Duck.Fly.FlyNoWay;
import Duck.Fly.FlyRocketPowered;
import Duck.Quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehaviour = new FlyRocketPowered();
        quackBehaviour = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
