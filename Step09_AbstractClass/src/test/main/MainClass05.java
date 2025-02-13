package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	
	static class SeaWeapon extends Weapon{
		@Override
		public void attack() {
			System.err.println("바다에 있는 적들을 공격");
		}
		
	}
	
	public static void main(String[] args) {
		// Abstract class type의 참조값을 Inner Class를 이용해서 얻어낸다
		Weapon w1 = new SeaWeapon();
		w1.prepare();
		w1.attack();
		
		class SpaceWeapon extends Weapon{
			@Override
			public void attack() {
				System.out.println("우주에 있는 적들을 공격");
			}
		}
		// Abstract class type의 참조값을 Local Inner Class를 이용해서 얻어냄
		Weapon w2 = new SpaceWeapon();
		w2.prepare();
		w2.attack();
	}
}
