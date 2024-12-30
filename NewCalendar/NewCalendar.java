import java.util.Calendar;
import java.util.GregorianCalendar;
import static java.lang.System.out;

class NewCalendar{
	public static void main(String[] args){
		Calendar calendar = Calendar.getInstance();
		out.println(calendar.getTime());

		Calendar newCalendar = new GregorianCalendar();
		out.println(newCalendar.getTime());
	}
}