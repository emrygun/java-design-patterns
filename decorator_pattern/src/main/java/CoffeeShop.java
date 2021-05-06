import Beverage.*;
import Beverage.Condiment.*;

public class CoffeeShop {
    public static void main(String[] args){
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " costs $" + espresso.cost());

        CondimentDecorator espressoCaramel = new Caramel(espresso);
        System.out.println(espressoCaramel.getDescription() + " costs $" + espressoCaramel.cost());

        Beverage houseBlend = new HouseBlend();
        System.out.println(houseBlend.getDescription() + " costs $" + houseBlend.cost());

        CondimentDecorator houseBlendMocha = new Mocha(houseBlend);
        System.out.println(houseBlendMocha.getDescription() + " costs $" + houseBlendMocha.cost());


    }
}
