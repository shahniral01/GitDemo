import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date_Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Date Code
		Date d = new Date();
		System.out.println(d.toString());
		
		//Simple Date Formatter
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/YY");
		System.out.println(sdf.format(d));
	
		//Calendar class 
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		
	}

}
