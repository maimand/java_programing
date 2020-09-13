package BT2;

import java.util.Scanner;

public class B13 {
	public static int fibonacci(long n){
//		ArrayList<Integer> list = new ArrayList<>();
		long u1 = 1;
		long u2 = 1;
		long u = 0;
		int count = 0;
		while(u < n) {
			u = u1 + u2;
			u2 = u1;
			u1 = u;
			count++;
		}
		return u==n?count:-1;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap n: ");
		long n = scanner.nextInt();
		System.out.print(fibonacci(n));
	}
	
}
