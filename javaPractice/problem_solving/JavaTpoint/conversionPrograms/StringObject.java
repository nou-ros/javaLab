public class StringObject{
	public static void main(String args[]){
		// string to object
		String s = "hello";
		Object obj = s;
		System.out.println(obj);
		try{
			Class c = Class.forName("java.lang.String");
			System.out.println("class name: " + c.getName());
			System.out.println("super class name: " + c.getSuperclass());
		}catch(ClassNotFoundException e){
			System.out.println(e);
		}
		
		System.out.println("\n\n");
		// object to string
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
