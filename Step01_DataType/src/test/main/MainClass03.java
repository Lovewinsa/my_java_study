package test.main;
/*
 *	[ Java 기본 데이터 type ]
 *
 * 2. 논리형 (boolean)
 * 
 * - true, false 두 가지 값 중 하나이다.
 * - true, false를 직접 쓰거나 비교연산 혹은 논리연산의 결과로 얻어낼 수 있ㄷ.
 * - 참과 거짓을 나타내는 date type
 */
public class MainClass03 {
	public static void main(String[] args) {
		// 논리형 변수 선언과 동시에 값 대입하기
		boolean isRun = true;
		boolean isEat = false;
		
		if(isRun) {
			System.out.println("달려요");
		}
		if(isEat) {
			System.out.println("먹어요");
		}
		
		// 비교연산의 결과로 얻어진 boolean값 담기
		boolean isGreater = 10>1;
		// 논리연산의 결과로 얻어진 boolean값 담기
		boolean result = true || false; // ||(or) : 둘 중 하나가 true면 true
		// 한번 선언한 변수는 다시 선언할 수 없다.
		// (x) boolean result = false;
		result = false; // 변수에 다른 값을 대입할 수 있다.(동일한 type인 경우)
		// 다른 type값은 변수에 담을 수 없다.
		// (x) result = 10;
	}
}
