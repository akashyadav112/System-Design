package Factory_and_Abstract_Factory.AbstractFactory;

public class HarvardFeeCalculator implements FeeCalculator{
    @Override
    public int getFees() {
        return 50000;
    }
}
