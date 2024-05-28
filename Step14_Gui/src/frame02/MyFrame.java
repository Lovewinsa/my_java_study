package frame02;

import java.awt.FlowLayout;

import javax.swing.JButton;
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
		
		// 레이아웃 매니저 객체 생성
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		// 프레임의 레이아웃 매니저 설정
		setLayout(layout);	//	FlowLayout이 LayoutManager의 interface를 implement(구현)했다.
		
		JButton btn1 = new JButton("버튼1");
		// 프레임의 add() method 호출하면서 JButton객체의 참조값을 전달하면 프레임에 버튼이 배치된다.
		this.add(btn1);	//	JButton은 Component를 상속받았기 때문에 사용 가능.
		
		// 버튼 2개를 프레임에 추가로 배치해 보세요.
		JButton btn2 = new JButton("내가해1");
		this.add(btn2);
		JButton btn3 = new JButton("내가해2");
		this.add(btn3);
		
		
		
		
		this.setVisible(true);
		//this.은 생략 가능 : 상속 받을 때 MyFrame과 JFrame은 같은 객체 안에 들어가있게 된다.
	}
	
	// main method
	public static void main(String[] args) {
		new MyFrame();
	}
}
