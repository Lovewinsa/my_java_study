package test.main;

import test.mypac.Rectangle;

public class Test_rectangle {
	public static void main(String[] args) {
		Rectangle firstRct = new Rectangle();
		firstRct.width = 10;
		firstRct.height = 20;
		firstRct.showArea();
		
		Rectangle secondRct = new Rectangle();
		secondRct.width = 100;
		secondRct.height = 60;
		secondRct.showArea();
		
		
	}
}
