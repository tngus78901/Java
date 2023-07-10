package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * Date : 10th,July
 * Name : Justina
 * Content : to practice Update
 */

public class UpdateTest {
	public static void main(String[] args) {
		
		//DB정보
		String host = "jdbc://localhost:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		
		try {
			// 1단계 - JDBD 드라이버로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// 4단계 - SQL 실행
			String sql = "UPDATE `User1` SET " ;
				   sql += "`hp`='010-1234-1111', " ;
				   sql += "`age`= 25 " ;	
				   sql += "WHERE `uid`= 'j101'" ;
					
				  stmt.executeUpdate(sql); 
			
			// 5단계 - 결과처리(select 경우)
			// 6단계 - 연결해제
			stmt.close();
			conn.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Update 완료...");
	}

}
