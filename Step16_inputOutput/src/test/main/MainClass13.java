package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass13 {
	public static void main(String[] args) {
		
		try {
			// File로부터 btye알갱이를 읽어들일 객체
			var fis = new FileInputStream("C:/Users/user/playground/myFolder/1.jpg");
			// byte알갱이를 File에 출력할 객체 생성
			var fos = new FileOutputStream("C:/Users/user/playground/myFolder/copied.jpg");
			
			// byte 알갱이를 읽어낼 배열을 미리 준비하기
			byte[] buffer = new byte[1024];
			
			while(true){
				int readedCount = fis.read(buffer);
				System.out.println(readedCount + " byte 를 읽었습니다.");
				if(readedCount == -1)break;
				fos.write(buffer, 0, readedCount);


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
