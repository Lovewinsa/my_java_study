package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 	C:\\Users\\user\\playground\\myFolder\\memo3.txt 파일에 저장된 문자열을 읽어와서
 * 	콘솔창에 출력하는 예제333
 */
public class MainClass10 {
	public static void main(String[] args) {
		// 문자열을 누적시킨 다음 한번에 문자열을 얻어낼 수 있는 객체 생성
		var sb = new StringBuilder();
		
		// memo.txt 파일에 access할 수 있는 File객체 생성
		File f = new File("C:/Users/user/playground/myFolder/memo3.txt");
		// 파일로부터 문자열을 읽어들일 수 있는 객체 생성
		try {
			var fr = new FileReader(f);
			var br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				// 읽어낸 문자열을 StringBuilder 객체에 누적시키기
				sb.append(line);
				sb.append("\r\n");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// StringBuilder 객체에 누적된 문자열 한번에 출력
		String result = sb.toString();
		System.out.println(result);
	}
}
