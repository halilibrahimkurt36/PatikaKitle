import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double size,weight,massIndex; 
		try (Scanner giris = new Scanner(System.in)) {
			System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
			size=giris.nextDouble();
			
			System.out.print("Lütfen kilonuzu giriniz : ");
			weight=giris.nextDouble();
			
			massIndex=weight/(Math.pow(size, 2));
			System.out.print("Vücut Kitle İndeksiniz : " + massIndex);

		}
		
		
	}

}
