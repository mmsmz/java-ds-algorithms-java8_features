package programms;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import static java.time.temporal.ChronoField.*;
public class stackoverflow {
	
	
	public static void main(String[] args) {
		System.out.println(getTimeRange("2019-12-02 10:00:20"));
	}
	
	private static final DateTimeFormatter formatterInput =
            new DateTimeFormatterBuilder ()
                    .appendValue ( YEAR )
                    .optionalStart ()
                    .appendLiteral ( '-' )
                    .appendValue ( MONTH_OF_YEAR )
                    .optionalStart ()
                    .appendLiteral ( '-' )
                    .appendValue ( DAY_OF_MONTH )
                    .optionalStart ()
                    .appendLiteral ( ' ' )
                    .appendValue ( HOUR_OF_DAY )
                    .optionalEnd ()
                    .optionalEnd ()
                    .optionalEnd ()
                    .parseDefaulting ( MONTH_OF_YEAR , 1 )
                    .parseDefaulting ( DAY_OF_MONTH , 1 )
                    .parseDefaulting ( HOUR_OF_DAY , 0 )
                    .parseDefaulting ( MINUTE_OF_HOUR , 0 )
                    .parseDefaulting ( SECOND_OF_MINUTE , 0 )
                    .toFormatter ();

		private static final DateTimeFormatter formatterOutput = DateTimeFormatter.ofPattern ("yyyy-MM-dd HH:mm:ss");
	
		private static LocalDateTime getTimeRange(String text) {
			return LocalDateTime.parse(text, formatterOutput);
		}

}
