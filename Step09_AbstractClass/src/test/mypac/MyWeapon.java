package test.mypac;

public class MyWeapon extends Weapon{

	// 부모class의 추상method를 반드시(강제로) override해야한다
	@Override
	public void attack() {
		// 어디를 공격할지는 project 상황에 맞게 마음대로 attack하면 된다
		System.out.println("지상을 공격해");
		
	}
	
}
