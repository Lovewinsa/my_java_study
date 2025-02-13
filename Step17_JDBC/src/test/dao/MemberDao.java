package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnector;

/*
 * 	회원 정보를 insert, update, delete, select 할 수 있는 기능을 가진 객체를 생성할 클래스 설계
 * 
 * 	- 이런 기능을 가진 객체를 Data Access Object라고 한다.
 */
public class MemberDao {
	// 매개변수에 전달된 MemberDto 객체에 담긴 회원 한 명의 정보를 DB에 저장하는 메소드
	public boolean insert(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 변화된 row 갯수를 저장할 변수를 0을 대입해 미리 만들어 둔다
		int rowCount = 0;
		try {
			conn = new DBConnector().getConn();
			// 실행할 sql문
			String sql = "insert into member"
					+ " (num, name, addr)"
					+ " values(member_seq.NEXTVAL, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			// sql문이 미완성이라면 여기서 값 바인딩
			
			
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			// sql문 실행하고 변화된 row의 개수를 변수에 담는다
			rowCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 변화된 rowCount를 이용해서 작업의 성공여부를 리턴해준다.
		if (rowCount > 0) {
			return true;
		} else {
			return false;
		}
	}
	// 매개변수에 전달된 번호에 해당하는 회원 한 명의 정보를 삭제하는 메소드
	public boolean delete(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 변화된 row 갯수를 저장할 변수를 0을 대입해 미리 만들어 둔다
		int rowCount = 0;
		try {
			conn = new DBConnector().getConn();
			// 실행할 sql문
			String sql = "delete from member"
					+ " where num=?";
			pstmt = conn.prepareStatement(sql);
			// sql문이 미완성이라면 여기서 값 바인딩
			pstmt.setInt(1, num);
			// sql문 실행하고 변화된 row의 개수를 변수에 담는다
			
			rowCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 변화된 rowCount를 이용해서 작업의 성공여부를 리턴해준다.
		if (rowCount > 0) {
			return true;
		} else {
			return false;
		}
	}
	// 매개변수에 전달된 MemberDto 객체에 담긴 회원 한 명의 정보를 수정하는 메소드
	public boolean update(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		// 변화된 row 갯수를 저장할 변수를 0을 대입해 미리 만들어 둔다
		int rowCount = 0;
		try {
			conn = new DBConnector().getConn();
			// 실행할 sql문
			String sql = "update member"
					+ " set name=?, addr=?"
					+ " where num=?";
			pstmt = conn.prepareStatement(sql);
			// sql문이 미완성이라면 여기서 값 바인딩
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			
			// sql문 실행하고 변화된 row의 개수를 변수에 담는다
			rowCount = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 변화된 rowCount를 이용해서 작업의 성공여부를 리턴해준다.
		if (rowCount > 0) {
			return true;
		} else {
			return false;
		}
	}
	// 전체 회원목록을 리턴하는 메소드
	public List<MemberDto> getList(){
		// 리턴해 줄 List 객체 생성
		List<MemberDto> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = new DBConnector().getConn();
			// 실행할 select문 구성하기, selection 인자가 있다면 미완성도 가능
			String sql = "select num, name, addr"
					+ " from member"
					+ " order by num ASC";
			pstmt = conn.prepareStatement(sql);
			// select문이 미완성이라면 여기서 완성

			// select문 실행하고 결과를 ResultSet 객체로 받아온다
			rs = pstmt.executeQuery();
			// select된 row가 여러개라면 반복문 돌면서 추출
			while (rs.next()) {
				// MemberDto 객체를 생성해서
				MemberDto dto = new MemberDto();
				// Resultset에 담긴 내용을 읽어와 setter 메소드를 활용해 dto에 넣기
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// 회원정보(MemberDto)가 누적된 List의 참조값을 리턴해 준다.
		return list;
	}
	// 매개변수에 전달된 번호에 해당하는 회원 한 명의 정보를 리턴하는 메소드
	public MemberDto getData(int num) {
		// MemberDto 객체의 참조값을 담을 변수 미리 만들기
		MemberDto dto = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = new DBConnector().getConn();
			// 실행할 select문 구성하기, selection 인자가 있다면 미완성도 가능
			String sql = "select num, name, addr as my_addr"
					+ " from member"
					+ " where num=?";
			pstmt = conn.prepareStatement(sql);
			// select문이 미완성이라면 여기서 완성
			pstmt.setInt(1, num);
			// select문 실행하고 결과를 ResultSet 객체로 받아온다
			rs = pstmt.executeQuery();
			// 만일 select된 row가 있다면
			if (rs.next()) {
				// MemberDto 객체를 생성해서
				dto = new MemberDto();
				// 회원정보를 담는다
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("my_addr"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} //finally
		return dto;
	}//method
}//class
