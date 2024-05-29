package test.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다");
		// 1byte 처리 스트림
		InputStream kdb = System.in;
		// 2byte 처리 스트림( 65536가지를 표현할 수 있다 )
		var isr = new InputStreamReader(kdb);
		System.out.println("입력 : ");
		try {
			int code = isr.read();
			System.out.println("code : " + code);
			char ch = (char)code;
			System.out.println("char : " + ch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
