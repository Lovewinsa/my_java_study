package test.main;
// 다른 package의 class를 사용하려면 import를 해야한다.
import test.mypac.Car;

public class MainClass01 {
	public static void main(String[] args) {
		// test.mypac package에 있는 Car class로 객체를 생성하고
		// 생성된 객체의 참조값을 car1이라는 지역변수에 담기
		/*변수선언 */ Car car1 = new Car(); // 객체생성(heap영역에)
		//						↑이 위치는 생성된 객체의 참조값으로 대체한다.
		// Car class로 생성한 객체의 type은 Car type이다.
		car1.drive();
		// field에 저장된 값 참조(불러오기)
		String a = car1.name;
		// field에 값 대입하기
		car1.name = "소나타";
		// 대입한 이후에 field에 저장된 값 참조(불러오기)
		String b = car1.name;
		// method 호출
		car1.drive();
	}
}
