package BT2;

import java.util.Scanner;

public class B1 {
	public static double compute(int n) {
		double sum = 0;
		for(double i = 1; i <=n; i++ ) {
			sum += 1/i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = scanner.nextInt();
		System.out.print(compute(n));
		
		
	}
}
