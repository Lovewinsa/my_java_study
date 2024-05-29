package test.main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass06 {
	public static void main(String[] args) {
		// 콘솔창에 출력할 수 있는 객체의 참조값 얻어내기
		PrintStream ps = System.out;
		// Printstream 객체의 참조값을 부모type 변수에 담기
		OutputStream os = ps;
		//2byte 처리 스트림
		var osw = new OutputStreamWriter(os);
		// OutputStreamWriter를 BufferedWriter의 생성자에 전달해서 객체 생성
		var bw = new BufferedWriter(osw);
		/*
		 * 	운영체제별 개행기호
		 * 	window : \r\n
		 * 	linux, mac os : \n
		 */
		try {
			bw.write("하나");
			bw.newLine();	//	운영체제에 맞는 개행기호를 자동으로 출력해주는 메소드
			bw.write("두울");
			bw.newLine();
			bw.write("세엣");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
