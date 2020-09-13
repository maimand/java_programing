package BT2;

import java.util.Scanner;

public class B2 {
	public static long factorial(int n) {
		long factorial = 1;
		for(int i = 2; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}
	public static double compute(int n) {
		double sum = -1;
		for(int i = 2; i <= n; i++) {
			sum += Math.pow((-1), i)*1/factorial(i);
		}
		return 15 - sum;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.print(compute(n));
	}
}
