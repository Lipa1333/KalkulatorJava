package Kalkulator;
import java.util.ArrayList;
import java.util.List;
public class Obliczacz {
	public static  void Licz(List<Double> liczby, List<String> znaki)
	{
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
	}
}
