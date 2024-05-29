package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import test.dto.MemberDto;

public class MainClass15 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("C:/Users/user/playground/myFolder/member.dat");
			ois = new ObjectInputStream(fis);
			MemberDto dto = (MemberDto)ois.readObject();
			String info = String.format("번호:%d, 이름:%s, 주소:%s",
					dto.getNum(), dto.getName(), dto.getAddr());
			System.out.println(info);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(ois!=null) ois.close();
				if(fis!=null) fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
				
	}
}
