package DecoratorPattern.PizzaDecorator;

import DecoratorPattern.Pizza.BasePizza;

public class CheeseTopping extends Toppings {

    public CheeseTopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 20; // cost of pizza + 20 more
    }
}
