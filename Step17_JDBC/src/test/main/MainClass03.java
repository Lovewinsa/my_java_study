package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainClass03 {
	public static void main(String[] args) {
		// 수정할 회원의 정보라고 가정
		int num = 1;	// primarykey
		String name = "에이콘";
		String addr = "강남";
		
		// 위의 정보대로 1번 회원의 이름을 에이콘, 주소를 강남으로 수정하는 프로그래밍 해보기
		Connection conn = null;
		try {
			// 오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
							// ojdbc11.jar에 있는거
			// 접속할 DB의 정보 @IP주소:port:번호:db이름
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// 계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
			conn = DriverManager.getConnection(url, "scott", "tiger");
			// 예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공
			System.out.println("Oracle DB 접속성공");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		PreparedStatement pstmt = null;
		try {
			String sql = "update member"
					+ " set name=?, addr=?"
					+ " where num=?"; 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			pstmt.setInt(3, num);
			pstmt.executeUpdate();
			System.out.println("회원정보를 변경했습니다");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
