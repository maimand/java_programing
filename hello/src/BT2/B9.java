package BT2;

import java.util.Scanner;

public class B9 {
	public static boolean compute(String s) {
		for(int i = 0; i < s.length()/2; i++) {
			if(s.charAt(i)!=s.charAt(s.length()-i))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap n: ");
		String n = scanner.next();
		System.out.print(compute(n)?"Dung":"Sai");
	}
}
