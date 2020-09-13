package BT2;

import java.util.Scanner;

public class B5 {
	public static long sum(String s) {
		long sum = 0;
		for(char c: s.toCharArray()) {
			sum += (int)c -48;
		}
		return sum;
	}
	public static long product(String s) {
		long sum = 1;
		for(char c: s.toCharArray()) {
			sum *= (int)c -48;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap n: ");
		String n = scanner.next();
		System.out.print("S = "+ sum(n)+ ", P = " + product(n));
	}
}
