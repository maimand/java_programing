package BT2;

import java.util.Scanner;

public class B3 {
	public static long factorial(int n) {
		long factorial = 1;
		for(int i = 2; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}
	public static double compute(int n) {
		double sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += (double)1/factorial(2*i - 1);
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.print(compute(n));
	}
}
