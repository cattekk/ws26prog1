
public class Tuersteher {
	public static void main(String[] args) {
		boolean einlass;
		
		System.out.println("Bist du Über 18?");
		boolean alter = StaticScanner.nextBoolean();
		System.out.println("Hast du ein Kostüm?");
		boolean kostuem = StaticScanner.nextBoolean();
		System.out.println("hast du süssigkeiten?");
		boolean suessigkeiten = StaticScanner.nextBoolean();
		
		if  (alter && kostuem &! suessigkeiten) {
			einlass = true;
			System.out.println("Einlass: "+ einlass);	
		}
		else {
			einlass = false;
			System.out.println("hinfort");
		}


	}

}
