
public class Schaltjahrtester {
	public static void main (String[] args) {
		boolean schaltjahr = false;
		System.out.println("Welches Jahr wollen Sie überprüfen? :3");
		int jahr = StaticScanner.nextInt();
		
		if(jahr % 4 == 0 || jahr % 400 == 0) {
			schaltjahr = true;	
			System.out.println("hurra ein schaltjahr!");
		}
		else if (jahr % 4 != 0 || jahr % 400 != 0|| jahr % 100 == 0) {
			schaltjahr = false;
			System.out.println("kein schaltjahr grr");
		}
		
	}

}
