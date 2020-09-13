package BT2;

import java.util.Scanner;

public class B7 {
	public static boolean compute(long n) {
		if(n == 1) return true;
		for(int i = 2; i < Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = scanner.nextInt();
		System.out.print(compute(n)?"Dung":"Sai");
	}
}
