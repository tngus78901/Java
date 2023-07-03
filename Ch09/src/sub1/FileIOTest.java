package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Date : 29th,June
 * Name : Justina
 * Content : java 파일 입출력 스트림 실습하기
 * 
 *  입출력 스트림(Stream)
 * - 프로그램은 데이터 처리와 함께 데이터 저장을 위해 파일 입출력 수행
 * - 피일 입출력을 위해 스트림(데이터 연결 통로) 사용
 * 아스키코드 : 서구권 |유니코트 : 서구,아시아권  
 */

public class FileIOTest {  //IO input output
	public static void main(String[] args) {   //파일을 읽어들이려면 계속 반복해서 넣어야한다
		
		
		String path = "C:\\Users\\Java\\Desktop\\Sample1.txt";
		String target = "C:\\Users\\Java\\Desktop\\Sample2.txt";
		
		try {
			//스트림 생성(연결)
			FileInputStream fis = new FileInputStream(path);
			FileOutputStream fos = new FileOutputStream(target);
			
			
			
			while(true) {  //파일을 읽어들일 때 까지 반복한다는 뜻 
				
				//파일 읽기
				int data = fis.read();  //byte도 정수타입?
				
				
				if(data == -1 ) {
					//파일을 모두 읽었을 때 종료
					break;
				}
				//숫자를 문자로 변환
				 char ch = (char) data;
				 System.out.println(ch);
				 
				 
				 //파일쓰기
				 fos.write(data);
				 
			}//파일을 다 읽었다 
			//스트림 해제
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		System.out.println("프로그램 종료...");
	}//main end

}
