package frame02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame{
	public MyFrame(String title) {
		super(title);
		// 레이아웃 설정
		setLayout(new FlowLayout(FlowLayout.CENTER));
		/*
		 * 	- type 추론이 가능하다면 지역변수의 type선언 대신에 var로 선언할 수 있다.
		 * 	- java10에서 추가된 문법, 아직 실무에서는 1.8버전을 쓰는 곳이 많다.
		 * 	- 지역변수에만 사용가능, field는 사용 불가능
		 * 	- interface type 추론 불가
		 * 	- null로 초기화 불가
		 */
		var startBtn = new JButton("작업시작");
		add(startBtn);
		startBtn.addActionListener((e)->{
			System.out.println("10초 걸리는 작업을 시작합니다.");
			try {
				Thread.sleep(1000*10);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("작업이 종료되었습니다");
		});
		
		var startBtn2 = new JButton("작업시작2");
		add(startBtn2);
		startBtn2.addActionListener((e)->{
		new WorkThread().start();
		});
	}
	public void test() {
		MyFrame a = this;
	}
	
	
	// 스레드 클래스를 내부 클래스로 만들어보기
	class WorkThread extends Thread{
		// WorkThread 클래스의 ㅁ소드
		@Override
		public void run() {
			
			System.out.println("10초 걸리는 작업을 시작합니다.");
			try {
				Thread.sleep(1000*10);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			WorkThread a = this;
			//내부클래스에서 바깥에 있는 클래스로 생성된 객체의 참조값이 필요할 때까 있다.
			MyFrame b = MyFrame.this; // ☆ 바깥에있는클래스명.this
			// 새로운 스레드에서 해야 할 작업을 run() 메소드 안에서 한다
			JOptionPane.showMessageDialog(MyFrame.this, "작업이 완료되었습니다");
		}
	}
	
	// Main Thread가 시작되는 main method
	public static void main(String[] args) {
		MyFrame f = new MyFrame("스레드 테스트 프레임");
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
	}
}
