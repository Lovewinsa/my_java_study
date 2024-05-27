package frame05;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
//	JButton saveBtn;
//	JButton updateBtn;
//	JButton deleteBtn;
	JButton saveBtn, updateBtn, deleteBtn;
	
	public MyFrame() {
		// 프레임의 제목 설정
		this.setTitle("나의 프레임");
		// 프레임의 위치와 크기 설정 setBounds(x, y, width, height)
		this.setBounds(100, 100, 500, 500);
		// 종료 버튼을 눌렀을 때 프로세스 전체가 종료되도록 한다
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	// EXIT_ON_CLOSE = JFrame.EXIT_ON_CLOSE = 3
		// 레이아웃 매니저 객체 생성
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		
		
		// 프레임의 레이아웃 매니저 설정
		setLayout(layout);	//	FlowLayout이 LayoutManager의 interface를 implement(구현)했다.
		
		// JButton 객체를 생성해서 참조값을 field에 저장해둔다. >> 다른 method에서 사용 가능하게 하려고
		this.saveBtn = new JButton("저장");
		updateBtn = new JButton("수정");
		deleteBtn = new JButton("삭제");
		
		add(saveBtn);
		add(updateBtn);
		add(deleteBtn);
		
		saveBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		
		
		
		
		
		
		// 화면상에 실제 보이도록 한다
		this.setVisible(true);
		//this.은 생략 가능 : 상속 받을 때 MyFrame과 JFrame은 같은 객체 안에 들어가있게 된다.
	}
	
	// main method
	public static void main(String[] args) {
		new MyFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//눌러진 버튼의 참조값 얻어내기
		Object which = e.getSource();
		
		if(which == saveBtn) {
			System.out.println("저장 버튼을 누르셨네요");
		} else if(which == this.updateBtn) {
			System.out.println("수정 버튼을 누르셨네요");
		} else if(which == deleteBtn) {
			System.out.println("삭제 버튼을 누르셨네요");
		}
				
	}
}
