abstract class Base{
	Base(){
		System.out.println("Base Constructor called");
	}
	abstract void abstractMethod();
	void normalMethod(){
		System.out.println("Base class method fun called");
	}
	final void finalMethod(){
		System.out.println("Base final method. Cann't be overridden by sub class");
	}
	static void staticMethod(){
		System.out.println("Base class static method");
	}
}

class Derived extends Base{
	Derived(){
		System.out.println("Derived Constructor called");
	}
	@Override
	void abstractMethod(){
		System.out.println("Derived method() called");
	}
}

class AbstractClass{
	public static void main(String args[]){
		Derived b = new Derived();
		b.abstractMethod();
		b.normalMethod();
		b.finalMethod();
		b.Base.staticMethod();
	}
}
