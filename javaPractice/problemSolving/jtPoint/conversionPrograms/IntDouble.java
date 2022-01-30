public class IntDouble{
	public static void main(String args[]){
		// Int to Double
		int i = 200;
		double d = i;
		System.out.println(d);
		Double d2 = Double.valueOf(i);
		System.out.println(d2);
		

		// Double to Int
		double di = 10.5;
		int id = (int)di;
		Double value = 12D;
		int id2 = value.intValue();
		System.out.println(id);
		System.out.println(id2);
	}
}
