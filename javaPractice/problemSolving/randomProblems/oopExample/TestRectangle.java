class Rectangle{
    private float length;
    private float width;
   
    Rectangle(){
        length = 1.0f;
        width = 1.0f;
    }
   
    Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }
   
    public void setLength(float length){
        this.length = length;
    }
   
    public float getLength(){
        return this.length;
    }
   
    public void setWidth(float width){
        this.width = width;
    }
   
    public float getWidth(){
        return this.width;
    }
   
    public double getArea(){
        return width * length;
    }
   
    public double getPerimeter(){
        return 2*(width + length);
    }
   
    public String toString(){
        return "Rectangle [length = " + length + " and width= " + width + "]";
    }
}


public class TestRectangle{
    public static void main(String args[]){
        Rectangle r1 = new Rectangle(1.2f, 3.4f);
        System.out.println(r1);
        Rectangle r2 = new Rectangle();
        System.out.println(r2);
       
        r1.setLength(5.6f);
        r1.setWidth(7.8f);
        System.out.println(r1);
        System.out.println("length is : " + r1.getLength());
        System.out.println("width is : " + r1.getWidth());
       
        System.out.printf("area is : %.2f%n", r1.getArea());
        System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());
        System.out.println(r1);       
    }
}
