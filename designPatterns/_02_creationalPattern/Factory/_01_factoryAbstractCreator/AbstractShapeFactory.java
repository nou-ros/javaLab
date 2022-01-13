package _01_factoryAbstractCreator;

// create subclass for every single shapes.
abstract public class AbstractShapeFactory {
    protected abstract Shape factoryMethod();
    public Shape getShape(){
        return factoryMethod();
    }
    // other helper methods
}

class RectangleFactory extends AbstractShapeFactory{
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}

class CircleFactory extends AbstractShapeFactory{
    protected Shape factoryMethod() {
        return new Circle();
    }
}

class SquareFactory extends AbstractShapeFactory{
    protected Shape factoryMethod() {
        return new Square();
    }
}
