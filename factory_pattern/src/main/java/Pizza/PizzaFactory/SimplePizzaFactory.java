package Pizza.PizzaFactory;

import Pizza.*;

public class SimplePizzaFactory {

    public static Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese":      pizza = new CheesePizza();      break;
            case "pepperoni":   pizza = new PepperoniPizza();   break;
            case "veggie":      pizza = new VeggiePizza();      break;
            case "square":      pizza = new SquarePizza();      break;
        }

        return pizza;
    }
}
