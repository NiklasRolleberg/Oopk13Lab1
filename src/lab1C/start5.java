package lab1C;

import java.util.Arrays;

public class start5 { //C
	static simtek a;
	static simtek b;
	public static void main(String[] args) {
		
		try{										// Försöker skapa en simtekare
			a = new simtek(10,"Jessica",2005);			
		}catch(IllegalArgumentException e){}		// Fångar simteks felmeddelenade
		
		try{
			b = new simtek(10,"Niklas",2004);	
		}catch(IllegalArgumentException e){}
		
//		System.out.println(a);						// Skriver ut simtek a
//		System.out.println(b);						// ---*-----        b
//		
		Human[] st = {b, a};
		
		Arrays.sort(st);
		
		System.out.println(a.compareTo(b));
		
		for (Human h : st) {
			System.out.println(h);
		}
		
	}

}
