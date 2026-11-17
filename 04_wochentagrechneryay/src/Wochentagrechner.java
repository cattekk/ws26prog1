
public class Wochentagrechner {
	public static void main(String[] args) {
		System.out.println("Geben sie einen Wochentag ein :D ALS ZAHL");
		int wochentag = StaticScanner.nextInt();
		
		switch (wochentag) {
		case 1:
			System.out.println("Montag");
			break;
		case 2:
			System.out.println("Dienstag");
			break;
		case 3:
			System.out.println("Mittwoch");
			break;
		case 4:
			System.out.println("Donnerstag");
			break;
		case 5:
			System.out.println("Freitag");
			break;
		case 6:
			System.out.println("Samstag");
			break;
		case 7:
			System.out.println("Sonntag");
		default:
			System.out.println("das ist illegal");
			
		}
			
	}

}
