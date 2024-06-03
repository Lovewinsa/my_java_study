package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainClass02 {
	public static void main(String[] args) {
		int num = 3;
		String name = "원숭이";
		String addr = "동물원";
		// DB 연결객체를 담을 지역변수 만들기
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
		
		// sql문을 대신 실행해줄 객체의 참조값을 담을 지역변수 미리 만들기
		PreparedStatement pstmt = null;
		try {
			// 실행할 미완성의 sql문
			String sql = "insert into member"
					+ " (num, name, addr)"
					+ " values(?, ?, ?)";
			// 미완성의 sql문을 전달하면서 PreparedStatement 객체의 참조값 얻어내기
			pstmt = conn.prepareStatement(sql);
			// PreparedStatement 객체의 메소드를 이용해서 미완성은 sql문을 완성시키기(?에 값 바인딩하기)
			pstmt.setInt(1, num); // 1번째 ?에 숫자 바인딩
			pstmt.setString(2, name); // 2번째 ?에 문자열 바인딩
			pstmt.setString(3, addr); // 3번째 ?에 문자열 바인딩
			// sql문 실행하기
			pstmt.executeUpdate();
			System.out.println("회원정보를 저장했습니다");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
