public class StringFloat{
	public static void main(String args[]){
		// String to Float
		String str = "23.6";
		float f = Float.parseFloat(str);
		System.out.println(f);
		// Float to String
		float val = 80.7f;
		System.out.println(String.valueOf(val));
		System.out.println(Float.toString(val));
	}
}
