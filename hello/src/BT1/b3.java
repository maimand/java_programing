package BT1;

import java.util.Scanner;

public class b3 {
	public static void compute(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Can't solve");
            } else {
                System.out.println("x = " + (-c / b));
            }
        }
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("x" + x1);
        } else {
            System.out.println("Can't solve");
        }
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        float a = scanner.nextFloat();
        System.out.print("b = ");
        float b = scanner.nextFloat();
        System.out.print("c = ");
        float c = scanner.nextFloat();
        compute(a, b, c);
    }
}
