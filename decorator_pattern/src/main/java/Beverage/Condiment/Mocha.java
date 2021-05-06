package Beverage.Condiment;

import Beverage.Beverage;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return this.beverage.cost() + 1.50;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
