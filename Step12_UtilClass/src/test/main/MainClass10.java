package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass10 {
	public static void main(String[] args) {
		//	1. 세 명의 회원정보(번호, 이름, 주소)를 HashMap 객체를 생성해서 담아보기
		//		HashMap 객체 하나당 한 명의 회원정보를 담으니 총 3개의 HashMap객체가 생성되어야 함
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("번호", 1);
		map1.put("이름", "김구라");
		map1.put("주소", "노량진");
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("번호", 2);
		map2.put("이름", "해골");
		map2.put("주소", "행신동");
		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("번호", 3);
		map3.put("이름", "원숭이");
		map3.put("주소", "동물원");
		//	2. 위에서 생성한 HashMap 객체를 담을 ArrayList 객체를 생성해보기
		List<Map<String, Object>> members = new ArrayList<Map<String,Object>>();
		//	3. ArrayList 객체에 HashMap 객체 3개를 담아보기
		members.add(map1);
		members.add(map2);
		members.add(map3);
		//	4. 반복문 돌면서 ArrayList에 담긴 회원정보를 console에 출력해보기
		for(int i=0; i<members.size(); i++) {
			int num = (int)members.get(i).get("번호");
			String name = (String)members.get(i).get("이름");
			String addr = (String)members.get(i).get("주소");
			String info = String.format("번호: %d, 이름:%s, 주소:%s",
			num, name, addr );
			System.out.println(info);
		}
		System.out.println("-----------------");
		for(Map<String, Object> tmp : members) {
			String info = String.format("번호:%d, 이름:%s, 주소:%s",
					(int)tmp.get("번호"), (String)tmp.get("이름"), (String)tmp.get("주소"));
			System.out.println(info);
		}
			
	}

}
