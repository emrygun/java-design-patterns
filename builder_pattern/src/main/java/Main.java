//Consider a builder when faced with many constructor parameters

import BuilderPattern.Pizza.Calzone;
import BuilderPattern.Pizza.NyPizza;
import BuilderPattern.Pizza.Pizza;

public class Main {

    public static void main(String[] args) {
        //JavaBeans Pattern. Not a good practice
        JavaBeans.NutritionFacts bread = new JavaBeans.NutritionFacts();
        bread.setServingSize(1);
        bread.setServings(3);
        bread.setCalories(350);
        bread.setSodium(15);
        bread.setCarbohydrate(150);

        //Builder Pattern. Recommended
        BuilderPattern.NutritionFacts carrot =
                new BuilderPattern.NutritionFacts.Builder(250, 6)
                .calories(150).sodium(2).carbohydrate(28).build();

        System.out.println("Bread: ");
        bread.display();

        System.out.println("\nCarrot: ");
        carrot.display();

        //Inherited Builder Pattern
        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                            .addTopping(Pizza.Topping.SAUSAGE)
                            .addTopping(Pizza.Topping.ONION)
                            .build();

        Calzone calzone = new Calzone.Builder().addTopping(Pizza.Topping.HAM)
                            .sauceInside().build();
    }
}
