import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDemo5{
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Grape");
		list.add("Banana");
		list.add("Apple");

		System.out.println(list);
		ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println(intList);
	}
}
