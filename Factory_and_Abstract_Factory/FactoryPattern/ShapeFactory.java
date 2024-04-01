package Factory_and_Abstract_Factory.FactoryPattern;

public class ShapeFactory {
    public static Shape getShape(String s){
        return switch (s) {
            case "Triangle" -> new Triangle();
            case "Circle" -> new Circle();
            case "Square" -> new Square();
            default -> null;
        };
    }
}
