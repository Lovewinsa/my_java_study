package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MainClass03 {

	public static void main(String[] args) {
		// 인사말을 담을 ArrayList 객체를 생성해서 참조값을 greets 지역변수에 대입하기
		List<String> greets = new ArrayList<String>(); 
		// greets에 들어있는 참조값을 이용해 인사말 3개를 임의로 담아보세요
		greets.add("좋은 아침입니다");
		greets.add("밥은 드셨어요?");
		greets.add("잠은 잘 주무셨어요?");
		
		Consumer<String> con = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		// 
		greets.forEach(con);
		
		System.out.println("------------");
		
		Consumer<String> con2 = (t)->{
			System.out.println(t);
		};
		
		greets.forEach(con2);
		
		System.out.println("------------");
		
		greets.forEach((t)->{
			System.out.println(t);
		});
		
	}
}
