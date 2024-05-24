package test.main;

import test.mypac.Zoo;
import test.mypac.Zoo.Monkey;

public class MainClass03 {
	public static void main(String[] args) {
		Zoo z1 = new Zoo();	//	test.mypac.Zoo z1 = new test.mypac.Zoo();	import안쓰고 하는 법
		Monkey m1 = z1.getMonkey();
		m1.say();
		
		// Zoo 객체를 생성해서 참조값을 z2라는 변수에 담기
		Zoo z2 = new Zoo();
		// z2 안에 들어있는 참조값을 이용해서 getTiger() method를 호출 후
		// return되는 값을 t1이라는 변수에 담기
		Zoo.Tiger t1 = z2.getTiger();
		// return된 Tiger객체의 say() method호출하기
		t1.say();
	}
}
