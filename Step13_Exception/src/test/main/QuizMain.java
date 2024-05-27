package test.main;
/*
 * 	run했을 때 console창에 경과 시간이 출력되는 프로그래밍을 해 보세요.
 * 
 * 	0 분 1초
 * 	0 분 2초
 * 	0 분 3초
 * 	.
 * 	.
 * 	0 분 59초
 * 	1 분 0초
 * 	1 분 1초
 * 	.
 * 	.
 * 	2 분 0초
 * 	2 분	1초
 */
public class QuizMain {
	public static void main(String[] args) {
		int sc = 0;
		int mi = 0;
		int cl = 0;
		while(true) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			sc++;
			if(sc==60) {
				mi++;
				sc -= 60;
			}
			if(mi==60) {
				mi=0;
				cl++;
			}
			System.out.println(cl + "시" + mi + " 분 " + sc + "초");
		}
		
	}
}
