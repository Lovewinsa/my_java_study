package test.main;
/*
 *  run했을 때
 *  
 *  1초
 *  2초
 *  3초
 *  .
 *  .
 *  경과 시간이 출력되다가
 *  .
 *  .
 *  10초
 *  까지만 출력하고 종료되는 프로그래밍을 해보세요.
 */
public class MAinClass09 {
	public static void main(String[] args) {
		int num = 0;
//		while(num<10) {
//			try {
//				Thread.sleep(1000*1);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			num++;
//			System.out.println(num + "초");
		while(num<10) {
			try {
				Thread.sleep(1000*1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			num++;
			System.out.println(num + "초");
			if(num == 10) {
				break;
			}
		}

	}

}
