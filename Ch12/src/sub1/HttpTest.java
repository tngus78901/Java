package sub1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * Date : 6th,July
 * Name : Justina
 * Content : HTTP 통신 실습하기
 */
public class HttpTest {
	
	public static void main(String[] args) {
		
		
		FileOutputStream fos = null;
		BufferedReader br = null;    //reader 문자스트림 buffer를 장착함
		
				
		try {
			URL url = new URL("http://google.com");
			
			
				br =new BufferedReader(new InputStreamReader(url.openStream()));
				fos = new FileOutputStream("./Result.txt");
				
				String line = null;
				
				while((line = br.readLine()) != null )	{  //조건이 null 이면 탈출!
					
					System.out.println(line);
					fos.write(line.getBytes());
					
				}
				
				br.close();
				fos.close();
				
					
				
		} catch (MalformedURLException e) {					//MalformedURLException e 잘못된 url
			e.printStackTrace();		
		} catch (IOException e) {				e.printStackTrace();		
		
		System.out.println("프로그램 종료...");
		
	}
	}
}

	