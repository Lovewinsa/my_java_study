package test.main;

public class MainClass04 {
	// static method 안에서 사용하려면 static 예약어가 필요
	public static class Gura{
		public void say() {
			System.out.println("Hi! I'm Gura");
		}
	}
	
	public static void main(String[] args) {
		Gura g = new Gura();
		// static method 안에서는 static field, static method, static class 멤버만 사용할 수 있음
		g.say();
		// method 안에서도 class를 정의할 수 있다.
		// method 안에 정의한 class는 method 안쪽 영역에서만 사용 가능
		// method 안에 정의한 class는 Local Inner Class라고 한다
		class Cat{
			public void say() {
				System.out.println("Meow");
			}
		}
		
		// Local Inner Class를 이용해서 객체를 생성하고 사용해보기
		Cat c = new Cat();
		c.say();
		
	}
}
