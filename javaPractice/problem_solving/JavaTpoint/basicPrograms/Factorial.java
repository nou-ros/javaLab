class Factorial{
	private int num = 0;
	
	Factorial(int num){
		this.num = num;
	}
	
	Factorial(){
		
	}

	private int recurFact(int num){
		this.num=num;
		
		if(this.num<=1)
		{
			return 1;
		}	
		else
		{
			return (this.num * recurFact(this.num-1));	
		}
	}

	private int loopFactorial(){
		int fact=1;
		for(int i=1;i<=this.num;i++)
		{	
			fact *= i;	
		}
		return fact;	
	}

	public void display()
	{
		int res = loopFactorial();
		System.out.println("Factorial of "+this.num+" is: "+res);
	}

	public static void main(String[] args){
		Factorial value = new Factorial();
		System.out.println(value.recurFact(5));
	}
}

