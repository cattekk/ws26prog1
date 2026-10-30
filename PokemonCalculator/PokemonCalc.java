
public class PokemonCalc {
	public static void main(String[] args) {
		
		//scan Punkt 1 
		System.out.println("x koordinate Punkt 1 ");
		int x1 = StaticScanner.nextInt();
		System.out.println("y koordinate Punkt 1 : ");
		int y1 = StaticScanner.nextInt();
		
		//scan Punkt2 
		System.out.println("x koordinate Punkt 2 ");
		int x2 = StaticScanner.nextInt();
		System.out.println("y koordinate Punkt 2 : ");
		int y2 = StaticScanner.nextInt();
		
		
		//Rechnung ! 
		//math.pow(zahl, 1/2) ist wurzel weil wurzel ja hoch einhalb
		double abstand = Math.pow(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2), 0.5);
		System.out.println("Abstand: "+ abstand);
	}

}
