package test.mypac;

// 미완성된 추상
public abstract class Weapon {
	// 무기 작동을 준비하는 method
	public void prepare() {
		System.out.println("무기 작동을 준비합니다");
	}
	// 
	public abstract void attack();
}
