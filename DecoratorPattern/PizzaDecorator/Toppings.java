package DecoratorPattern.PizzaDecorator;

import DecoratorPattern.Pizza.BasePizza;

public abstract class Toppings implements BasePizza {
    /***
     * we have taken a abstract class so that we can have (has-a) relation
     * i.e reference to base pizza class here instead of taking it in both
     * of concrete classes of toppings
     */
    BasePizza basePizza;
    Toppings(BasePizza basePizza){
        this.basePizza = basePizza;
    }

}
