package test.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 	C:\\Users\\user\\playground\\myFolder\\memo3.txt 파일에 저장된 문자열을 읽어와서
 * 	콘솔창에 출력하는 예제
 */
public class MainClass08 {
	public static void main(String[] args) {
		// memo.txt 파일에 access할 수 있는 File객체 생성
		File f = new File("C:/Users/user/playground/myFolder/memo3.txt");
		// 파일로부터 문자열을 읽어들일 수 있는 객체 생성
		try {
			var fr = new FileReader(f);
			while(true) {
				// 문자의 코드값을 읽어들인다
				int code = fr.read();
				if(code == -1) {
					break;
				}
				// 코드를 char type으로 변환
				char ch = (char)code;
				System.out.print(ch);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
