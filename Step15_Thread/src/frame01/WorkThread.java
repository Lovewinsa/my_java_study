package frame01;
/*
 * 	새로운 스레드 만드는 방법
 * 
 * 	1. Thread class를 상속받은 class를 정의
 * 	2. run() method를 override
 * 	3. run() method 안에서 새로운 스레드에서 해야 할 작업을 코딩
 * 	4. 만든 class로 객체를 생성하고 해당 객체의 start() method를 호출하면
 * 		새로운 스레드가 시작된다
 * 	5. 만들어진 해당 객채는 1회용
 * 
 * 		WorkThread t = new WorkThread();
 * 		t.start();
 * 		start() method를 호출하면 내부적으로 새로운 스레드가 만들어지고
 * 		해당 스레드는 run() method 안에 있는 내용을 실행해 준다.
 * 		
 */
public class WorkThread extends Thread{
	@Override
	public void run() {
		// 새로운 스레드에서 해야 할 작업을 run() method안에서 한다
		System.out.println("10초 걸리는 작업을 시작합니다.");
		try {
			Thread.sleep(1000*10);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("작업이 종료되었습니다");
	}
}
