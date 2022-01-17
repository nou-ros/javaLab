public class StringFloat{
	public static void main(String args[]){
		String str = "23.6";
		float f = Float.parseFloat(str);
		System.out.println(f);
		float val = 80.7f;
		System.out.println(String.valueOf(val));
		System.out.println(Float.toString(val));
	}
}
