package _04_eagerInitialization;

// no if condition
// thread safe
// best approach
public class Singleton {
    // the private reference to the one and only instance
	private static Singleton uniqueInstance = new Singleton();

	// an instance attribute 
	private int data = 0;
	
	/**
	 * The singleton constructor
	 * It is private
	 * No client can instantiate a singleton object
	 */
	 private Singleton(){}

	 public static Singleton getInstance(){
		 return uniqueInstance;
	 }

	 public void setData(int myData){
		 data = myData; 
	 }

	 public int getData(){
		 return data;
	 }
}
