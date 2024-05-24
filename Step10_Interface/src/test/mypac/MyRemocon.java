package test.mypac;

public class MyRemocon implements Remocon{
	@Override
	public void up() {
		System.out.println("Up channel");
		
	}
	@Override
	public void down() {
		System.out.println("Down channel");
		
	}
	
}
