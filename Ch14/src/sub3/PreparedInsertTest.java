package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * Date : 11th,July
 * Name : Justina
 * Content : to practice PreparedStatement 
 */

public class PreparedInsertTest {
	public static void main(String[] args) {
		
		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL실행 객체 생성
			String sql = "INSERT INTO `User2` VALUES  (?, ?, ?, ?)"; //괄호안에 있는것 쿼리 파라미터 -값을 맵핑시켜줘야한다 
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "j101");
			psmt.setString(2, "홍길동");
			psmt.setString(3, "010-1234-4567");
			psmt.setInt(4, 23);
			
			
			// 4단계 - sql실행
			psmt.executeUpdate();
			
			// 5단계 - 결과처리(select문일 경우에만 )
			// 6단계 - 연결해제
			psmt.close();
			conn.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Insert 완료");
	}

}
