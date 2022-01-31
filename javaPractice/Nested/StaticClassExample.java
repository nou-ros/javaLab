class StaticClassExample{
	int var = 5;
	static int num;
	static String classStr = "Hello World!";	
	static String mystr;
	static {
		System.out.println("Static block 1");
		num = 9;
		mystr = "block 1";
	}
	static{
		System.out.println("Static block 2");
		num = 98;
		mystr= "block 2";
	}
	static void myMethod(){
		System.out.println(classStr);
		System.out.println("static my method");
	}
	
	static void display(){
		System.out.println("static display method");	
	}

	void normalMethod(){
		System.out.println("I am a normal class method. Calling a static class method");
		display();
	}

	static class MyNestedStaticClass{
		public void work(){
			System.out.println("I am nested static class's normal method");
		}
	}

	public static void main(String args[]){
		System.out.println("Main initialized");
		myMethod();
		System.out.println("Value of num: " + num);
		System.out.println("Value of str: " + mystr);

		StaticClassExample obj = new StaticClassExample();
		obj.var = 10;
		System.out.println("Normal class var: " + obj.var);
		System.out.println("Static variable refernce with object one: " + obj.num); 

		StaticClassExample obj2 = new StaticClassExample();
		obj2.var = 15;
		System.out.println("Normal class var: " + obj2.var);
		System.out.println("Static variable reference with object two: " + obj2.num); 
	
		obj.normalMethod();

		StaticClassExample.MyNestedStaticClass nestedObj = new StaticClassExample.MyNestedStaticClass();
		nestedObj.work();
	}
}
