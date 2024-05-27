package test.main;
/*
 * 	RuntimeException을 상속받지 않은 Exception type은
 * 	반드시 try~catch 블럭으로 예외처리 해야한다.
 */
public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main method가 시작되었습니다.");
		
		try {
			// 스레드를 일정시간 지연시키기(mili second 단위로 숫자를 전달하면 된다)
			Thread.sleep(1000*5);
		} catch (InterruptedException e) {	// RuntimeException을 상속받지 않은 Exception
			e.printStackTrace();
		}
		
		System.out.println("mainamethod가 종료됩니다");
	}
}
