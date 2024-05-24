package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass03 {
	public static void main(String[] args) {
		HandPhone p1 = new HandPhone();
		
		// HandPhone type안에 있는 값을 Phone type(부모type)변수에 대입 가능
		Phone p2 = p1;
		
		// HandPhone type안에 있는 값을 Object type(부모type)변수에 대입 가능
		Object p3 = p1;
		
		// 자식 객체의 참조값은 부모type 변수나 field에 자연스럽게 담긴다
		
		// 결과적으로 객체는 하나만 생성됨
		// But, p2는 Phone의 기능만, p3는 Object의 기능만 사용 가능
	}
}
