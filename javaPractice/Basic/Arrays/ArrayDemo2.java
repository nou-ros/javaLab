public class ArrayDemo2{
	public static void main(String[] args)
	{
		String [] copyForm = {
			"Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
			"Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchianato", "Marocchino", "Ristretto"
		};
		String [] copyTo = new String[7];
		System.arraycopy(copyForm, 2, copyTo,0,7);

		for(String coffee: copyTo)
		{
			System.out.println(coffee + " ");
		}
	}	
}
