
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class time {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
        time suri = new time();
        suri.date();
        suri.month();
        suri.year();
        suri.hours();
        suri.minutes();
	}
public void date() {
	SimpleDateFormat Formatter= new SimpleDateFormat("dd");
	Date date = new Date();

    // display time and date using toString()
    System.out.println(Formatter.format(date));
	
}
public void month() {
	SimpleDateFormat Formatter= new SimpleDateFormat("MM");
	Date date = new Date();

    // display time and date using toString()
    System.out.println(Formatter.format(date));
	
}
public void year() {
	SimpleDateFormat Formatter= new SimpleDateFormat("yyyy");
	Date date = new Date();

    // display time and date using toString()
    System.out.println(Formatter.format(date));
	
}
public void hours() {
	SimpleDateFormat Formatter= new SimpleDateFormat("hh");
	Date date = new Date();

    // display time and date using toString()
    System.out.println(Formatter.format(date));
	
}
public void minutes() {
	SimpleDateFormat Formatter= new SimpleDateFormat("mm");
	Date date = new Date();

    // display time and date using toString()
    System.out.println(Formatter.format(date));
	
}
}
