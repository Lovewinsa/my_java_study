package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainClass05 {
	public static void main(String[] args) {
		// 추가할 회원의 정보라고 가정, 번호는 시퀀스로 넣기(member_seq.NEXTVAL)
		String name = "원숭이";
		String addr	= "동물원";
		
		Connection conn = null;
		try {
			// 오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 접속할 DB의 정보 @IP주소:port:번호:db이름
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// 계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
			conn = DriverManager.getConnection(url, "scott", "tiger");
			
			System.out.println("Oracle DB 접속 성공");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PreparedStatement pstmt = null;
		try {
			String sql = "insert into member_seq"
					+ " (num, name, addr)"
					+ " values(member_seq.nextval, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			System.out.println("시퀸스를 추가했습니다");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
