package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		useDrill(new Drill() {
			@Override
			public void hole() {
				System.out.println("Drill a hole in the floor");
			}
		});
		
		// abstract method가 1개인 경우에만 사용할 수 있는 사용 가능
		useDrill(()->{
			System.out.println("Drill a hole in the sky");
		});
	}
	
	public static void useDrill(Drill d) {
		d.hole();
		d.hole();		
	}
}
