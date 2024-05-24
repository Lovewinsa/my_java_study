package test.main;

import java.io.PrintStream;

/*
 * 	System.out.println();
 * 
 * 	에 대한 분석!
 */
public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("Hello!");
		// System class에는 out이라는 static field가 존재하고
		// 거기에는 console창과 연결된 PrintStream type객체의 참조값이 들어있다.
		
		// System class의 out이라는 field에 담긴 참조값을 gura라는 지역변수에 담기
		PrintStream gura = System.out;
		gura.println("Hi there~");
		
		// System class의 static method 호출
		long time = System.currentTimeMillis();
	}
}
