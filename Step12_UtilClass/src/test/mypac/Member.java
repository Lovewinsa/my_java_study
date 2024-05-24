package test.mypac;

public class Member {
	// 외부에서 접근이 가능한 공개(public) field
	public int num;
	public String name;
	public String addr;
	
	// dafault constructor
	public Member() {
	}
	
	// field에 저장할 값을 한번에 전달받는 constructor
	public Member(int num, String name, String addr) {
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
}
