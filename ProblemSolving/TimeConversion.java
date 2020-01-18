package ProblemSolving;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) throws ParseException {

		Scanner scanner = new Scanner(System.in);
		
		String _12HourFormat = scanner.nextLine();
		
		scanner.close();

		DateFormat inputDateFormat = new SimpleDateFormat("hh:mm:ssaa");
		DateFormat outPutFormat = new SimpleDateFormat("HH:mm:ss");

		String _24HourFormat;
		Date date;

		date = inputDateFormat.parse(_12HourFormat);

		_24HourFormat = outPutFormat.format(date);

		System.out.println(_24HourFormat);
	}

}
