package BT2;

import java.util.Scanner;

public class B6 {
	public static int compute(int a, int b) {
		if(a>b) return ucln(a,b);
		else return ucln(b,a);
	}
	public static int ucln(int a, int b){
		if(b==0) return a;
		else return ucln(b,a%b);
	}
	
	public static int bcnn(int a, int b) {
		return (a*b) / compute(a,b);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap a: ");
		int a = scanner.nextInt();
		System.out.print("Nhap b: ");
		int b = scanner.nextInt();
		System.out.println("UCLN = " + compute(a,b));
		System.out.print("BCNN = " + bcnn(a,b));
	}
}
