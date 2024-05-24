package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import test.mypac.MemberDto;

public class MainClass06 {
	public static void main(String[] args) {
		// 1. MemberDto 객체를 담을 수 있는 ArrayList 객체를 생성해서
		//		참조값을 members라는 지역변수에 담아보기
		List<MemberDto> members = new ArrayList<MemberDto>();
		// 2. 3명의 회원정보를 MemberDto객체에 각각 담아보기(MemberDto객체가 3개 생성)
		MemberDto md1 = new MemberDto();
		// dto1.num=1; >>> field에 직접 접근 불가능
		md1.setNum(1);
		md1.setName("김구라");
		md1.setAddr("노량진");
		MemberDto md2 = new MemberDto();
		md2.setNum(2);
		md2.setName("해골");
		md2.setAddr("행신동");
		MemberDto md3 = new MemberDto();
		md3.setNum(3);
		md3.setName("아무개");
		md3.setAddr("강남역");
		// 3. 위에서 생성된 MemberDto객체의 참조값을 ArrayList객체에 모두 담아보세요
		members.add(md1);
		members.add(md2);
		members.add(md3);
			
		for(int i=0; i<members.size(); i++) {
			int num = members.get(i).getNum();
			String name = members.get(i).getName();
			String addr = members.get(i).getAddr();
			System.out.println("번호 :" + num + ", 이름 :" + name + ", 주소 :" + addr                   );
		}
		System.out.println("----------------");
		for(MemberDto tmp:members) {
			System.out.println(tmp.getNum() + tmp.getName() + tmp.getAddr());
		}
		System.out.println("----------------");
		Consumer<MemberDto> con = new Consumer<MemberDto>() {
			@Override
			public void accept(MemberDto t) {
				System.out.println(t.getNum()+t.getName()+t.getAddr());				
			}
		};
		members.forEach(con);
		System.out.println("----------------");
		Consumer<MemberDto> con2 = (tmp)->{
			System.out.println(tmp.getNum()+tmp.getName()+tmp.getAddr());	
		};
		members.forEach(con2);
		
		for(MemberDto tmp:members) {
			/*
			 * 	String class의 format()이라는 static method를 사용하면
			 * 	원하는 문자열 형식을 좀 더 간편하게 얻어낼 수 있다.
			 * 
			 *  %d : 숫자(정수)를 출력할 때
			 *  %f : 실수를 "
			 *  %s : 문자를 "
			 *  %b : boolean을 "
			 *  %% : %자체를 "
			 */
			String info = String.format("번호:%d 이름:%s 주소:%s",
					tmp.getNum(), tmp.getName(), tmp.getAddr());
			System.out.println(info);
		}
		
//		test();
//		test("hi");
		test("hi", "hello","bye");
		
	}
	public static void test(String... msg) {
		// msg는 String[] type이다
		for(String tmp:msg) {
			System.out.println(tmp);
		}
		
	}
}
