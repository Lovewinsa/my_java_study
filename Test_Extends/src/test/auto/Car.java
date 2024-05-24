package test.auto;

public class Car {
	protected Engine engine;
	
	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public void drive() {
		if(this.engine==null) {
			System.out.println("Engine이 없어서 달릴 수 없습니다");
			return;
		}
		System.out.println("달려요");
	}
}
