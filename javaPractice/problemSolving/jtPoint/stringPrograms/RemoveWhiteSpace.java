public class RemoveWhiteSpace{
	public static void main(String args[]){
		String str = " Remove white spaces ";
		str = str.replaceAll("\\s+","");
		System.out.println(str);
	}
}
