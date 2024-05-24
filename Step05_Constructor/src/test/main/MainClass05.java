package test.main;

import java.util.Random;

public class MainClass05 {
	public static void main(String[] args) {
		Random ra1 = new Random();
		// -10 ~ 10 사이의 랜덤한 정수를 얻어내 보세요
		int q1 = ra1.nextInt(21) - 10;
		//int q1 = ra1.nextInt(-10, 11);
		System.out.println("-10~10 정수 : " + q1);
		// 75 ~ 100 사이의 랜덤한 정수를 얻어내 보세요
		int q2 = ra1.nextInt(26) + 75;
		// int q2 = ra1.nextInt(75, 101);
		System.out.println("75~100 정수 : " + q2);
		// 1 ~ 45 사이의 랜덤한 정수를 얻어내 보세요
		int q3 = ra1.nextInt(45) + 1;
		// int q3 = ra1.nextInt(1, 46);
		System.out.println("1~45 정수 : " + q3);		
	}
}
