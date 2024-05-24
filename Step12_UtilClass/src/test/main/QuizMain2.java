package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class QuizMain2 {
	public static void main(String[] args) {
		//	1. lotto number를 담을 Hashset 객체를 생성해서 set1이라는 지역변수에 담기
		Set<Integer> set1 = new HashSet<>();
		//	2. while문을 이용해서 랜덤한 lotto number를 set1에 반복적으로 담아보기
		//		while문 탈출 조건은 set1.size()가 6이 되면 탈출되도록 해보기
		Random ran = new Random();
//		while(set1.size()<6) {
//			int ranNum = ran.nextInt(45)+1;
//			set1.add(ranNum);
//		}
		while(true) {
			int ranNum = ran.nextInt(45)+1;
			set1.add(ranNum);
			if(set1.size()==6) {
				break;
			}
		}
		//	3. set1에 담긴 번호를 오름차순 정렬해서 console창에 모두 출력해보기
		List<Integer> result = new ArrayList<Integer>(set1);
		Collections.sort(result);
		for(Integer t:result) {
			System.out.println(t);
		}
	}
}
