package _03_doubleCheckLocking;


public class Singleton {
    	// the private reference to the one and only instance
	private static Singleton uniqueInstance = null;

	// an instance attribute
	private int data = 0;
	
	/**
	 * The singleton constructor
	 * It is private
	 * No client can instantiate a singleton object
	 */
	 private Singleton(){}


	 public static synchronized Singleton getInstance(){
		 if(uniqueInstance == null)
			uniqueInstance = new Singleton();

		 return uniqueInstance;
	 }

	 public void setData(int myData){
		 data = myData; 
	 }

	 public int getData(){
		 return data;
	 }
}
