package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import test.mypac.Member;

public class MainClass05 {
	public static void main(String[] args) {
		// 1. Member 객체를 담을 수 있는 ArrayList 객체를 생성해서
		//		참조값을 members라는 지역변수에 담아보기
		List<Member> members = new ArrayList<Member>(); 
		// 2. 3명의 회원정보를 Member객체에 각각 담아보기(Member객체가 3개 생성)
		Member mem1 = new Member(1, "김구라", "노량진");
		Member mem2 = new Member(2, "해골", "행신동");
		Member mem3 = new Member();
		mem3.num = 3;
		mem3.name = "아무개";
		mem3.addr = "강남역";
		// 3. 위에서 생성된 Member 객체의 참조값을 ArrayList 객체에 모두담아보기
		members.add(mem1);
		members.add(mem2);
		members.add(mem3);
		/*
		 * 	4. members List 객체에 담긴 내용을 이용해서 회원목록을 아래와 같은 형식으로
		 * 		반복문을 돌면서 출력해 보기
		 * 
		 * 	"문자" + 값 + "문자" + 값 + "문자" + 값 
		 * 	번호: 1, 이름: 김구라, 주소: 노량진
		 * 	번호: 2, 이름: 해골, 주소: 행신동
		 * 	.
		 * 	.
		 * 	.
		 */
		for(int i=0; i<members.size(); i++) {
			System.out.println("번호: " + members.get(i).num + ", 이름: " + members.get(i).name + ", 주소: " + members.get(i).addr );
		}
		
		System.out.println("----------------");
		
		Consumer<Member> con = new Consumer<Member>() {
			@Override
			public void accept(Member t) {
				System.out.println("번호: " + t.num + ", 이름: " + t.name + ", 주소: " + t.addr );
			}
		};
		members.forEach(con);
		
		System.out.println("-------------");
		
		for(Member tmp:members) {
			String info = tmp.num + tmp.name + tmp.addr;
			System.out.println(info);
		}
		
		
	}
}
