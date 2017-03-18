package Kalkulator;

import java.util.List;
public class Obliczacz {
	/*
	 * Wykonuje Wlasciwe obliczenia dla poprawnych juz list
	 */
	/*
	 * Wlasciwe funkcja:
	 */
	public static  void licz(List<Double> liczby, List<String> znaki)
	{
		//na tym etapie przyjmujemy ze listy sa juz poprawne
		System.out.println();
		for (int i = 0; i < znaki.size(); i++) {
			System.out.print(liczby.get(i) + znaki.get(i));
		}
		System.out.print(liczby.get(liczby.size()-1)+ "=");
		
		
		while(znaki.contains("*"))
		{
			int i = znaki.indexOf("*");
			Double liczba1 = liczby.get(i);
			Double liczba2 = liczby.get(i+1);
			liczby.set(i, liczba1*liczba2);
			znaki.remove(i);
			
			 liczby.remove(i+1);
			
		}
		while(znaki.contains("/"))
		{
			int i = znaki.indexOf("/");
			Double liczba1 = liczby.get(i);
			Double liczba2 = liczby.get(i+1);
			liczby.set(i, liczba1/liczba2);
			znaki.remove(i);
			
			 liczby.remove(i+1);
			
		}
		while(znaki.contains("+"))
		{
			int i = znaki.indexOf("+");
			Double liczba1 = liczby.get(i);
			Double liczba2 = liczby.get(i+1);
			liczby.set(i, liczba1+liczba2);
			znaki.remove(i);
			
			 liczby.remove(i+1);
			
		}
		while(znaki.contains("-"))
		{
			int i = znaki.indexOf("-");
			Double liczba1 = liczby.get(i);
			Double liczba2 = liczby.get(i+1);
			liczby.set(i, liczba1-liczba2);
			znaki.remove(i);
			
			 liczby.remove(i+1);
			
		}
		System.out.print(liczby.get(liczby.size()-1));
		System.out.println();
	}
}
