package test.mypac;

/*
 * 	[ static ]
 * 
 * 	- static예약어를 붙여서 field나 method를 정의하면 class와 함께 static영역에 만들어진다.
 * 	- static field나 method를 사용할 때는 class명에 . 찍어서 사용하면 된다.
 * 
 * 	MyUtil.version	//	static field 참조
 * 
 * 	MyUtil.send()	//	static method 호출
 * 
 */
public class MyUtil {
	// data type앞에 static예약어를 붙여서 static field를 만들 수 있다.
	// field는 선언시에 초기값을 넣어줄 수도 있다.
	public static String version = "1.0";
	
	// method의 return type앞에 static예약어를 붙여서 static method를 만들 수 있다.
	public static void send() {
		System.out.println("전송합니다.");
	}
}
