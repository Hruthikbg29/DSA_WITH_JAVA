package mq;

public class leapYear {
	public static void main(String[] args) {
		int year = 2023;
		boolean isLeap = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isLeap = true;
				} else {
					isLeap = false;
				}
			} else {
				isLeap = true;
			}
		} else {
			isLeap = false;
		}
		System.out.println((isLeap) ? year + " : is leap year" : year + ": not a leap year");
	}
}
