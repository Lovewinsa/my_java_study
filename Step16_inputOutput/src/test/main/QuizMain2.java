package test.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class QuizMain2 {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		OutputStream os = ps;
		var osw = new OutputStreamWriter(os);
		var bw = new BufferedWriter(osw);
		File f = new File("C:/Users/user/playground/myFolder/memo2.txt");
		try {
			if(!f.exists()) {
				f.createNewFile();
				System.out.println("memo2.txt 파일을 만들었습니다.");
			}
			FileWriter fw = new FileWriter(f, true);
			fw.write(99);
			fw.write("\n");
			fw.write("김구라");
			fw.write("\n");
			fw.flush();
			fw.close();
			System.out.println("memo2.txt 파일에 문자열 기록");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		 
	}
}
