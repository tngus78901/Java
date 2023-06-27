package sub5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//impport 선언은 코딩안한다 date처럼 클래스 택하면 자동으로 된다
/*
 * Date : 27th,June
 * Name : Justina
 * Content : to practice Date class
 */
public class DateTest {
	
	public static void main(String[] args) {
		
		Date date = new Date();//java.util클래스
		System.out.println("date : " + date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //MM month /mm 분
		String result = sdf.format(date);
		
		System.out.println("result : " + result);
		
		//Calendar 클래스
		Calendar cal = Calendar.getInstance() ;  //싱글톤은 getter로 객체를 가져오는 것
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; //1월이 0 
		int d	  = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		
		System.out.printf("%d-%d-%d %d:%d:%d", year, month, d, hour, min, sec);
	
	}
	
	

}
