//Program to represent a Java number in Inida, US and UK currency form.

import java.text.*;
import java.util.*;

class NumberFormatDemo1
{
	public static void main(String[] args) 
	{
		double val = 123456.789;

		Locale india = new Locale("pa", "IN");
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(india);
		System.out.println("Indian specific form: "+nf1.format(val));

		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("US specific form: "+nf2.format(val));

		NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println("UK specific form: "+nf3.format(val));
	}
}