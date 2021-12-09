// fibonacci series with loop and recursion
class FibonacciSeries{
	static int first=0,second=1,temp=0;
	
	static void fibonacciLoop()
	{
		int seriesLimit = 5;
		System.out.print(first + " " + second);
		for(int i=2;i<seriesLimit;i++)
		{	
			temp = first;
			first = second;
			second = temp + first;
			System.out.print(" "+second);
		}
		System.out.println();
	}

	protected void fibonacciRecursion(int count){	
		if(count>0)
		{
			temp = first;
			first = second;
			second = temp+first;
			System.out.print(" "+second);
			fibonacciRecursion(count-1);
		}
	}

	public static void main(String[] args){
		fibonacciLoop();	
		int count = 5;
		FibonacciSeries recur = new FibonacciSeries();
		first = 0;
		second = 1;
		System.out.print(first + " " + second);
		recur.fibonacciRecursion(count-2);

	}
	
}
