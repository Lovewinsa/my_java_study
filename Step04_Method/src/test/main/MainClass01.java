package test.main;

import test.mypac.AirPlane;
import test.mypac.Test;

public class MainClass01 {
	public static void main(String[] args) {
		Test t = new Test();
		// return type이 void인 method호출
		t.walk();
		// return type이 int인 메소드를 호출하고 return되는 값을 a라는 int type지역변수에 담기
		int a = t.getNumber();
		// return type이 String인 method를 호출하고 return되는 값을 b라는 String type지역변수에 담기
		String b = t.getGreeting();
		// return type이 AirPlane인 method를 호출하고 return되는 값을 c라는 AirPlane type지역변수에 담기
		AirPlane c = t.getPlane();
		// c에 담긴 값을 이용해서 fly() 메소드를 호출해 보세요.
		c.fly();
		
		// 위에서 생성한 객체의 setNum() method를 호출해보세요.
		t.setNum(1);
		t.setName(b);
		// 위에서 생성한 객체의 setName() method를 호출해보세요.
		t.setName("김구라");
		t.setName(b);
		// 위에서 생성한 객체의 setPlane() method를 호출해보세요.
		//t.setPlane(t.getPlane());
		t.setPlane(new AirPlane());
		t.setPlane(c);
		/*
		 * 1.객체 생성하기
		 * 2.생성된 객체의 참조값을 정확한 type의 변수에 담기
		 * 3.객체의 method 호출하기
		 * 4.method가 return하는 데이터를 받아서 활용하기
		 */
		t.doSomething(2, "아무개", new AirPlane());
		t.send();
		t.send(17);
		t.send("아이유");
		t.send(new AirPlane());
	}
}
