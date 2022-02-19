class Circle{
    private double radius;
    private String color;
   
    public Circle(){
        radius = 1.0;
        color = "red";
    }
   
    public Circle(double radius){
        this.radius = radius;
        color = "red";
    }
   
    public double getRadius(){
        return radius;
    }
   
    public double getArea(){
        return radius * radius * Math.PI;
    }
   
    public void setRadius(double radius){
        this.radius = radius;
    }
   
    public void setColor(String color){
        this.color = color;
    }
   
    public String toString(){
        return "Circle [radius = " + radius + " color= " + color + "]";
    }
   
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
}

public class TestCricle{
    public static void main(String args[]){
        Circle c1 = new Circle();
        System.out.println("The circle has radius of " + c1.getRadius() + " and are of " + c1.getArea());
       
        Circle c2 = new Circle(2.0);
        System.out.println("the circle has radius " + c2.getRadius() + "and area of " + c2.getArea());
       
        Circle c4 = new Circle();   // construct an instance of Circle
        c4.setRadius(5.5);  
        c4.setColor("green");
       
        System.out.println(c4);
        System.out.printf("Circumference: %.2f%n", c4.getCircumference());
        System.out.println("End of execution!");
    }
}
