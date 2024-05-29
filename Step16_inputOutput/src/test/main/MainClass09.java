package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 	C:\\Users\\user\\playground\\myFolder\\memo3.txt 파일에 저장된 문자열을 읽어와서
 * 	콘솔창에 출력하는 예제22
 */
public class MainClass09 {
	public static void main(String[] args) {
		// memo.txt 파일에 access할 수 있는 File객체 생성
		File f = new File("C:/Users/user/playground/myFolder/memo3.txt");
		// 파일로부터 문자열을 읽어들일 수 있는 객체 생성
		try {
			var fr = new FileReader(f);
			var br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				System.out.println(line);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
