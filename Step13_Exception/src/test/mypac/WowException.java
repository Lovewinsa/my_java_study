package test.mypac;

public class WowException extends RuntimeException{ // RuntimeException class를 상속받아서 만듦
	
	// constructor의 매개변수로 except message를 전달받아서
	public WowException(String msg) {
		super(msg);	// 부모 생성자에 전달해준다
	}

}
