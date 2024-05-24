package test.mypac;

public class Zoo {
	// class 안에 class 정의하기(내부 클래스 inner class)
	public class Monkey{
		public void say() {
			System.out.println("Hi! I'm Monkey");
		}
	}
	
	public class Tiger{
		public void say() {
			System.out.println("ROAR!");
		}
	}
	
	// Zoo class의 멤버 method
	public Monkey getMonkey() {
		// innerclass로 객체를 생성해서 리턴해 줄 수도 있다.
		return new Monkey();
	}
	public Tiger getTiger() {
		return new Tiger();
	}
	
}
