interface MyInterfaceA{
	void display();
	interface MyInterfaceB{
		void myMethod();
	}
}


class MyClass{
	interface MyInterfaceD{
		void display();
	}

}

class NestedInterface implements MyInterfaceA.MyInterfaceB, MyClass.MyInterfaceD{
	public void myMethod(){
		System.out.println("Nested interface method from interface");
	}

	public void display(){
		System.out.println("Nested interface method from class");
	}

	public static void main(String args[]){
		 MyInterfaceA.MyInterfaceB obj = new NestedInterface();
		 obj.myMethod();

		 MyClass.MyInterfaceD demo = new NestedInterface();
		 demo.display();
	}
}
