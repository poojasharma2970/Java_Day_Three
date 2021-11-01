package HandsOn;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneUS {

	public static void main(String[] args) {
		ZonedDateTime currentZone=ZonedDateTime.now();
		ZoneId z=ZoneId.of("US/Central");
		ZonedDateTime z1= currentZone.withZoneSameInstant(z);
//		System.out.println("\n"+z1);
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
		String str=z1.format(formatter);
		System.out.println("The date and time in US time zone is : "+str);

	}

}
