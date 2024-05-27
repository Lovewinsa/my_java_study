package test.mypac;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class testFrame extends JFrame{
	public testFrame() {
		setTitle("나의 프레임");
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		
		setLayout(layout);
		
		JButton btn1 = new JButton("button1");
		this.add(btn1);
		
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("1번 버튼 눌렀어");
				
			}
		};
		btn1.addActionListener(listener);
		
		
		JButton btn2 = new JButton("버튼2");
		add(btn2);
		btn2.addActionListener((e)->{
			System.out.println("2번 버튼 눌름");
		});
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new testFrame();
	}
}
