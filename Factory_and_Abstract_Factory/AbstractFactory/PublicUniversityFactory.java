package Factory_and_Abstract_Factory.AbstractFactory;

public class PublicUniversityFactory extends UniversityFactory{
    @Override
    public FeeCalculator getFeeCalculator(String course) {
        return switch (course){
            case "ComputerScience" ->  new StJonesFeesCalculator();
            case "Law" ->  new MaximaSchoolFeesCalculator();
            default-> null;
        };
    }
}
