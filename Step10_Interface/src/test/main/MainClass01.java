package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass01 {
	public static void main(String[] args) {
		// Interface로 객체 생성이 가능할까?
// 		Remocon r1 = new Remocon();	>>> 단독 객체 생성 불가능
		
		// Interface가 data type역할을 할 수 있을까?
		Remocon r1 = null;
//		r1.down();	>>> Remocon은 있는데 내용물이 없어서 불가능
		
		Remocon r2 = new MyRemocon();
		r2.up();
		r2.down();
		// Remocon Interface에 정의된 static final 상수 참조
		String result = Remocon.COMPANY;
		System.out.println(result);
		
		// final 상수이기 때문에 수정 불가
		// Remocon.COMPANY = "SAMSUNG";
		
		// final을 안붙이면 필요시에 값 변경 가능
		int num = 10;
		num = 20;
		
		// final을 붙이면 상수화 되어서 값 변경 불가능
		final int num2 = 10;
		// num2 = 20;
		
		final String NICK = "김구라";
		// NICK = "원숭이";
		
		final Remocon r3 = new MyRemocon();
		// r3 = null;
		// r3 = new MyRemocon();
	}
}
