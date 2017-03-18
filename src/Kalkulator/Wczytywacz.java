package Kalkulator;

import java.util.List;

public class Wczytywacz{
	
	
	
	
	public static short analizuj(List<Double> liczby,List<String> znaki,String bufor)
	{
		if(bufor.contains("koniec"))
		{
			return 1;
		}
		
		return podzielLinie(bufor,liczby,znaki);
	}
	
	private static short podzielLinie(String Dane,List<Double> liczby,List<String> znaki)
	{
		int i=0;
		String tmp_liczba="";
		
		while(i<Dane.length())
		{
			while (i<Dane.length()&&Character.isDigit(Dane.charAt(i)))
			{
				tmp_liczba+=Dane.charAt(i);
				i++;
				if(i>=Dane.length()||!Character.isDigit(Dane.charAt(i)))
				{
					liczby.add(Double.parseDouble(tmp_liczba));
					tmp_liczba="";
				}
			}
			if(i<Dane.length()&&(Dane.charAt(i)=='+'||Dane.charAt(i)=='-'||Dane.charAt(i)=='*'||Dane.charAt(i)=='/'))
			{
				znaki.add(Character.toString(Dane.charAt(i)));
				
			}
			i++;
			
			
		}
		if(liczby.size()==znaki.size()+1)
		{
			return 0;
		}
		else
		{
			return 2;
		}
	}
}
