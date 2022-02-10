public class ThisKeyword{
    int a;
    int b;
   
    ThisKeyword(){
        this(100, 200);
        System.out.println("Inside default constructor a: " + a +" and  b: " + b);
    }
   
     ThisKeyword(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Inside parameterized constructor");
    }
   
    void get(){
        work(this);
    }
   
    void show(){
        System.out.println("Calling a class method with this keyword");
        this.message();
    }
   
    void work(ThisKeyword object){
        System.out.println("a = " + object.a + " b = " + object.b);
    }
   
    void message(){
        System.out.println("This is a test message");
    }
   
    void display(){
        System.out.println("a = " + a + " b = " + b);
    }
   
    public static void main(String[] args) {
        ThisKeyword test = new ThisKeyword();
        test.get();
        ThisKeyword dev = new ThisKeyword(10, 20);
        dev.display();
        dev.show();
    }
}
