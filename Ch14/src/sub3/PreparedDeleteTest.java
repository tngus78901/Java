package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * Date : 11th,July
 * Name : Justina
 * Content : to practice PreparedStatement 
 */
public class PreparedDeleteTest {
	public static void main(String[] args) {
		
		
		// DB 정보
		String host = "jdbc.mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL실행 객체 생성
		Statement stmt = conn.createStatement();
		
			// 4단계 - SQL 실행
		String sql = "DELETE FROM `User2` WHERE `uid`= ?";  //?가 아니고 쿼리파라미터
				
			// 5단계 - 결과처리
			// 6단계 - 연결해체	
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Delete 완료....");
	}	

}
