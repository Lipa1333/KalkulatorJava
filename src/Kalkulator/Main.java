package Kalkulator;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.List;

public class Main {
	public static void main(String[] args)
	{
		List<Double> liczby = new ArrayList<Double>();
		List<String> znaki = new ArrayList<String>();
		short odpowiedzZWczytywacza=0;
		String bufor="";
	
		Scanner odczyt = new Scanner(System.in);
		while(!bufor.equals("Wyjdz"))
		{
			
		
		System.out.println("1. Wczytywanie z Konsoli");
		System.out.println("2. Wczytywanie z Pliku");
		System.out.println("Wyjdz. Wyjdz");
		System.out.println("Podaj odpowiedz: ");
		bufor="0";
		
		bufor = odczyt.nextLine();
		switch(bufor.charAt(0))
		{
		case '1':
			do
			{
				if(odpowiedzZWczytywacza!=0&& odpowiedzZWczytywacza!=1)
				{
					System.out.println("Blad!");
				}
				liczby.clear();
				znaki.clear();
				
				bufor ="";
				System.out.println("Dzialanie: ");
				bufor = odczyt.nextLine();
				odpowiedzZWczytywacza =Analizator.analizuj(liczby, znaki, bufor);
				if(odpowiedzZWczytywacza==0)
				{
					Obliczacz.licz(liczby, znaki);
				}
				
			}while(odpowiedzZWczytywacza!=1);
			
			break;
			
		case '2':
			liczby.clear();
			znaki.clear();
			bufor ="";
			System.out.println("Plik: ");
			bufor = odczyt.nextLine();
			Scanner plikowy;
			File plik = new File(bufor);
		    try {
				plikowy  = new Scanner(plik);
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
				System.out.println("Brak Pliku! ");
				break;
			}
		  while (plikowy.hasNextLine()) {
			  liczby.clear();
				znaki.clear();
			  bufor = plikowy.nextLine();
			  odpowiedzZWczytywacza =Analizator.analizuj(liczby, znaki, bufor);
			  if(odpowiedzZWczytywacza==0)
				{
					Obliczacz.licz(liczby, znaki);
				}
			
		}
			
			
		
			break;
		
		default:
			
				break;
				
		}
		
		
		}
		odczyt.close();
		
		
	}
	
}
