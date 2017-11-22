//Program to display current system date according to US, UK and ITALY styles.

import java.text.*;
import java.util.*;

class DateFormatDemo2
{
	public static void main(String[] args) 
	{
		DateFormat us = DateFormat.getDateInstance(0, Locale.US);
		DateFormat uk = DateFormat.getDateInstance(0, Locale.UK);
		DateFormat italy = DateFormat.getDateInstance(0, Locale.ITALY);
		
		System.out.println("US Style is: "+us.format(new Date()));
		System.out.println("UK Style is: "+uk.format(new Date()));
		System.out.println("ITALY Style is: "+italy.format(new Date()));
	}	
}