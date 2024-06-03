package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import test.util.DBConnector;

public class MainClass06 {
	public static void main(String[] args) {
		// 추가할 회원의 정보라고 가정, 번호는 시퀀스로 넣기(member_seq.NEXTVAL)
		String name = "주뎅이";
		String addr	= "봉천동";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			// 미리 준비한 유틸클래스를 이용해서 Connection 객체 얻어오기
			conn = new DBConnector().getConn();
			String sql = "insert into member_seq"
					+ " (num, name, addr)"
					+ " values(member_seq.nextval, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			System.out.println("시퀸스를 추가했습니다");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
