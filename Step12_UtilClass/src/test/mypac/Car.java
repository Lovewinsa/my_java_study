package test.mypac;

public class Car {
	private String name;
	
	public Car(String name) {
		this.name =name;
	} // 생성자의 매개변수에 전달된 Car의 이름을 field에 저장한다
	
	public void drive() {
		System.out.println(name + " 이(가) 달려요!");
	}
}
