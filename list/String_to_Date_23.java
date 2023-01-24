package list;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class String_to_Date_23 {
	  public static void main(String[] args) {
	        // Format y-M-d or yyyy-MM-d
	        String string = "2022-12-25";
	        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);

	        System.out.println(date);
	    }
}
