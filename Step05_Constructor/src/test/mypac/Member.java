package test.mypac;

public class Member {
	// field
	public int num;
	public String name;
	public String addr;
	
	// constructor
	public Member() {}
	// 매개변수 int, String, String type를 전달받는 constructor
	// 필요하다면 이렇게 constructor을 overloading할 수도 있다.
	public Member(int num, String name, String addr) {
		this.num = num;
		this.name = name;
		this.addr = addr;		
	}
	
	
	// method
	public void printInfo() {
		System.out.println("번호:" + this.num + " 이름:" + name + " 주소:" + addr);
	}
}
