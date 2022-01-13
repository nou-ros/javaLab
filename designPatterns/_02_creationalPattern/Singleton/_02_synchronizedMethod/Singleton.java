package _02_synchronizedMethod;

// the synchronization check will happen only one time, 
// at the beginning of first instance creation

public class Singleton {
    // the private volatile reference to the one and only instance
	private volatile static Singleton uniqueInstance = null;

	// an instance attribute
	private int data = 0;
	
	/**
	 * The singleton constructor
	 * It is private
	 * No client can instantiate a singleton object
	 */
	 private Singleton(){}

	 public static Singleton getInstance(){
		
		// we only synchronize the first time through
		synchronized(Singleton.class){
			if(uniqueInstance == null)
				uniqueInstance = new Singleton();
		}
		 return uniqueInstance;
	 }

	 public void setData(int myData){
		 data = myData; 
	 }

	 public int getData(){
		 return data;
	 }
}

