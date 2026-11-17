package uebersetzer;

import de.hsrm.mi.prog.util.StaticScanner;

public class Uebersetzer {
	public static void main(String[] args) {
		int zahl = StaticScanner.nextInt();
		String hunderter; 
		String zehner;
		String einser;
		
		String hundert = "eins";
		
		if (zahl > 100) {
			if (zahl < 200) {
				hundert = "ein";
			}
			else if (zahl < 300) {
				hundert = "zwei";
			}
			else if (zahl < 400) {
				hundert = "drei";
			}
			else if (zahl < 500) {
				hundert = "vier";
			}
			else if (zahl < 600) {
				hundert = "fünf";
			}
			else if (zahl < 700) {
				hundert = "sechs";
			}
			else if (zahl < 800) {
				hundert = "sieben";
			}
			else if (zahl < 900) {
				hundert = "acht";
			}
			else if (zahl < 1000) {
				hundert = "neun";
			}
			System.out.println(hundert);
		}
	}
	

}
