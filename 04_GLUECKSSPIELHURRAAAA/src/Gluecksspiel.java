
public class Gluecksspiel {
	public static void main(String[] args) {
		int randomBecher = (int)(Math.random() * 3 + 1);
		System.out.println("hinter welchem dieser drei becher liegt die münze? :3 ");
		int zahleingabe = (StaticScanner.nextInt());
		
		System.out.println("die Münze lag hinter: " + (randomBecher));
		
		if (zahleingabe == randomBecher) {
			System.out.println("GEWINN HURRAA!!");
		}
		else {
			System.out.println("sadness");
		}
	}

}
