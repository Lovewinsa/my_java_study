package test.main;

import test.mypac.AndroidPhone;
import test.mypac.HandPhone;

public class MainClass05 {
	public static void main(String[] args) {
		// AndroidPhone 객체를 생성해서 참조값을 AneroidPhone type p1이라는 지역변수에 담기
		AndroidPhone p1 = new AndroidPhone();
		p1.call();
		p1.mobileCall();
		p1.takePicture();
		p1.doInternet();
		
		System.out.println("--------");
		// AndroidPhone 객체를 생성해서 참조값을 HandPhone type p2라는 지역변수에 담기
		HandPhone p2 = new AndroidPhone();
		p2.takePicture(); // Override된 method가 호출됨
		
		System.out.println("--------");
		// HandPhone 객체를 생성해서 참조값을 HandPhone type p3이라는 지역변수에 담기
		HandPhone p3 = new HandPhone();
		p3.takePicture(); // 운래 HandPhone 객체의 method가 호출됨
	}

}
