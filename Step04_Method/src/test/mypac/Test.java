package test.mypac;
/*
 * 	[ 메소드를 만들 때 고려해야 하는 것 ]
 * 
 * 	1. 접근 지정자( 모르면 public )
 * 	2. static or non static( 모르면 non static )
 * 	3. 리턴 type ( 모르면 void )
 * 	4. 메소드명
 * 	5. 메소드에 전달하는 인자의 갯수와 데이터type
 */
public class Test {
	/*
	 *  public => pacakge가 달라도 호출 가능
	 *  void => 이 메소드는 어떤 값도 return하지 않는다
	 *  walk => method명은 walk
	 *  () => 이 method는 어떤 값도 인자로 전달받지 않는 method이다(매개변수가 선언되지 않고 비어있음)
	 */
//	접근지정자	+ return type + 변수명(){}
	public void walk() {
		System.out.println("걸어요!");
	}
	
	public int getNumber() {
		int num = 10;
		return num;
	}
	
	// 인사말을 return하는 method를 완성해보기
	public String getGreeting() {
		String p1;
		p1 = "아침은 맛있게 드셨습니까?";
		return p1;
	}
	// 동일한 package안에 있는 AirPlane type을 return해주는 method
	public AirPlane getPlane() {
		AirPlane air = new AirPlane();
		return air;
	}
	// int type을 method의 인자로 전달받는 method
	public void setNum(int num) {
	
	}
	// String type을 method의 인자로 전달받는 method
	public void setName(String name) {
		
	}
	// AirPlane type을 메소드의 인자로 전달받는 메소드
	public void setPlane(AirPlane plane) {
		
	}
	// int type, String type, AirPlane type 세 개를 전달받는 메소드
	public void doSomething(int num, String name, AirPlane plane) {
		
	}
	/*
	 * 	동일한 method명으로 여러 개의 method가 정의되어 있음
	 * 	- method가 다중정의 되어있다.
	 * 	- method가 오버로딩(overloading)되어있다.
	 */
	public void send() {
		System.out.println("무언가를 전송해요");
	}
	public void send(int num) {
		System.out.println(num + " 을 전송해요");
	}
	public void send(String name) {
		System.out.println(name + " 을 전송해요");
	}
	public void send(AirPlane plane) {
		System.out.println("비행기를 전송해요");
	}
	
}
