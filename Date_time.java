import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Date_time {

		final static DateFormat sdf = new SimpleDateFormat("MM/DD/YYYY  hh:mm:ss"); 
		private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/DD/YYYY  hh:mm:ss");
		public static void main(String[] args) { 
			
			Date date = new Date();
			System.out.println(sdf.format(date));  
			
			Calendar cal = Calendar.getInstance();
			System.out.println(sdf.format(date));
			
			LocalDateTime now = LocalDateTime.now();
			System.out.println(dtf.format(now));
			
			LocalDate localDate = LocalDate.now(); 
			System.out.println(DateTimeFormatter.ofPattern("MM/DD/YYYY  hh:mm:ss").format(localDate)); 
			
			
			
		}

}
