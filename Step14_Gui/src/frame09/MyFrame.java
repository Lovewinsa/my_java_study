package frame09;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	JTextArea ta;
	JMenuItem newItem;
	public MyFrame(String title) {
//		setTitle("나의 프레임");
//		setBounds(100, 100, 500, 500);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setVisible(true);
		super(title);
		
//		BorderLayout layout = new BorderLayout();	//	East / West / South / North / Center
		this.setLayout(new BorderLayout());
		
		// 메뉴 바
		JMenuBar mb = new JMenuBar();
		// 메뉴
		JMenu menu = new JMenu("File");
		// 메뉴 아이템
		JMenuItem newItem = new JMenuItem("New");
		JMenuItem openItem = new JMenuItem("Open");
		JMenuItem saveItem = new JMenuItem("Save");
		// 메뉴에 메뉴 아이템을 순서대로 추가
		menu.add(newItem);
		menu.add(openItem);
		menu.add(saveItem);
		// 메뉴를 메뉴 바에 추가
		mb.add(menu);
		// 프레임의 메소드를 이용해서 메뉴바를 추가하기
		setJMenuBar(mb);	// JFrame이 가지고 있는 setJMenuBar() method
		
		ta = new JTextArea();
		this.add(ta, BorderLayout.CENTER);
		ta.setVisible(false);
		
		newItem.addActionListener(this);
//		newItem.addActionListener((e)->{
//			ta.setVisible(true);
//		});
		
		// 프레임의 아래쪽에 버튼 추가하기
		JButton btn = new JButton("눌러보셈");
		add(btn, BorderLayout.SOUTH);
		// 버튼에 리스너 등록하기
		btn.addActionListener((e)->{
			System.out.println("10초 걸리는 작업을 수행중...");
			try {
				Thread.sleep(1000*10);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		ta.setVisible(true);
		
	}

	
}
