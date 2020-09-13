package BT1;

public class b7 {
	public static boolean isMore(int year) {
		if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0 ) {
            return true;
        }
		return false;
	}
}
