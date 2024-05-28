package frame03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	public MyFrame(String title) {
		super(title);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		var startBtn = new JButton("카운트다운");
		add(startBtn);
		startBtn.addActionListener(this);	//	ActionListener를 구현한 후 사용 가능
//		startBtn.addActionListener((e)->{
//		var t = new CountRunnable();
//		new Thread(t).start();
//		});
	}

	public static void main(String[] args) {
		MyFrame f = new MyFrame("스레드 테스트");
		f.setBounds(100, 100, 300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Thread객체를 생성하면서 CountRunnable객체의 참조값을 넘겨주고 start() 메소드를 호출
//첫번째	new Thread(new CountRunnable()).start();
//두번째	new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				int count = 10;
//				// 반복문 돌면서
//				while(true) {
//					System.out.println("현재 count : " + count);
//					if(count==0) {
//						System.out.println("작업이 끝났습니다");
//						break;
//					}
//					try {
//						Thread.sleep(1000*1);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					count--;		
//				}
//			}
//		}).start();	//	Runnable()은 뒤{}(=익명 클래스)의 생성자를 호출
//					//	Runnable()은 추상메소드가 하나인 interface이기 때문에 이런 형식 가능
		new Thread(()->{
			int count = 10;
			while(true) {
				System.out.println("현재 count : " + count);
				if(count==0) {
					System.out.println("작업이 끝났습니다");
					break;
				}
				try {
					Thread.sleep(1000*1);
				} catch (InterruptedException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				count--;
			};
		}).start();
		
		// 추가로 얻어갈 것 : 사용 방법에 따라 약간의 차이 있음
		Runnable r1 = new Runnable() {
			Runnable a = this;	// this는 Runnable
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
		Runnable r2 = ()->{
			MyFrame b = this;	// this는 MyFrame
		};
		
		
	}
}
