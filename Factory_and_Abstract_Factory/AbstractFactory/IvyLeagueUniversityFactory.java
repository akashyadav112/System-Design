package Factory_and_Abstract_Factory.AbstractFactory;

public class IvyLeagueUniversityFactory extends UniversityFactory{
    @Override
    public FeeCalculator getFeeCalculator(String course) {
        return switch (course){
            case "ComputerScience" ->  new MitFeeCalculator();
            case "Law" ->  new HarvardFeeCalculator();
            default-> null;
        };
    }
}
