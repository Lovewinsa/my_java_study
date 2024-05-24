package test.auto;

public class SportsCar extends Car {
	public SportsCar(Engine engine) {
		super(engine);
	}
	
	public void openDrive() {
		if(this.engine==null) {
			System.out.println("Engine이 없어서 달릴 수 없습니다.");
			return;
		}
		System.out.println("뚜껑을 열고 달려요");
	}
}
