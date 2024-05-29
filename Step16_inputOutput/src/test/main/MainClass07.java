package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.spi.FileSystemProvider;

public class MainClass07 {
	public static void main(String[] args) {
		String msg = "안녕하세요";
		File f = new File("C:\\Users\\user\\playground\\myFolder\\memo3.txt");
			
			try {
				if(!f.exists()) {
					f.createNewFile();
					System.out.println("memo3.txt 파일을 만들었습니다");
				}
				// 파일에 문자열을 출력할 객체 생성
				var fw = new FileWriter(f ,true);
						// true => append mode(추가모드)	++default는 덮어쓰기 모드
				fw.write(msg);
				fw.write("\r\n");
				fw.write(49);
				fw.write("\r\n");
				
				fw.flush();	// 실제 출력
				fw.close();	// 마무리
				System.out.println("memo3.txt 파일에 문자열을 기록했습니다.");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
