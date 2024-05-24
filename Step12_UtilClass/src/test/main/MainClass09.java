package test.main;

import java.util.HashMap;
import java.util.Map;

import test.mypac.Car;

public class MainClass09 {
	public static void main(String[] args) {
		// HasgMap 객체를 생성해서 참조값을 Map 인터페이스 type 지역변수에 담기
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("num", 1);
		map1.put("name", "kimgura");
		map1.put("isMan", true);
		map1.put("car", new Car("소나타"));
		
		int num = (Integer)map1.get("num");
		String name = (String)map1.get("name");
		boolean isMan = (boolean)map1.get("isMan");
		Car car = (Car)map1.get("car");
		
		// 동일한 key값으로 다시 담으면 수정
		map1.put("name", "acorn");
		// 특정 key값으로 담긴 내용 삭제, 성공하면 true, 실패하면 false return
		map1.remove("isMan");
		// 모두 삭제
		map1.clear();
	}
}
