package sub1;
/*
 * Date : 29th,June
 * Name : Justina
 * Content : java 파일 입출력 스트림 실습하기
 * 
 * 문자스트림 
 * -아시아권 문자를 위한 문자 전용 스트림
 * - 유니코드 기반으로 UTF-8 인코딩으로 아시아권 문자 인코딩 처리
 *유니코드 변환하는 것 : 인코딩
 * 
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReaderTest {
	
		public static void main(String[] args) {
			
	
			String path = "C:\\Users\\Java\\Desktop\\Sample1.txt";
			String target = "C:\\Users\\Java\\Desktop\\Sample2.txt";
			
			try { 
				//스트림 생성 (연결)
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


