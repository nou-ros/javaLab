public class IntLong{
	public static void main(String args[]){
		// Long to Int
		long l = 500L;
		int i = (int)l;
		Long longNum = 100L;
		int intNum = longNum.intValue();
		System.out.println(i);
		System.out.println(intNum);

		//Int to Long
		int val = 200;
		long lval = val;
		System.out.println(lval);
		int val2 = 100;
		Long lval2 = Long.valueOf(val2);
		System.out.println(lval2);

	}
}
