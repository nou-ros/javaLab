package _03_factoryStaticMethodCreator;

@FunctionalInterface
public interface Shape {
    void draw();
}

class Rectangle implements Shape{
    @Override
    public void draw(){
        System.out.println("Inside Rectangle :: draw() method");
    }
}

class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println("Inside Circle :: draw() method");
    }
}

class Square implements Shape{
    @Override
    public void draw(){
        System.out.println("Inside Square :: draw() method");
    }
}
