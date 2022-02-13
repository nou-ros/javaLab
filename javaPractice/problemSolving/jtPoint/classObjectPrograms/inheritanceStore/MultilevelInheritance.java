class One{
	public void parentMethod(){
		System.out.println("Hey, I am parent method");
	}
}


class Two extends One{
	public void childMethod(){
		System.out.println("Hey, I am child method");
	}
}


class Three extends Two{
	public void multilevelMethod(){
		System.out.println("Hey, I am multilevel method");
	}
}

public class MultilevelInheritance{
	public static void main(String args[]){
		Three obj = new Three();
		obj.parentMethod();
		obj.childMethod();
		obj.multilevelMethod();
	}	
}
