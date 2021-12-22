public class ArrayDemo3{
	public static void main(String[] args)
	{
		String[] copyFrom = {
			"Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
			"Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchianato",
			"Marocchino","Ristretto"
		};

		String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);

		for(String coffee : copyTo)
		{
			System.out.println(coffee + " ");
		}
	}	
}
