package BT1;

import java.util.Scanner;

public class b5 {
	public static int compare(int a, int b, int c) {
		if(a >= b && a <= c || a <= b && a >= c) return a;
		if(b >= a && b <= c || b <= a && b >= c ) return b;
		return c;
	}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap a = ");
		int a = scanner.nextInt();
		System.out.print("Nhap b = ");
		int b = scanner.nextInt();
		System.out.print("Nhap c = ");
		int c = scanner.nextInt();
		System.out.println(compare(a,b,c));
	}
}
