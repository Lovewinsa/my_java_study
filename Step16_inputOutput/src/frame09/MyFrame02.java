package frame09;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame02 extends JFrame implements ActionListener{
	JTextArea ta;
	JMenuItem newItem;
	JMenuItem saveItem;
	JMenuItem saveAsItem;
	File openedFile;
	public MyFrame02(String title) {
		super(title);
		
//		BorderLayout layout = new BorderLayout();	//	East / West / South / North / Center
		this.setLayout(new BorderLayout());
		
		// 메뉴 바
		JMenuBar mb = new JMenuBar();
		// 메뉴
		JMenu menu = new JMenu("File");
		// 메뉴 아이템
		newItem = new JMenuItem("New");
		JMenuItem openItem = new JMenuItem("Open");
		saveItem = new JMenuItem("Save");
		saveItem.setEnabled(false);
		saveAsItem = new JMenuItem("Save As");
		saveAsItem.setEnabled(false);
		// 메뉴에 메뉴 아이템을 순서대로 추가
		menu.add(newItem);
		menu.add(openItem);
		menu.add(saveItem);
		menu.add(saveAsItem);
		// 메뉴를 메뉴 바에 추가
		mb.add(menu);
		// 프레임의 메소드를 이용해서 메뉴바를 추가하기
		setJMenuBar(mb);	// JFrame이 가지고 있는 setJMenuBar() method
		
		// JTextArea객체의 참조값을 필드에 저장
		ta = new JTextArea();
		// JTextArea를 Scroll패널 안에 위치시키기
		JScrollPane scp = new JScrollPane(ta);
		// 프레임의 가운데에 JScrollPane 배치하기
		add(scp, BorderLayout.CENTER);
		ta.setVisible(false);
		// JTextArea의 글자크기 조절하기
		Font font = new Font("Serif", Font.PLAIN, 30);
		ta.setFont(font);
		
		newItem.addActionListener(this);
		
		saveAsItem.addActionListener((e)->{
			var fc = new JFileChooser("C:/Users/user/playground/myFolder");
			int result = fc.showSaveDialog(this);
			if(result==JFileChooser.APPROVE_OPTION) {
				openedFile = fc.getSelectedFile();
				setTitle(openedFile.getName());
				try {
					openedFile.createNewFile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				saveToFile();
				
			}
		});
		
		openItem.addActionListener((e)->{
			JFileChooser fc = new JFileChooser("C:/Users/user/playground");
			int result = fc.showOpenDialog(this);
			if(result == JFileChooser.APPROVE_OPTION) {
				// 선택한 파일을 제어할 수있는 File 객체의 참조값을 얻어내 필드에 저장
				openedFile = fc.getSelectedFile();
				// 선택한 파일의 이름을 title에 출력
				String fileName = openedFile.getName();
				// ㅍ레임의 setTitle() 메소드를 이용해 제목 수정
				setTitle(fileName);
				ta.setVisible(true);
				loadFromFile();
			}
		});

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		ta.setVisible(true);
		setTitle("제목 없음");
		saveAsItem.setEnabled(true);
	} //생성자
	
	public void saveToFile() {
		String content = ta.getText();
		
		FileWriter fw = null;
		try {
			// 선택한 File 객체의 참조값을 생성자에 넘겨주면서 FileWriter 객체 생성하기
			fw = new FileWriter(openedFile);
			fw.write(content);
			fw.flush();
			JOptionPane.showMessageDialog(this, "저장했습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	// 선택된 파일로부터 문자열을 읽어와서 JTextArea에 출력하는 메소드
	public void loadFromFile() {
		
	}
	
	public static void main(String[] args) {
		MyFrame02 f = new MyFrame02("나의 io 프레임");
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
