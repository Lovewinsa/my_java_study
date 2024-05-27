package test.main;

import test.mypac.MyUtil;

public class MainClass05 {
	public static void main(String[] args) {
		// method안에서 발생하는 예외를 직접 처리한 draw() method 호출
		MyUtil.draw();
		
		// method안에서 발생하는 예외를 throws한 draw() method 호출
		try {
			MyUtil.send();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
