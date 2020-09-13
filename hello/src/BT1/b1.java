package BT1;

import java.util.Scanner;

public class b1 {
	public static int compare(int a, int b) {
		return a >= b? a:b;
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap b = ");
		int a = scanner.nextInt();
		System.out.print("Nhap b = ");
		int b = scanner.nextInt();
		System.out.print("Nhap c = ");
		int c = scanner.nextInt();
		System.out.println(compare(a, compare(b,c)));
	}
}
