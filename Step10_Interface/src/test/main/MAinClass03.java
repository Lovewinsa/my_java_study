package test.main;

import test.mypac.Remocon;

public class MAinClass03 {

	public static void main(String[] args) {
		// Interface도 anonymous class를 활용해서 구현 후에 참조값을 얻어낼 수 있다.
		Remocon r1 = new Remocon() {
			@Override
			public void up() {
				System.out.println("Volumn up");
			}			
			@Override
			public void down() {
				System.out.println("Volumn down");
			}
		};
		
		useRemocon(r1);
		
		useRemocon(new Remocon() {
			@Override
			public void up() {
				System.out.println("Warm up");
			}			
			@Override
			public void down() {
				System.out.println("Cool down");
			}
		});
	}
	
	public static void useRemocon(Remocon r	) {
		r.up();
		r.down();
	}
}
