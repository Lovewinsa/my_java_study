package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass02 {
	// run했을 때 실행의 흐름이 시작되는 특별한 static main method
	public static void main(String[] args) {
		// 동일한 class 안에 있는 static method call
		MainClass02.test();
		test();	// class name은 생략 가능
		
		// useString() method 호출해보기
		MainClass02.useString("방가방가");
		
		// useWeapon() method를 호출해보기
		MainClass02.useWeapon(new MyWeapon());
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
	
	// static method add
	public static void test() {
		System.out.println("static test() method is called");
	}
	
	public static void useString(String msg) {
		System.out.println("전달받은 문자열: " + msg);
	}
}
