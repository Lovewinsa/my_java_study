package frame09;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
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
		
		JTextArea ta = new JTextArea();
		this.add(ta, BorderLayout.CENTER);
		ta.setVisible(false);
		
		newItem.addActionListener((e)->{
			ta.setVisible(true);
		});
	}

	
}
