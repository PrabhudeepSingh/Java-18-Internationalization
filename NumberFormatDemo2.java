//Program to represent a Java number in Italy specific form.

import java.text.*;
import java.util.*;

class NumberFormatDemo2
{
	public static void main(String[] args) 
	{
		double val = 123456.789;

		NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
		System.out.println("ITALY specific form: "+nf.format(val));		
	}	
}