import java.util.*;
class LocaleDemo
{
	public static void main(String[] args) 
	{
		Locale locale1 = Locale.getDefault();
		System.out.println(locale1.getCountry()+", "+locale1.getLanguage());
		System.out.println(locale1.getDisplayCountry()+", "+locale1.getDisplayLanguage());

		Locale locale2 = new Locale("pa","IN");
		Locale.setDefault(locale2);
		System.out.println(Locale.getDefault().getDisplayLanguage());

		String[] str1 = Locale.getISOLanguages();
		for(String s: str1)
			System.out.println(s);

		String[] str2 = Locale.getISOCountries();
		for(String s: str2)
			System.out.println(s);

		Locale[] lang = Locale.getAvailableLocales();
		for(Locale lcl: lang)
			System.out.println(lcl.getDisplayCountry()+", "+lcl.getDisplayLanguage());
	}	
}