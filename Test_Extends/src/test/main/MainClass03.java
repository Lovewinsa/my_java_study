package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass03 {

	public static void main(String[] args) {
		HandPhone p1 = new HandPhone();
		
		Phone p2 = p1;
		
		Object p3 = p1;
	}

}
