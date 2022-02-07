class One{
	public void parent_method(){
		System.out.println("Hi I'm parent method");
	}
}

class Two extends One{
	public void child_method(){
		System.out.println("Hi, I'm child method");
	}
}

public class SingleInheritance{
	public static void main(String args[]){
		Two obj = new Two();
		obj.parent_method();
		obj.child_method();
	}
}
