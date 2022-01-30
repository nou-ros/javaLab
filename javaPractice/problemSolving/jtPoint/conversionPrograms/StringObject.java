public class StringObject{
	public static void main(String args[]){
		// String to Object
		String s = "hello";
		Object obj = s;
		System.out.println(obj);
		
		System.out.println("\n\n");
		// Object to String
		Emp e = new Emp();
		String str = e.toString();
		String s2 = String.valueOf(e);
		System.out.println(str);
		System.out.println(s2);

		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String rev = sb.toString(); // converting StringBuilder to String
		System.out.println(sb.getClass());
		System.out.println(rev.getClass());
	}
}

class Emp{}
