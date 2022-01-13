package _03_factoryStaticMethodCreator;

public class Client {
    public static void main(String[] args) {
        Shape shape1 = StaticShapeFactory.getShape("Circle");
        shape1.draw();
        Shape shape2 = StaticShapeFactory.getShape("Rectangle");
        shape2.draw();
        Shape shape3 = StaticShapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
