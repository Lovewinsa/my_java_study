package test.main;

import java.util.Random;

public class QuizMain {
	public static void main(String[] args) {
		String[] data = {"cherry", "apple", "banana", "melon", "7"};
		// 배열에 저장된 문자열 중에 1개가 랜덤하게 console창에 출력되도록 프로그래밍
		Random ran = new Random();
		int num = ran.nextInt(5);
		System.out.println(data[num]);

	}

}
