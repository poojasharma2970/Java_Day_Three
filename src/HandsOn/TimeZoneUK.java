package HandsOn;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneUK {

	public static void main(String[] args) {
		ZonedDateTime currentZone=ZonedDateTime.now();
		ZoneId z=ZoneId.of("Europe/London");
		ZonedDateTime z1= currentZone.withZoneSameInstant(z);
//		System.out.println("\n"+z1);
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
		String str=z1.format(formatter);
		System.out.println("The date and time in UK time zone is : "+str);

	}

}
