package BT1;

import java.util.Scanner;

public class b4 {
	public static void compute(int a1,int b1,int c1,int a2,int b2,int c2) {
		   float D, Dx, Dy, x, y;
		   D = a1 * b2 - a2 * b1;
		   Dx = c1 * b2 - c2 * b1;
		   Dy = a1 * c2 - a2 * c1;
		   if (D == 0) {
		       if (Dx + Dy == 0)
		            System.out.print("Vo so nghiem");
		       else
		    	   System.out.print("Vo nghiem");

		   }
		   else {
		       x = Dx / D;
		       y = Dy / D;
		       System.out.print("x = " + x + ", y = " + y);
		   }
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("a1 = ");
        int a1 = scanner.nextInt();
        System.out.print("b1 = ");
        int b1 = scanner.nextInt();
        System.out.print("c1 = ");
        int c1 = scanner.nextInt();
        System.out.print("a2 = ");
        int a2 = scanner.nextInt();
        System.out.print("b2 = ");
        int b2 = scanner.nextInt();
        System.out.print("c2 = ");
        int c2 = scanner.nextInt();
        compute(a1, b1, c1, a2, b2, c2);
    }

}
