package test.main;

import java.util.HashMap;

/*
 * 	HashMap<key type, value type>
 * 
 * 	key type은 일반적으로 String type를 가장 많이 사용한다.
 * 	value type는 담고 싶은 data의 type을 고려해서 지정하면 된다.
 * 	value type을 Object로 지정하면 어떤 data type이던지 다 담을 수 가 있다.
 * 	순서가 없는 data를 다룰 때 사용하면 된다.
 * 	Dto class 대신에 사용하기도 한다.
 */
public class MainClass08 {
	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("num", 1);
		map.put("name", "kimgura");
		map.put("isMan", true);
		
		// value의 generic class가 Object기 때문에 Object type이 return된다.
		int num = (Integer)map.get("num");
		String name = (String)map.get("name");
		Boolean isMan  = (boolean)map.get("isMan");
		
		/*
		 * 	위의 7줄의 code를 javascript로 표현한다면 아래와 같다
		 * 
		 * 	let map = {};
		 * 	map.num = 1;
		 * 	map.name = "김구라";
		 * 	map.isMan = true;
		 * 
		 * 	let num = map.num;
		 * 	let name = map.name;
		 * 	let isMan = map.isMan;
		 * 
		 *	아래의 코드도 가능하다
		 *	let map = {};
		 *	map["num"] = 1;
		 *	map["name"] = "김구라";
		 *	map["isMan"] = true;
		 *
		 *	let num = map["num"];
		 *	let name = map["name"];
		 *	let isMan = map["isMan"];
		 */
	}
}
