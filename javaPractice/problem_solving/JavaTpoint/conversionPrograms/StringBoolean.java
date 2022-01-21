public class StringBoolean{
	public static void main(String args[]){
		// string to boolean
		String s1 = "true";
		String s2 = "True";
		String s3 = "ok";
		Boolean b1 = Boolean.valueOf(s1);
		Boolean b2 = Boolean.valueOf(s2);
		Boolean b3 = Boolean.valueOf(s3);
		System.out.println(b1 + " " + b2 + " " + b3);

		// boolean to string
		boolean b4 = true;
		boolean b5 = false;
		String s4 = String.valueOf(b4);
		String s5 = String.valueOf(b5);
		System.out.println(s4 + " " + s5);

		String s6 = Boolean.toString(b4);
		String s7 = Boolean.toString(b5);
		System.out.println(s6);
		System.out.println(s7);
	}
}
