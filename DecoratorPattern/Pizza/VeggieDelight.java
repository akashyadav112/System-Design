package DecoratorPattern.Pizza;

public class VeggieDelight implements BasePizza{
    @Override
    public int cost() {
        return 200;
    }
}
