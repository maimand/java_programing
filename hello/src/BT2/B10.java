package BT2;

import java.util.Scanner;

public class B10 {
	public static boolean isPrime(long n) {
		if(n == 1) return true;
		for(int i = 2; i < Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
	
	public static void compute(long n) {
		for(int i = 1; i <= n; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap n: ");
		long n = scanner.nextInt();
		compute(n);
	}
}