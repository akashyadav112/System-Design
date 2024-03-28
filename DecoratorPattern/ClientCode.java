package DecoratorPattern;


import DecoratorPattern.Pizza.BasePizza;
import DecoratorPattern.Pizza.PeppyPaneer;
import DecoratorPattern.Pizza.VeggieDelight;
import DecoratorPattern.PizzaDecorator.CheeseTopping;
import DecoratorPattern.PizzaDecorator.MushroomToppings;
import DecoratorPattern.PizzaDecorator.Toppings;

public class ClientCode {
    public static void main(String[] args) {
        // two base pizza's i have created
        BasePizza pizza1 = new PeppyPaneer();
        BasePizza pizza2 = new VeggieDelight();

        // now i want to add toppings
        // for the first pizza only 1 topping
        Toppings topping1 = new CheeseTopping(pizza1);
        System.out.println(topping1.cost());
        // for pizza2 i want to have both of the toppings
        Toppings toppings2 = new MushroomToppings(new CheeseTopping(pizza2));
        System.out.println(toppings2.cost());
        /***
         * so at run time, we are able to change the behaviour of objects/instacnes of classes
         * but it is not affecting other instances
         */


    }
}
