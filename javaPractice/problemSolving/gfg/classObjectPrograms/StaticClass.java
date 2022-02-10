public class StaticClass{
	static int a = 10;
	static int b;
	static double value = staticValue();
	static String linux = "REDHAT"; 
	static{
		System.out.println("Static block initialized");
		b = a * 4;
	} 
	static void message(){
		System.out.println("Static method message");
	}
	static double staticValue(){
		System.out.println("static method called");
		 return 20.07;
	}
	static class NestedStaticClass{
		public void dev(){
			System.out.println(linux);
		}
	}
	public static void main(String args[]){
		message();
		System.out.println("From main");
		System.out.println("Value of a : " + a);
		System.out.println("Value of b : " + b);
		System.out.println("Value of c : " + value);
		StaticClass.NestedStaticClass ootpa = new StaticClass.NestedStaticClass();
 		ootpa.dev();
	}
}
