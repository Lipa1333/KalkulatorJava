package Kalkulator;
import java.util.ArrayList;
import java.util.List;
public class Main {
	public static void main(String[] args)
	{
		List<Double> liczby = new ArrayList<Double>();
		List<String> znaki = new ArrayList<String>();
		
		liczby.add(2.0);
		liczby.add(3.0);
		znaki.add("/");
		

	
		Obliczacz.Licz(liczby, znaki);
	
		
		for (Double var : liczby) {
			System.out.println(var);
		}
	}
	
}
