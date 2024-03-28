package DecoratorPattern.Pizza;

public class PeppyPaneer implements BasePizza{
    @Override
    public int cost() {
        return 250;
    }
}
