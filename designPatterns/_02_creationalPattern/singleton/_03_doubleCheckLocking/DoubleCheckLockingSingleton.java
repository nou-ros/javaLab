package _03_doubleCheckLocking;

// thread safe and performace does not reduce
public class DoubleCheckLockingSingleton {
    public static void main(String [] args)
	{
		Singleton s =  Singleton.getInstance();
		s.setData(5);
		
		System.out.println("First reference: " + s);
		System.out.println("Singleton data value is: " + s.getData());

		//Get another reference to the singleton
		// Is it the same object? yes.
		s = null;
		s = Singleton.getInstance();
		System.out.println("\nSecond reference: " + s);
		System.out.println("Singleton data value is: " + s.getData());
	}
}

//Singleton classes are used for resources such as filesystem, database connections etc
