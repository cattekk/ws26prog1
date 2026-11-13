
public class SuessigkeitenTeiler {
	public static void main(String[] args) {
		int suessigkeiten;
		int teilnehmer; 
		int rest;
		int suessigkeitenProTeilnehmer;
		
		System.out.println("Wie viele Suessigkeiten haben wir? :D ");
		suessigkeiten = StaticScanner.nextInt();
		System.out.println("Wie viele Teilnehmer haben wir? :3 ");
		teilnehmer = StaticScanner.nextInt();
		
		suessigkeitenProTeilnehmer = suessigkeiten / teilnehmer; 
		rest = suessigkeiten % teilnehmer; 
		
		System.out.println("Süssigkeiten pro Teilnehmer: " + suessigkeitenProTeilnehmer);
		System.out.println("Diese SÜssigkeiten verbrennen wir solidarisch: " + rest);
		
		
	}

}
