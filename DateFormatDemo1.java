import java.text.*;
import java.util.*;

class DateFormatDemo1
{
	public static void main(String[] args) 
	{
		System.out.println("FUll form is: "+DateFormat.getDateInstance(0).format(new Date()));		
		System.out.println("Long form is: "+DateFormat.getDateInstance(1).format(new Date()));
		System.out.println("Medium form is: "+DateFormat.getDateInstance(2).format(new Date()));
		System.out.println("Short form is: "+DateFormat.getDateInstance(3).format(new Date()));
	}	
}