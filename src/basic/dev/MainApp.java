package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap 1 so: ");
		int number = sc.nextInt();
		if (number > 0)
			System.out.println("duong");
		else if (number < 0)
			System.out.println("am");
		else
			System.out.println("0");

	}

}
