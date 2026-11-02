package schachbrett;

import de.hsrm.mi.prog.util.StaticScanner;

public class schachbrett {
	public static void main(String[] args) {
		//eingaben
		System.out.println("Buchstabe: ");
		char x = StaticScanner.nextChar();
		System.out.println("Zahl: ");
		int y = StaticScanner.nextInt();
		
		//mathemann
		int b = (x + y) % 2;
		System.out.println(b);
		
	}

}
