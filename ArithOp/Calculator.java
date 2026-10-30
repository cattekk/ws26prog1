
public class Calculator {
	public static void main(String[] args) {
		System.out.println("zahl 1: ");
		int zahl1 = StaticScanner.nextInt();
		System.out.println("zahl 2: ");
		int zahl2 = StaticScanner.nextInt();
		
		int sum = zahl1 + zahl2;
		int dif = zahl1 - zahl2;
		int prod = zahl1 * zahl2;
		int quot = zahl1 / zahl2; 
		
		System.out.println("sum " +sum);
		System.out.println("dif" + dif);
		System.out.println("prod " + prod);
		System.out.println("quot "+ quot);
	}


}
