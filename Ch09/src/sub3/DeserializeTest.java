package sub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * Date : 29th,June
 * Name : Justina
 * Content : java 직렬화 실습하기
 * 
 * 객체 직렬화, 역직렬화
 * - 직렬화(Serialize) 자바 객체를 스트림을 통해 외부 파일로 생성하는 작업
 * - 역직렬화(Deserialize)는 외부 객체파일을 다시 자바 객체(인스턴스)로 생성하는 직업
 * - 스트림으로 전송될 객체는 Serializable 인터페이스 구현
 * 
 */

public class DeserializeTest {

	public static void main(String[] args) {
			
			String path = "C:\\Users\\Java\\Desktop\\Apple.dat";
			
			
			 	
				try {
					//스트림생성
					FileInputStream fis = new FileInputStream(path);
				 	ObjectInputStream ois = new ObjectInputStream(fis);
				 	
				 	//역직렬화
				 	Apple apple = (Apple) ois.readObject();
				 	apple.show();
				 	
				 	
				 	//스트림해제
				 	ois.close();
				 	fis.close();
				
				
				
				
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			 	
			
				System.out.println("프로그램 종료...");
				
	}
}
