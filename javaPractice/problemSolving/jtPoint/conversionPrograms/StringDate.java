import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringDate{
	public static void main(String args[]){
		// String to Date
		String dateStr = "2022-01-31";
		LocalDate date = LocalDate.parse(dateStr);
		System.out.println("Date format: " + date);
		
		// Date to String
		String strDate = date.format(DateTimeFormatter.ISO_DATE);
		System.out.println("String format: " + strDate);
	}
}
