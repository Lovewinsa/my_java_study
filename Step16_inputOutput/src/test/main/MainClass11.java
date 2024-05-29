package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass11 {
	public static void main(String[] args) {
		
		try {
			// File로부터 btye알갱이를 읽어들일 객체
			var fis = new FileInputStream("C:/Users/user/playground/myFolder/1.jpg");
			// byte알갱이를 File에 출력할 객체 생성
			var fos = new FileOutputStream("C:/Users/user/playground/myFolder/copied.jpg");
			while(true){
				// 1byte 읽어들여서
				int readedByte = fis.read();
				System.out.println(readedByte);;
				if(readedByte == -1) break;
				fos.write(readedByte);
				fos.flush();
			}
			System.out.println("파일을 copy 했습니다.");
			fos.close();
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
}
