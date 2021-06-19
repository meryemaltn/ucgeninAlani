package ucgeninAlani;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a, b, c, u, alan;
		Scanner input= new Scanner(System.in);
		System.out.println("1. Kenarý Giriniz: ");
		a= input.nextDouble();
		System.out.println("2. Kenarý Giriniz: ");
		b=input.nextDouble();
		System.out.println("3. Kenarý Giriniz: ");
		c=input.nextDouble();
		u=(a+b+c)/2;
		alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));
		System.out.println("Üçgenin Alaný: "+alan);
	}

}
