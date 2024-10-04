package StringProg;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;  
public class StringToDate {
	public static void main(String[] args) throws ParseException {

//		String sDate = "01/10/2024";
//
//		Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
//
//		System.out.println(sDate + "\t" + date1);


		Date date=Calendar.getInstance().getTime();
		DateFormat  dateFormat=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String strDate=dateFormat.format(date);
		System.out.println("Converted String:" +strDate);
		
		
		
		
		
		
	
	
	
	}

}
