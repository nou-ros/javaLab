@FunctionalInterface
interface One{
	public void firstInterfaceMethod();
}


interface Two{
	public void secondInterfaceMethod();
}


interface Three extends One, Two{
	public void thirdInterfaceMethod();
}


class InterfaceHandler implements Three{	
	public void firstInterfaceMethod(){
		System.out.println("I am First interface method");
	};

	public void secondInterfaceMethod(){
		System.out.println("I am Second interface method");
	}

	public void thirdInterfaceMethod(){
		System.out.println("I am Third interface method");
	}

}


class MultipleInhertance{
	public static void main(String args[]){
		InterfaceHandler obj = new InterfaceHandler();
		obj.firstInterfaceMethod();
		obj.secondInterfaceMethod();
		obj.thirdInterfaceMethod();
	}
}
