package Factory_and_Abstract_Factory.AbstractFactory;

public abstract class UniversityFactory {
    private final static int cutOff = 120;

    public static UniversityFactory getUniversity(int marks){
        if(marks>cutOff){
            return new IvyLeagueUniversityFactory();
        }else{
            return new PublicUniversityFactory();
        }
    }

    public abstract FeeCalculator getFeeCalculator(String course);
}
