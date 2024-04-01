package Factory_and_Abstract_Factory.AbstractFactory;

public class ClientCode {
    public static void main(String[] args){
        UniversityFactory universityFactory = UniversityFactory.getUniversity(129);
        FeeCalculator feeCalculator = universityFactory.getFeeCalculator("ComputerScience");
        System.out.println(feeCalculator.getFees());
    }
    /*
     * Factory of factory pattern
     * creating objects which belongs to a family of similar objects
     *          pros
     * good for abstraction and family of similar objects
     * loose coupling b/w client and actual concrete code
     * follow single responsibility principle
     * support open closed principle
     *          cons
     * code becomes complex
     */
}
