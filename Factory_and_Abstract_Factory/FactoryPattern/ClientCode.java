package Factory_and_Abstract_Factory.FactoryPattern;

public class ClientCode {
    public static void main(String [] args){
        Shape s = ShapeFactory.getShape("Circle");
        // now we can introduce pyramid, octa, rectangle and many more share, we just add them in there
        // it is not tightly here in client code.
        s.draw();
    }
}
