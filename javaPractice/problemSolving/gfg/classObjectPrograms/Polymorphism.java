//Overriding and overloading
class Parent{
	void print(){
		System.out.println("Parent class");
	}
}


class ChildOne extends Parent{
	@Override
	void print(){
		System.out.println("Child one");
	}
}


class ChildTwo extends Parent{
	@Override
	void print(){
		System.out.println("Child two");
	}
}

class Helper{
	static int Multiply(int a, int b){
		return a * b;
	}

	static double Multiply(double a, double b){
		return a * b;
	}
}

public class Polymorphism{
	public static void main(String args[]){
		Parent obj;
		obj = new ChildOne();
		obj.print();

		obj = new ChildTwo();
		obj.print();
		
		System.out.println(Helper.Multiply(2, 4));
		System.out.println(Helper.Multiply(5.5, 6.3));
	}
}
