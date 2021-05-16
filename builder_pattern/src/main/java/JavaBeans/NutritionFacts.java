package JavaBeans;

//Javabeans pattern
//Pretty ugly. Requires multiple calls
public class NutritionFacts {
    private int servingSize = -1;   //Required. No default value
    private int servings = -1;      //Required. No default value
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public NutritionFacts() { }

    public void setServingSize(int servingSize)     { this.servingSize = servingSize; }
    public void setServings(int servings)           { this.servings = servings; }
    public void setCalories(int calories)           { this.calories = calories; }
    public void setFat(int fat)                     { this.fat = fat; }
    public void setSodium(int sodium)               { this.sodium = sodium; }
    public void setCarbohydrate(int carbohydrate)   { this.carbohydrate = carbohydrate; }

    public void display() {
        System.out.println("servingSize: " + servingSize + "\n" +
                            "servings: " + servings + "\n" +
                            "fat: " + fat + "\n" +
                            "sodium: " + sodium + "\n" +
                            "carbohydrate: " + carbohydrate);
    }
}
