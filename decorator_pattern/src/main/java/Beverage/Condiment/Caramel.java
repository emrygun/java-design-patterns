package Beverage.Condiment;

import Beverage.Beverage;

public class Caramel extends CondimentDecorator{
    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return this.beverage.cost() + 0.50;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Caramel";
    }
}
