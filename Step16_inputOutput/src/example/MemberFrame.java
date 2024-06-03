package example;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dto.MemberDto;

public class MemberFrame extends JFrame implements ActionListener{
	// 필요한 필드 정의
	JTextField inputNum, inputName, inputAddr;
	DefaultTableModel model;
	List<MemberDto> list = new ArrayList<>();
	JTable table;
	
	// 생성자
	public MemberFrame(String title) {
		super(title);
		setLayout(new BorderLayout());
		//JLable 3개
		JLabel label1=new JLabel("번호");
		JLabel label2=new JLabel("이름");
		JLabel label3=new JLabel("주소");
		//JTextField 3개
		inputNum=new JTextField(10);
		inputName=new JTextField(10);
		inputAddr=new JTextField(10);
		//JButton
		JButton	addBtn=new JButton("추가");
		JButton deleteBtn = new JButton("삭제");
		// 버튼에 ActionCommand 설정을 할 수가 있다
		addBtn.setActionCommand("add");
		deleteBtn.setActionCommand("delete");
		
		//페널에 UI 배치
		JPanel panel=new JPanel();
		panel.add(label1);
		panel.add(inputNum);
		panel.add(label2);
		panel.add(inputName);
		panel.add(label3);
		panel.add(inputAddr);
		panel.add(addBtn);
		panel.add(deleteBtn);
		
		
		//페널을 프레임의 위쪽에 배치
		add(panel, BorderLayout.NORTH);
		
		//테이블
		table = new JTable();
		// 테이블의 칼럼명을 배열로 미리 준비한다
		String[] colNames = {"번호", "이름", "주소"};
		// 테이블에 연결할 모델
		model = new DefaultTableModel(colNames, 0);
		// 모델을 테이블에 연결
		table.setModel(model);
		// 스크롤이 가능하도록 테이블을 JScrollPane에 감싼다
		JScrollPane scroll = new JScrollPane(table);
		// JScrollPane을 프레임의 가운데에 배치
		add(scroll, BorderLayout.CENTER);
		// 테이블에 sample 데이터 출력
//		Object[] data1 = {1, "김구라", "노량진"};
//		Object[] data2 = {2, "해골", "행신동"};
//		model.addRow(data1);
//		model.addRow(data2);
//		
//		Vector<Object> data3 = new Vector<>();
//		data3.add(3);
//		data3.add("원숭이");
//		data3.add("동물원");
//		model.addRow(data3);
		
//		addBtn.addActionListener((e)->{
//			Object[] data = {inputNum.getText(), inputName.getText(), inputAddr.getText()};
//			model.addRow(data);
//		});
		addBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		
		loadFromFile();
		refreshTable();
	}
	
		public static void main(String[] args) {
			MemberFrame f = new MemberFrame("회원정보 관리");
			f.setDefaultCloseOperation(EXIT_ON_CLOSE);
			f.setBounds(100, 100, 800, 500);
			f.setVisible(true);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// 이벤트가 발생한 UI에 설정된 ActionCommand 문자열 읽어오기
			String command = e.getActionCommand();
			/*
			 * 	☆ 중요!!!
			 * 	java에서 문자열은 내용이 같아도 참조값이 다른 경우가 있다
			 *	따라서, 문자열의 내용이 같은지 비교 할 때는 동등비교연산자(==)를 사용하면 안된다
			 *	문자열의 내용을 비교할 때는 .equals() 메소드를 활용해야한다.
			 */
			if(command.equals("add")) {
				//입력한 번호를 읽어와서 정수로 바꾸기
				int num = Integer.parseInt(inputNum.getText());
				// 이름
				String name = inputName.getText();
				// 주소
				String addr = inputAddr.getText();
				// 입력한 번호, 이름, 주소를 Object[]에 넣기
				Object[] info = {num, name, addr};
				// DefaultTableModel 객체에 .addRow() 메소드를 호출하면서 전달
				model.addRow(info);
				// list회원 한 명의 정보를 담기
				MemberDto dto = new MemberDto(num, name, addr);
				list.add(dto);
			}else if(command.equals("delete")) {
				// 선택된 JTableRow가 있다면 몇 번째 row가 선택되었는지를 읽어와서
				int selectedRow = table.getSelectedRow();
				if(selectedRow == -1) {
					JOptionPane.showMessageDialog(this, "삭제할 row를 선택하세요");
					return;	// 메소드를 여기서 리턴시켜라(끝내라)
				}
				// List<MemberDto> 객체에 해당 인덱스를 삭제하면 된다
				list.remove(selectedRow);
			}
		
			// 새로고침
			refreshTable();
			// 파일에 저장하기
			saveToFile();

		}
		
		// List<MemberDto> 객체를 파일에 저장하는 메소드
		public void saveToFile() {
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			
				try {
					File file = new File("C:/Users/user/playground/myFolder/members.dat");
					if(!file.exists()) {
					file.createNewFile();
					}
					fos = new FileOutputStream(file);
					oos = new ObjectOutputStream(fos);
					//List<MemberDto> 객체를 파일에 출력하기
					oos.writeObject(list);
					//oos.flush(); //close() 될때 auto flush 가 된다. 
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						if(oos!=null)oos.close();
						if(fos!=null)fos.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			
		}
		
		//member.dat 파일로부터 List<MemberDto> 객체를 얻어와 필드에 저장하는 메소드
		public void loadFromFile() {
			// 필요한 객체를 담을 지역변수 미리 선언
			FileInputStream fis = null;
			ObjectInputStream ois = null;
			try {
				File file = new File("C:/Users/user/playground/myFolder/members.dat");
				if(!file.exists()) {
					file.createNewFile();
				}
				fis = new FileInputStream(file);
				ois = new ObjectInputStream(fis);
				List<MemberDto> list = (List<MemberDto>) ois.readObject();
				this.list = list;	// 읽어온 데이터를 필드에 넣어준다
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			} finally {
				try {
					if(ois!=null) ois.close();
					if(fis!=null) fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		// 필드에 있는 List<MemberDto>를 이용해서 JTable에 목록을 출력하는 메소드
		public void refreshTable() {
			//기존에 출력된 내용은 한번 지워준다
			model.setRowCount(0);
			for(MemberDto tmp:list) {
				// MemberDto 객체를 순서대로 참조하면서 Object[] 객체를 만들어준다
				Object[] row = {tmp.getNum(), tmp.getName(), tmp.getAddr()};
				// 만든 Object[] 객체를 DefaultTableModel 객체에 추가면 테이블row가 출력
				model.addRow(row);
			}
		}
		
}
