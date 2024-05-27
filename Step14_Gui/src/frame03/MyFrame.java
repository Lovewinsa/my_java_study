package frame03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame() {
		// 프레임의 제목 설정
		this.setTitle("나의 프레임");
		// 프레임의 위치와 크기 설정 setBounds(x, y, width, height)
		this.setBounds(100, 100, 500, 500);
		// 종료 버튼을 눌렀을 때 프로세스 전체가 종료되도록 한다
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	// EXIT_ON_CLOSE = JFrame.EXIT_ON_CLOSE = 3
		// 화면상에 실제 보이도록 한다
		
		// 레이아웃 매니저 객체 생성
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		
		
		// 프레임의 레이아웃 매니저 설정
		setLayout(layout);	//	FlowLayout이 LayoutManager의 interface를 implement(구현)했다.
		
		JButton btn1 = new JButton("버튼1");
		// 프레임의 add() method 호출하면서 JButton객체의 참조값을 전달하면 프레임에 버튼이 배치된다.
		this.add(btn1);	//	JButton은 Component를 상속받았기 때문에 사용 가능.
		
		ActionListener listener = new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("1번 버튼을 눌렀네요?");
			}
		};
		btn1.addActionListener(listener);
		
		// 버튼을 하나 추가로 만들어서
		JButton btn2 = new JButton("버튼2");
		// 프레임에 추가하고
		add(btn2);
		// 액션 리스너 등록하기
		btn2.addActionListener((e)->{
			System.out.println("2번 버튼을 눌렀네요?");
		});
		
		
		
		
		
		this.setVisible(true);
		//this.은 생략 가능 : 상속 받을 때 MyFrame과 JFrame은 같은 객체 안에 들어가있게 된다.
	}
	
	// main method
	public static void main(String[] args) {
		new MyFrame();
	}
}
