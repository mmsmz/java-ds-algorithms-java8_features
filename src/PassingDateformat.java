import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;

public class PassingDateformat {
	 public static void main(String[] args) throws ParseException {
		  System.out.println(parseDate("2019-12-02 10:20:20"));
	  }
	 

		public static LocalDateTime parseDate(String dateString) {
			DateTimeFormatter parser =
				    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.ROOT);
			
		    String template = "1970-01-01 00:00:00";      
		    String text = dateString + template.substring(dateString.length());
		    //LocalDateTime.parse(text, parser);
		    return LocalDateTime.parse(text, parser);
		}
	  
	  public static String getTimeRange(String dateString) throws ParseException {			
		  Calendar selecteddate = Calendar.getInstance();
		  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");    
		  selecteddate.setTime(sdf.parse(dateString));
		  
		    String startTime = selecteddate.get(Calendar.HOUR_OF_DAY) + ":"
			        + selecteddate.get(Calendar.MINUTE) + ":" + selecteddate.get(Calendar.SECOND);
		   
		    selecteddate.add(Calendar.MINUTE, -20);
		    
		    String endTime = selecteddate.get(Calendar.HOUR_OF_DAY) + ":"
			        + selecteddate.get(Calendar.MINUTE) + ":" + selecteddate.get(Calendar.SECOND);
		    
		    
			return "Start Time: " + startTime + "\n" + "End Time: " + endTime;
			
	  }
	  
}
