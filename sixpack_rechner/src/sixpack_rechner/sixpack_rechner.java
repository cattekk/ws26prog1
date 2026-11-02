package sixpack_rechner;

import de.hsrm.mi.prog.util.StaticScanner;

public class sixpack_rechner {
	public static void main(String[] args) {
		System.out.println("wie viele getränke möchten sie c: ? ");
		int Getraenke = StaticScanner.nextInt();
		
		int Sixpacks = Getraenke / 6; 
		int Flaschen = Getraenke % 6; 
		int Gratisglaeser = Getraenke / 3; 
		
		System.out.println("benötigte sixpacks: "+ Sixpacks);
		System.out.println("benötigte Flaschen" + Flaschen);
		System.out.println("so viele gläser bekommen sie gratis: " + Gratisglaeser);
		
		
	}
		
}
