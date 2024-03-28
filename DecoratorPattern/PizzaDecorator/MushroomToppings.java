package DecoratorPattern.PizzaDecorator;

import DecoratorPattern.Pizza.BasePizza;

public class MushroomToppings extends Toppings {

    public MushroomToppings(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 25;  // cost of the pizza + 25 more
    }
}
