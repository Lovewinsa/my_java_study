package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		// 1. String type을 담을 수 있는 방 3개짜리 배열객체를 만들어서 참조값을 지역변수 names에 담기
		String[] names = {null, null, null};
		// String[] nums = new String[3];
		// 2. 3개의 방에 순서대로 친구의 이름을 담아보세요.
		names[0] = "영식이";
		names[1] = "춘식이";
		names[2] = "봉춘이";
		// 3. 배열에 들어있는 친구의 이름을 for문을 이용해서 하나씩 순서대로 콘솔창에 출력해보세요.
		for(int i=0; i<names.length; i++) {
			System.out.println("친구" + i + "이름 : " + names[i]);
		}
		
		
	}

}
