package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass12 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("C:/Users/user/playground/myFolder/1.jpg");
			fos = new FileOutputStream("C:/Users/user/playground/myFolder/copied.jpg");
			byte[] buffer = new byte[1024];
			
			while(true){
				int readedCount = fis.read(buffer);
				System.out.println(readedCount + " byte 를 읽었습니다.");
				if(readedCount == -1)break;
				fos.write(buffer, 0, readedCount);


			}
			System.out.println("파일을 copy 했습니다.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 예외가 발생하던 안하던 실행이 반드시 보장되는 영역
			try {
				// null체크를 한 후에 마무리 메소드를 호출한다
				if(fos!=null) fos.close();
				if(fis!=null) fis.close();
			} catch(Exception e) {}
		}
		
				
	}
}
