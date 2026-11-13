
public class Tuersteher {
	public static void main(String[] args) {
		System.out.println("Bist du Über 18?");
		boolean alter = StaticScanner.nextBoolean();
		System.out.println("Hast du ein Kostüm?");
		boolean kostuem = StaticScanner.nextBoolean();
		System.out.println("hast du süssigkeiten?");
		boolean suessigkeiten = StaticScanner.nextBoolean();
		
		boolean einlass = alter && kostuem &! suessigkeiten;
		System.out.println("Einlass: "+ einlass);
		
	}

}
