package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass01 {

	public static void main(String[] args) {
		// java에서 array는 용도가 한정되어있다. item을 담을 수 있는 공간을 늘이거나 줄일 수 없다.
		
		// String type을 담을 수 있는 방 5개짜리 array 객체 생성
		String[] names = new String[5];
		names[0]="김구라";
		names[1]="해골";
		names[2]="원숭이";
		
		
		// String type를 순서대로 저장할 수 있는 ArrayList객체를 생성하고 참조값을 friends에 담기
		List<String> friends = new ArrayList<String>();
		friends.add("김구라2");
		friends.add("해골2");
		friends.add("원숭이2");
		
		// 0번 방의 item을 불러와서 item이라는 변수에 "담아보세요"
		String item = friends.get(0);
		// 1번 방의 item을 "삭제"하려면?
		friends.remove(1);	//	return되는 값은 삭제되는 data이다.
		// 0번 방에 "에이콘"을 "넣고(끼워넣기)" 싶으면?
		friends.set(0, "에이콘");
		// 저장된 아이템의 갯수(size)를 size라는 "지역변수에 담아보세요"
		int size = friends.size();
		// 저장된 모든 아이템 "전체 삭제"
		friends.clear();
		

		
	}

}
