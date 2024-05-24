package test.main;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("main method starts!!");
		// console창으로부터 문자열을 읽어들이기 위한 객체 생성
		// System class의 in이라는 field에 들어있는 InputStream type
		// console창으로부터 읽어들일 수 있는 객체이다
		Scanner scan = new Scanner(System.in);
		System.out.print("여기에 문자열 입력:");
		// console창으로부터 문자열 읽어들이기
		String str = scan.next();
		
		System.out.println("main method will shut down...");
	}
}
