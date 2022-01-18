import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringDate{
	public static void main(String args[]){
		String dateStr = "2022-01-31";
		LocalDate date = LocalDate.parse(dateStr);
		String strDate = date.format(DateTimeFormatter.ISO_DATE);
		System.out.println("Date format: " + date);
		System.out.println("String format: " + strDate);
	}
}
