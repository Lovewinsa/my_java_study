package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class MainClass04 {
	public static void main(String[] args) {
		// 콘솔창에 출력할 수 있는 객체의 참조값 얻어내기
		PrintStream ps = System.out;
		// Printstream 객체의 참조값을 부모type 변수에 담기
		OutputStream os = ps;
		try {
			os.write(97);
			os.write(98);
			os.write(99);
//			os.write(44032);	한글 처리 불가능(1byte이기 때문에)
			os.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
