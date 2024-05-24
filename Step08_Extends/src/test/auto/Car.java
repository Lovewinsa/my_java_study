package test.auto;
/*
 * 	- 접근지정자 접근범위
 * 	public : 어디에서나 접근 가능
 * 	protected : 동일한 package 혹은 상속관계에서 자식에서 접근 가능
 * 	default(작성 안한 경우) : 동일한 package 안에서만 접근 가능
 *	private : 동일한 class 혹은 동일한 객체 안에서만 접근 가능
 * 
 * 	-접근 지정자를 붙이는 위치
 * 	1. class를 선언할 때 : import가능 여부를 결정, 붙이지 않으면 같은 package에서만 import 가능
 * 	2. constructor : 객체 생성 가능 여부를 결정
 * 	3. field : 참조 가능 여부를 결정
 * 	4. method : method 호출 가능 여부를 결정
 * 
 * 	class는 default와 public 두 가지의 접근지정자만 지정 가능하다
 * 	접근지정자를 생략한 것이 default 접근지정자이다.
 */
public class Car {
	// field(protected는 package가 달라도 상속관계 자식이면 참조 가능)
	protected Engine engine;
	// 접근지정자를 작성 안하면 default 접근지정자(=같은 pacakage 내에서만 접근 가능)
	
	// Engine 객체를 생성자의 인자로 전달받는 생성자
	public Car(Engine engine) {
		this.engine = engine;
	}
	
	// method
	public void drive() {
		if(this.engine == null) {
			System.out.println("Engine이 없어서 달릴 수가 없어요");
			return;	// method를 여기서 return(종료)시키기
		}
		System.out.println("달려요~");
	}
}
