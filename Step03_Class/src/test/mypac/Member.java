package test.mypac;

/*
 * 	Member객체 하나에 회원의 번호, 이름, 주소를 담기 위해 Member class를 설계하려고 한다.
 */

public class Member {
	// field
	public int num;
	public String name;
	public String addr;
	
	//method
	public void showInfo() {
		String info = "번호는 " + this.num + " 이고 이름은 " + this.name + " 이고 주소는 " + addr + " 입니다.";
		System.out.println(info);
	}
}
