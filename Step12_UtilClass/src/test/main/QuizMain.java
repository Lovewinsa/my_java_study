package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class QuizMain {
	public static void main(String[] args) {
		//	1. 정수를 담을 수 있는 ArrayList 객체를 생성해서 nums라는 지역변수에 담기
		List<Integer> nums = new ArrayList<Integer>();
		//	2. 반복문 10번 돌면서 1~100 사이의 random 정수를 각각 얻어내서
		//		위에서 생성한 nums객체에 순서대로 담아보기
		Random ran = new Random();
		for(int i=0; i<10; i++) {
			int ranNum = ran.nextInt(100)+1;
			nums.add(ranNum);
		}
		//	3. nums배열에 저장된 숫자에서 중복된 숫자가 제거된 새로운 ArrayList 객체를 얻어내 보기
		Set<Integer> set = new HashSet<Integer>(nums);
		List<Integer> result = new ArrayList<Integer>(set);
		//	4. 새로운 배열에 숫자를 오름차순으로 정렬해 보기
		Collections.sort(result);
		//	5. 새로운 배열에 저장된 숫자를 순서대로 콘솔창에 출력해 보기
		for(int t:result) {
			System.out.println(t);
		}
	}
}
