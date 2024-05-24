package test.main;

import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		// Car class로 객체를 생성해 참조값을 car1이라는 Car type지역변수에 담기
		Car car1 = new Car();
		// Car class로 객체를 생성해서 참조값을 car2라는 Car type지역변수에 담기
		Car car2 = new Car();
		
		// field에 String type의 참조값 대입하기
		car1.name = "소나타";
		car2.name = "그랜저";
		
		// method 호출하기
		car1.drive();
		car2.drive();
		
		boolean result = car1 == car2;
		//다른 객체이므으로 false이다
		
		Car car3 = car2;
		// car3이라는 Car type지역변수에 car2의 참조값을 담는다.
		car3.drive();	// 그랜저가 달린다.
		// 동일객체(car2와 car3에 저장된 참조값이 같다.)이므로 true다.
		boolean result2 = car2 == car3;
	}
}
