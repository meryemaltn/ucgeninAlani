package ucgeninAlani;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a, b, c, u, alan;
		Scanner input= new Scanner(System.in);
		System.out.println("1. Kenar� Giriniz: ");
		a= input.nextDouble();
		System.out.println("2. Kenar� Giriniz: ");
		b=input.nextDouble();
		System.out.println("3. Kenar� Giriniz: ");
		c=input.nextDouble();
		u=(a+b+c)/2;
		alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));
		System.out.println("��genin Alan�: "+alan);
	}

}
