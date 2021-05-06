import Pizza.Pizza;
import Pizza.PizzaFactory.SimplePizzaFactory;

public class PizzaHouse {
    public static void main(String[] args) {
        Pizza veggiePizza = SimplePizzaFactory.createPizza("veggie");
        veggiePizza.displayType();

        Pizza pepperoniPizza = SimplePizzaFactory.createPizza("pepperoni");
        pepperoniPizza.displayType();

        Pizza cheesePizza = SimplePizzaFactory.createPizza("cheese");
        cheesePizza.displayType();

        Pizza squarePizza = SimplePizzaFactory.createPizza("cheese");
        squarePizza.displayType();


    }
}
