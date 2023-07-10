package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;

/*
 * Date : 10th,July
 * Name : Justina
 * Content : to practice Update
 */


public class SelectTest {   //결과는 받는 쿼리문
	public static void main(String[] args) {
		
		
		//DB 정보
		String host = "jdbc:mysql://localhost:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		
		try {
			//1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbd.Driver");
			
			//2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			//3단계 - SQL실행 객체 생성
			Statement stmt = conn.createStatement();
			
			//4단계 - SQL 실행
			String sql = "SELET * FROM `User1`";
			ResultSet rs = stmt.executeQuery(sql);
			
			//5단계 - 결과처리(select 경우) 
			while(rs.next()) {
				
			String uid = rs.getString(1);
			String name = rs.getString(2);
			String hp = rs.getString(3);
			int age = rs.getInt(4);  //int지만 문자열로 바궈서 가져온 것, 원래 타임으로 가려오는게 좋다
			
			System.out.printf("%s,%s,%s,%d\n", uid, name, hp, age);
			}
			
			//6단계 - 연결해제
			rs.close();
			stmt.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Select 완료...");
	}
}
