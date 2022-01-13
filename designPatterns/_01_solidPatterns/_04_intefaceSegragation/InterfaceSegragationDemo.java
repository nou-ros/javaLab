package _04_intefaceSegragation;

interface ShapeInterface{
    public double area();
}

interface SolidShapeInterface{
    public double volume();
}

interface ManageShapeInterface{
    public double calculate();
}

class Cube implements ShapeInterface, SolidShapeInterface, ManageShapeInterface{
    @Override
    public double volume() {
        // Calculate the surface area of the cuboid
        return 1.0;
    }

    @Override
    public double area() {
        // Calculate the volumne of the cuboid
        return 1.0;
    }

    @Override
    public double calculate() {
        // 
        return this.area() + this.volume();
    }
}

class Square implements ShapeInterface, ManageShapeInterface{

    @Override
    public double calculate() {
        // 
        return this.area();
    }

    @Override
    public double area() {
        return 2.0;
    }

}

public class InterfaceSegragationDemo {
    public static void main(String[] args) {
        // Segragate interfaces 
    }
}
