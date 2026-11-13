
public class rechner {
	public static void main(String[] args) {
		
		System.out.println("wie viel kostet ihr kürbis pro kg IN CENT: ");
		float kuerbisProKg = StaticScanner.nextFloat();
		System.out.println("wie viel wiegt ihr kürbis IN GRAMM? :O");
		float gewicht = StaticScanner.nextFloat() / 1000;
		float kuerbispreis = kuerbisProKg * gewicht/100;
		
		float mehrwertsteuerKuerbis = (kuerbispreis / 100 * 7);	

		float netto = (kuerbispreis - mehrwertsteuerKuerbis)/100;
		System.out.println("Brutto ihres Kürbis: "+ ((float)Math.round(kuerbispreis * 100)/100));
		System.out.println("Netto ihres Kürbis: "+ ((float) Math.round(netto * 1000)/1000));
	}

}
