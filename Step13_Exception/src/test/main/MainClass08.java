package test.main;

import java.util.Random;

import test.mypac.WowException;

public class MainClass08 {
	public static void main(String[] args) {
		int ranNum=0;
		try {
			Random ran = new Random();
			ranNum = ran.nextInt(10);
			
			if(ranNum == 7) {
				// 여기서 발생하는 Exception은 JVM이 직접 처리
				throw new WowException("Wow! Lucky Seven!");
			}
		} catch(WowException we) {
			we.printStackTrace();
		}
		
		
		System.out.println(ranNum + "숫자가 나왔습니다.");
	}
}
