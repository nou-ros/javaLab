public class InnerClassExample{
	private String outVar = "I am outer Variable";
	
	class InnerClassDemo{
		String local = "Local inner class variable";
		public void seeOuter(){
			System.out.println("I am accessing outer class variable from inner class's normal method. " + outVar);
			System.out.println("Accesing local variable. " + local);
		}
	}

	public void doThings(){
		String work = "magical work";
		class InnerMethodClass{
			public void innerClassMethod(){
				System.out.println(work);
			}
		}
		InnerMethodClass inmethcl = new InnerMethodClass();
		inmethcl.innerClassMethod();	
	}

	public void innerInstance(){
		InnerClassDemo inner = new InnerClassDemo();
		inner.seeOuter();
	}
	
	public static void main(String args[]){
		InnerClassExample outer = new InnerClassExample();
		outer.innerInstance();
		outer.doThings();

		/**
		 * output: 
		 *I am accessing outer class variable from inner class's normal method.I am outer Variable
		 * Accesing local variable.Local inner class variable
		 * magical work
		 */

	}
}
