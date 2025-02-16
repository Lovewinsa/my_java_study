package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass02 {

	public static void main(String[] args) {
		// 정수를 저장할 수 있는 ArrayList<Integer> 객체를 생성해서 참조값을 지역변수 nums에 담기
		List<Integer> nums = new ArrayList<Integer>();
		// ArrayList(가변배열) 객체에 10, 20, 30 숫자 3개를 담아 보세요
		nums.add(10);
		nums.add(20);
		nums.add(30);
		// ArrayList 객체에 저장된 숫자를 for문을 이용해서 순서대로 콘솔창에 출력해 보세요.
		for(int i=0; i<nums.size(); i++) {
			Integer tmp = nums.get(i);
			System.out.println("nums :" + tmp);
		}
		
		System.out.println("확장 for문을 활용하면...");
		
		for(Integer tmp:nums) {
			System.out.println(tmp);
		}
	}

}
