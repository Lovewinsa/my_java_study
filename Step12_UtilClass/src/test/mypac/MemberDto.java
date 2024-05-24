package test.mypac;
/*
 * 	Dto => Data Transfer Object
 * 
 * 	[ 작성 규칙 ]
 * 
 * 	1. default constructor가 반드시 있어야 한다
 * 	2. field는 접근지정자가 private로 되어있어야 한다.
 * 	3. field의 접근메소드 setter, getter 메소드가 있어야 한다
 * 					넣어줄때,	가져올때
 */
public class MemberDto {
	// field의 접근지정자를 private
	private int num;
	private String name;
	private String addr;
	
	// default constructor
	public MemberDto() {}

	public MemberDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	

	
}
