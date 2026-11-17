package uebersetzer;

import de.hsrm.mi.prog.util.StaticScanner;

public class Uebersetzer {
	public static void main(String[] args) {
		int zahl = StaticScanner.nextInt();
		
		int hunderterZahl = (zahl/100) % 10;
		int zehnerZahl = (zahl/10) % 10;
		int einerZahl = zahl % 10;
		String hunderterWort = ""; 
		String zehnerWort = "";
		String einerWort = "";
		

		switch(hunderterZahl) {
		case 9 -> hunderterWort = "neunhundert";
		case 8 -> hunderterWort = "achthundert";
		case 7 -> hunderterWort = "siebenhundert";
		case 6 -> hunderterWort = "sechshundert";
		case 5 -> hunderterWort = "fünfhundert";
		case 4 -> hunderterWort = "vierhundert";
		case 3 -> hunderterWort = "dreihundert";
		case 2 -> hunderterWort = "zweihundert";
		case 1 -> hunderterWort = "einhundert";
		case 0 -> hunderterWort = "";
		}
		switch(zehnerZahl) {
		case 9 -> zehnerWort = "neunzig";
		case 8 -> zehnerWort = "achtzig";
		case 7 -> zehnerWort = "siebzig";
		case 6 -> zehnerWort = "sechzig";
		case 5 -> zehnerWort = "fünfzig";
		case 4 -> zehnerWort = "vierzig";
		case 3 -> zehnerWort = "dreisig";
		case 2 -> zehnerWort = "zwanzig";
		case 1 -> zehnerWort = "zehn";
		case 0 -> zehnerWort = "";
		}
		switch(einerZahl) {
		case 9 -> einerWort = "neun";
		case 8 -> einerWort = "acht";
		case 7 -> einerWort = "sieben";
		case 6 -> einerWort = "sechs";
		case 5 -> einerWort = "fünf";
		case 4 -> einerWort = "vier";
		case 3 -> einerWort = "drei";
		case 2 -> einerWort = "zwei";
		case 1 -> einerWort = "ein";
		case 0 -> einerWort = "";
		}
		
		if(zahl > 100 ) {
			System.out.println(hunderterWort + einerWort + "und" + zehnerWort);
		}
		else if(zahl < 100 && zahl > 10) {
			System.out.println(einerWort +"und"+ zehnerWort); 
		}
		else if(zahl < 10) {
			System.out.println(einerWort);
		}
		
	}
	

}
