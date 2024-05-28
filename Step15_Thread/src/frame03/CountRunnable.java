package frame03;
/*
 * 	새로운 스레드 만드는 방법2
 * 	
 * 	1. Runnable 인터페이스를 구현한 클래스를 정의
 * 	2. run() 메소드를 강제 오버라이드
 *  3. Thread 클래스로 객체를 생성하면서 해당 클래스로 만든 객체를 생성자의 인자로 전달
 *  4. THread 클래스로 만든 객체의 start() 메소드를 호출해서 스레드를 시작시킴
 *  
 *  var t = new CountRunnable();
 *  new Thread(t).start();
 */
public class CountRunnable implements Runnable{
	@Override
	public void run() {
		// 카운트 값을 저장할 지역변수 만들고 초기 값 대입
		int count = 10;
		// 반복문 돌면서
		while(true) {
			System.out.println("현재 count : " + count);
			if(count==0) {
				System.out.println("작업이 끝났습니다");
				break;
			}
			try {
				Thread.sleep(1000*1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count--;
		}
		
	}

}
