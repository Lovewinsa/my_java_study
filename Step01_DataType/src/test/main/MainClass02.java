package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		//1. 콘솔창에 "main 메소드가 시작되었습니다."를 출력해 보세요
			System.out.println("main 메소드가 시작되었습니다.");
		//2. 국어점수 95를 kor이라는 변수에 담아보세요.
			int kor = 95;	// 국어점수
		//3. 영어점수 100을 eng라는 변수에 담아보세요.
			int eng = 100;	// 영어점수
		//4. 국어 점수와 영어 점수의 평균을 구해서(연산자 활용) avg라는 변수에 담아보세요.
			double avg = (double)(kor + eng)/2 ;
			// double avg = (kor + eng)/2d ;
		//5. 콘솔창에 avg변수 안에 담긴 내용을 출력해 보세요.
			System.out.println(avg);
		
	}
}
