package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass04 {
	public static void main(String[] args) {
		Object p3 = new HandPhone();
		
		Phone p2 = (Phone)p3;
	}
}
