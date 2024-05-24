package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("main메소드가 시작되었습니다.");
		// 지역변수를 선언만 하면? 만들어지지 않는다
		int num;
		String name1;
		
		// 아직 만들어지지 않았기 때문에 num은 참조 불가
		// int result = 10 + num;
		// 아직 만들어지지 않았기 때문에 name1은 참조 불가
		// System.out.println(name1);
		
		int num2 = 0;
		String name2 = null;
			
		int result2 = 10 + num2;
		System.out.println(name2);
		
		System.out.println("main메소드가 종료됩니다.");
	}
}
