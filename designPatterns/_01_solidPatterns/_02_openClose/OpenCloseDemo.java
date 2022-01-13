package _02_openClose;

// open for extention and closed for modification

// open for extention with interface
interface Shape{
    public double calculateArea();
}

// closed for modification with AreaCalculator closed
class AreaCalculator{
    public double calculateShapeArea(Shape shape){
        return shape.calculateArea();
    }
}

class Rectangle implements Shape{
    public double length;
    public double width;

    public double calculateArea(){
        return length * width;
    }
}

class Circle implements Shape{
    public double radius;

    public double calculateArea(){
        return (22/7) * radius * radius;
    }
}


public class OpenCloseDemo {
    public static void main(String[] args) {
        AreaCalculator ac = new AreaCalculator();
        Circle circle = new Circle();
        circle.radius = 5.5;
        System.out.println(ac.calculateShapeArea(circle));
    }
}
