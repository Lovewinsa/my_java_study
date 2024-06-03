package example;

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

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

public class StudyMemberFrame extends JFrame{
	JTextField inputNum, inputName, inputAddr;
	JTable table;
	DefaultTableModel model;
	List<MemberDto> list = new ArrayList<>();
	
	public StudyMemberFrame(String title) {
		super(title);
		setLayout(new BorderLayout());
		
		JLabel label1 = new JLabel("번호");
		JLabel label2 = new JLabel("이름");
		JLabel label3 = new JLabel("주소");
		
		inputNum = new JTextField(10);
		inputName = new JTextField(10);
		inputAddr = new JTextField(10);
		
		JButton addBtn = new JButton("추가");
		JButton deleteBtn = new JButton("삭제");
		
		
		JPanel panel = new JPanel();
		panel.add(label1);
		panel.add(inputNum);
		panel.add(label2);
		panel.add(inputName);
		panel.add(label3);
		panel.add(inputAddr);
		panel.add(addBtn);
		panel.add(deleteBtn);
		
		this.add(panel, BorderLayout.NORTH);
		
		table = new JTable();
		String[] colNames = {"번호", "이름", "주소"};
		model = new DefaultTableModel(colNames, 0);
		table.setModel(model);
		JScrollPane scroll = new JScrollPane(table);
		this.add(scroll, BorderLayout.CENTER);
				
		addBtn.addActionListener((e)->{
			int num = Integer.parseInt(inputNum.getText());
			String name = inputName.getText();
			String addr = inputAddr.getText();
			Object[] info = {num, name, addr};
			
			model.addRow(info);
			MemberDto dto = new MemberDto(num, name, addr);
			list.add(dto);
			// 새로고침
			refreshTable();
			// 파일에 저장하기
			saveToFile();
		});
		
		deleteBtn.addActionListener((e)->{
			int selectedRow = table.getSelectedRow();
			if(selectedRow == -1) {
				JOptionPane.showMessageDialog(this, "삭제할 row를 선택하세요");
				return;
			}
			list.remove(selectedRow);
			// 새로고침
			refreshTable();
			// 파일에 저장하기
			saveToFile();
		});
		
		loadFromFile();
		refreshTable();
	}
	
	public static void main(String[] args) {
		StudyMemberFrame f2 = new StudyMemberFrame("회원정보 관리2");
		f2.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f2.setBounds(100, 100, 800, 500);
		f2.setVisible(true);
	}
	
	public void loadFromFile() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		File file = new File("C:/Users/user/playground/myFolder/members5.dat");
		
			try {
				if(!file.exists()) {
					file.createNewFile();
				}
				fis = new FileInputStream(file);
				ois = new ObjectInputStream(fis);
				List<MemberDto> list = (List<MemberDto>) ois.readObject();
				this.list = list;
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
	
	public void refreshTable() {
		// 기존에 출력된 내용 한번 지워주기
		model.setRowCount(0);
		for(MemberDto tmp:list) {
			Object[] row = {tmp.getNum(), tmp.getName(), tmp.getAddr()};
			model.addRow(row);
		}
	}
	
	// List<MemberDto>객체를 파일에 저장하는 메소드
	public void saveToFile() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		File file = new File("C:/Users/user/playground/myFolder/members5.dat");
		
			try {
				if(!file.exists()) {
				file.createNewFile();
				}
				fos = new FileOutputStream(file);
				oos = new ObjectOutputStream(fos);
				
				oos.writeObject(list);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if(oos!=null)oos.close();
					if(fos!=null)fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		
		
		
	}
}
