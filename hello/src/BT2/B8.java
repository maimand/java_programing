package BT2;

import java.util.Scanner;

public class B8 {
	public static boolean compute(long n) {
		return n == (long)Math.sqrt(n)*Math.sqrt(n);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = scanner.nextInt();
		System.out.print(compute(n)?"Dung":"Sai");
	}
}
