package BuilderPattern.Pizza;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

//Builder pattern is well suited to class hierarchies
public abstract class Pizza {
    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}
    final Set<Topping> toppings;

    //Provides an interface to add toppings to recipe that Builder relies
    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        //Add toppings to Pizza (Builder)
        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();
        //Subclass must override this method to return "this" protected abstract T self();
        protected abstract T self();
    }
    //Get the Pizza recipe (clone) from builder.
    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}
