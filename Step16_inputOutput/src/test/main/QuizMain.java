package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class QuizMain {
	public static void main(String[] args) {
		InputStream kdb = System.in;
		var isr = new InputStreamReader(kdb);
		var br = new BufferedReader(isr);
		System.err.println("메모 : ");
		String line = null;
		File f = new File("C:/Users/user/playground/myFolder/memo.txt");
		try {
			if(!f.exists()) {
				f.createNewFile();
				System.out.println("memo.txt 파일을 만들었습니다.");
			}
			line = br.readLine();
			FileWriter fw = new FileWriter(f, true);
			fw.write(line);
			fw.flush();
			fw.close();
			System.out.println("memo.txt 파일에 문자열을 기록했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		 
	}
}
