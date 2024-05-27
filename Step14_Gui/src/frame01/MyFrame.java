package frame01;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame() {
		// 프레임의 제목 설정
		this.setTitle("나의 프레임");
		// 프레임의 위치와 크기 설정 setBounds(x, y, width, height)
		this.setBounds(100, 100, 500, 500);
		// 종료 버튼을 눌렀을 때 프로세스 전체가 종료되도록 한다
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 화면상에 실제 보이도록 한다
		this.setVisible(true);
		
		//this.은 생략 가능 : 상속 받을 때 MyFrame과 JFrame은 같은 객체 안에 들어가있게 된다.
	}
}
