package frame09;

import java.awt.BorderLayout;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class NewFrame extends JFrame{
	// 필요한 필드 선언
	JTextArea ta;
	File openedFile;
	FileInputStream fis = null;
	ObjectInputStream ois = null;
	FileOutputStream fos = null;
	ObjectOutputStream oos = null;
	// 생성자
	public NewFrame(String title) {
		super(title);
		// 프레임의 레이아웃을 BorderLayout으로 설정
		setLayout(new BorderLayout());
		JMenuBar mb = new JMenuBar();
		// 메뉴
		JMenu menu = new JMenu("File");
		// 메뉴 아이템
		JMenuItem newItem = new JMenuItem("New");
		JMenuItem openItem = new JMenuItem("Open");
		JMenuItem saveItem = new JMenuItem("Save");
		saveItem.setEnabled(false);
		JMenuItem saveAsItem = new JMenuItem("Save AS");
		saveAsItem.setEnabled(false);
		// 메뉴에 메뉴 아이템을 순서대로 추가
		menu.add(newItem);
		menu.add(openItem);
		menu.add(saveItem);
		menu.add(saveAsItem);
		
		mb.add(menu);
		
		setJMenuBar(mb);
		
		//JTextArea 객체의 참조값을 필드에 저장
		ta = new JTextArea();
		//JTextArea를 Scroll패널 안에 위치시키기
		JScrollPane scp = new JScrollPane(ta);
		//프레임의 가운데에 JScrollPane 배치
		this.add(scp, BorderLayout.CENTER);
		ta.setVisible(false);
		Font font = new Font("Serif", Font.PLAIN, 30);
		ta.setFont(font);
		
		// New를 눌렀을 때 실행할 리스너 등록
		newItem.addActionListener((e)->{
			ta.setVisible(true);
			setTitle("제목 없음");
			saveAsItem.setEnabled(true);
		});
		
		// Save As를 눌렀을 때 실행할 리스너 등록
		saveAsItem.addActionListener((e)->{
			// 파일 선택을 도와주는 객체 생성
			var fc = new JFileChooser("C:/Users/user/playground/myFolder");
			int result = fc.showSaveDialog(this);
			if( result == JFileChooser.APPROVE_OPTION ) {
				// 선택된 File객체의 참조값을 필드에 저장
				openedFile = fc.getSelectedFile();
				setTitle(openedFile.getName());
				// 새로운 파일을 실제로 만들기
				try {
					openedFile.createNewFile();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				saveToFile();
			}
		});
		
		// Open를 눌렀을 때 실행할 리스너 등록
		openItem.addActionListener((e)->{
			var fc = new JFileChooser("C:/Users/user/playground");
			int result = fc.showOpenDialog(this);
			if( result == JFileChooser.APPROVE_OPTION) {
				// 선택한 파일을 제어할 수 있는 File객체의 참조값을 얻어내 필드에 저장
				openedFile = fc.getSelectedFile();
				// 선택한 파일의 이름을 title에 출력
				String fileName = openedFile.getName();
				// 프레임의 setTitle() 메소드를 이용해서 제목 수정하기
				setTitle(fileName);
				// TextArea를 보이게하고
				ta.setVisible(true);
				//선택된 파일로부터 문자열을 읽어와서 JTextArea에 출력하는 메소드
				loadFromFile();
				// saveItem,saveAsITem을 활성화
				saveItem.setEnabled(true);
				saveAsItem.setEnabled(true);
			}
		});
		
		// Save를 눌렀을 때
		saveItem.addActionListener((e)->{
			saveToFile();
		});
		
		
	}
	
	//현재까지 JTextArea에 입력한 문자열을 읽어와서 File에 저장하기
	public void saveToFile() {
		// 입력한 문자열 읽어오기
		String content = ta.getText();
		FileWriter fw = null;
		try {
			// 선택한 File 객체의 참조값을 생성자에 넘겨주면서 FileWriter 객체 생성하기
			fw = new FileWriter(openedFile);
			fw.write(content);
			fw.flush();
			JOptionPane.showMessageDialog(this, "저장했습니다");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	//선택된 파일로부터 문자열을 읽어와서 JTextArea에 출력하는 메소드
	public void loadFromFile() {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			// 필드에 저장되어있는 File 객체를 이용해서 FileReader 객체를 생성
			fr = new FileReader(openedFile);
			// 좀 더 편하게 문자열을 읽어들이기 위해 FileReader 객체를 BufferedReader로 포장
			br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				// JTextArea에 1줄씩 추가하기(데이터를 한 곳에 누적시켜놨다가 옮기는 방법도 있음)
				ta.append(line + "\r\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(br!=null)br.close();
				if(fr!=null)fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
	
	public static void main(String[] args) {
		NewFrame f = new NewFrame("새 프레임");
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
