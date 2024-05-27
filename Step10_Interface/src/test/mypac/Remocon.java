package test.mypac;
/*
 * 	[ interface ]
 * 
 * 	- constructor가 없다(단독 객체 생성 불가능)
 * 	- 구현된 method는 가질 수 없다.(abstract method만 가질 수 있다.)
 * 	- field는 static final 상수만 가질 수 있다.
 * 	- data type의 역할을 할 수 있다.
 * 	- interface type의 참조값이 필요하면 구현(implement) class를 만들어서 객체를 생성해야 한다.
 * 	- class extends는 단일 extends지만, interface는 다중 구현이 가능하다.
 */
public interface Remocon {
	/*
	 * 	field도 가질 수 있지만 static final만 가능하다
	 * 	static : static 영역에 Remocon interface와 같이 만들어진다
	 * 	final : 값이 결정된 이후에 변경 불가능(상수화)
	 * 	생략가능
	 */
	public /*static final*/ String COMPANY="LG";	//	final상수는 관례상 field name을 대문자로
	
	// method는 미완성의 Abstract method만 member로 가질 수 있다
	public void up();
	public void down();
}
