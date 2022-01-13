package _02_facotryConcreteCreator;

public class Client {
    public static void main(String[] args) {
        ConcreteShapeFactory shape1 = new ConcreteShapeFactory();
        shape1.getShape("circle").draw();
        ConcreteShapeFactory shape2 = new ConcreteShapeFactory();
        shape2.getShape("rectangle").draw();
        ConcreteShapeFactory shape3 = new ConcreteShapeFactory();
        shape3.getShape("Square").draw();
    }
}
