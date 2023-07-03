package sub3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * Date : 29th,June
 * Name : Justina
 * Content : java 객체 스트림 실습하기
 */

public class SerializeTest {

	public static void main(String[] args) {
		
		
		//객체 생성
		Apple apple = new Apple("한국", 3000);
		
		
		String path1 = "C:\\Users\\Java\\Desktop\\Apple.txt";
		
		try {
			//객체 스트림생성
			FileOutputStream fos = new FileOutputStream(path1);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			try {
				oos = new ObjectOutputStream(fos);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//객체 내보내기(내보내기)
			oos.writeObject(apple);
			
			//스트림 해제
			oos.close();
			fos.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println("프로그램 종료...");
	}
}
