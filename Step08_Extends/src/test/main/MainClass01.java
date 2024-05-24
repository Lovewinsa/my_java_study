package test.main;

import test.mypac.HandPhone;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * 	Phone class를 상속받은 HandPhone class로 객체를 생성해서
		 * 	그 참조값을 p1이라는 이름의 지역변수에 담기
		 */
		HandPhone p1 = new HandPhone();
		// 지역변수나 field앞에 선언한 type은 변수나 field안에 들어있는 값에 대한 사용설명서 역할을 한다
		p1.call();
		p1.mobileCall();
		p1.takePicture();
	}
}
