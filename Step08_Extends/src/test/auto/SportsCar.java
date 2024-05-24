package test.auto;

public class SportsCar extends Car {

	public SportsCar(Engine engine) {
		/*
		 * 	super()는 부모생성자(Car class의 생성자)를 의미한다
		 * 	부모생성자에 필요한 값을 자식생성자에서 받아서 전달해야 한다
		 * 	super() code실행 전에 다른 code가 있으면 안된다.
		 */
		super(engine);
	}
	public void openDrive() {
		
		// 부모객체의 field도 this. 해서 참조할 수 있다
		if(this.engine==null) {
			System.out.println("Engine이 없어서 달릴 수가 없어요");
			return;
		}
		System.out.println("뚜껑을 열고 달려요");
	}
	
}
