package frame01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

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
			//스레드 객체를 생성해서
			WorkThread t = new WorkThread();
			//새로운 스레드를 시작시킨다
			t.start();
		});
	}
	
	
	// Main Thread가 시작되는 main method
	public static void main(String[] args) {
		MyFrame f = new MyFrame("스레드 테스트 프레임");
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
	}
}
