package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.PostDto;

/*
 * 	1. PostDto class를 만들어 보세요
 * 		PostDto에는 글 번호, 작성자, 제목을 담을 수 있어야 합니다.
 * 		즉, 3개의 field를 만들어야 합니다.
 * 		field name은 마음대로, field data type은 잘 생각해서
 * 		dto작성 규약에 맞게
 * 		test.mypac package에
 * 
 * 	2. PostDto 객체에 임의의 글 3개의 정보를 담아보세요.
 * 		총 3개의 PostDto 객체가 생성이 되어야 합니다.
 * 
 * 	3. PostDto 객체를 담을 수 있는 ArrayList 객체를 생성해서
 * 		위에서 생성한 PostDto객체를 ArrayList에 담아 보세요
 * 
 * 	4. 반복문 돌면서 ArrayList에 담긴 글 목록을 console창에 출력해보기
 */
public class QuizMain3 {
	public static void main(String[] args) {
		PostDto pd1 = new PostDto();
		pd1.setNum(1);
		pd1.setWriter("아이유");
		pd1.setTopic("좋은날");
		PostDto pd2 = new PostDto();
		pd2.setNum(2);
		pd2.setWriter("장기하");
		pd2.setTopic("싸구려 커피를 마신다");
		PostDto pd3 = new PostDto(3, "뉴진스", "OMG");
		
		List<PostDto> members = new ArrayList<PostDto>();
		members.add(pd1);
		members.add(pd2);
		members.add(pd3);
		
//		for(PostDto t:members) {
//			System.out.println(t.getTopic());
//		}
		for(PostDto t:members) {
			String info = String.format("글번호:%d, 작성자:%s, 제목:%s",
					t.getNum(), t.getWriter(), t.getWriter());
			System.out.println(info);
		}
	}
}
