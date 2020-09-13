package BT1;

import java.util.Scanner;

public class b6 {
	public static int compute(int a, int b) {
		if(a < 18 && b < 18) {
			return (b-a)*45000;
		}
		if(a < 18 && b > 18) {
			return (18-a)*45000 + (b-18)*60000;
		}
		return (b-a)*60000;
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap a = ");
		int a = scanner.nextInt();
		System.out.print("Nhap b = ");
		int b = scanner.nextInt();
		
		System.out.println(compute(a,b));
	}
}
