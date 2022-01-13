package _01_factoryAbstractCreator;
/**
 * The factory design pattern says that define an interface ( A java 
 * interface or an abstract class) and let the subclasses decide 
 * which object to instantiate.
 *  */ 

public interface Shape{
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
        System.out.println("Inside Rectangle :: Square() method");
    }
}