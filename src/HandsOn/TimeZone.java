package HandsOn;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZone {

	public static void main(String[] args) {
			
		LocalDateTime dt=LocalDateTime.now();
//		System.out.println(dt);
		
		DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("hh:mm:ss a");
		String str=dt.format(formatter1);
		System.out.println("Time with AM/PM field : "+str);	

	}

}
