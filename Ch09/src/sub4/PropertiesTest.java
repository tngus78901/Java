package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * Date : 29th,June
 * Name : Justina
 * Content : java Properties 실습하기 //Java에서 많이 쓰인다
 * 
 * 프로퍼티(Properties)
 * - 문자열 데이터만 취급하는 Key-Value 자료구조 클래스
 * - 프로그램의 환경설정값을 저장할 때 많이 사용
 * - 입출력스트림으로 데이터 입출력하는 자료구조 클래스
 */

public class PropertiesTest {
	
	public static void main(String[] args) {
	
				//프로퍼티 생성
				Properties prop = new Properties();
				prop.setProperty("A", "Apple");
				prop.setProperty("B", "Bnana");
				prop.setProperty("C", "Cherry");
				
				//System.out.println(prop);
				
				String path = "C:\\Users\\Java\\Desktop\\Fruit.properties";
				
				
					
					try {
						
						FileOutputStream fos = new FileOutputStream(path);
						prop.store(fos, null);
						fos.close();
					
					
					
					} catch (FileNotFoundException e) {
						e.printStackTrace();	
					} catch (IOException e) {
						e.printStackTrace();
					}
		
					//프로퍼티 파일 읽기
					String target = "C:\\Users\\Java\\Desktop\\Cities.properties";
					
					Properties propCities = new Properties();
					
	}
	}





