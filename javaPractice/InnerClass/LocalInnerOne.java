public class LocalInnerOne{
	private int data = 30;
	void display(){
		class Local{
			void msg(){
			 	System.out.println(data);
			}
		}	
		Local local = new Local();
		local.msg();
	}

	public static void main(String[] args)
	{
		LocalInnerOne localInnerOne = new LocalInnerOne();
		localInnerOne.display();
	}
}
