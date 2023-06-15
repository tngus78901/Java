package test1;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

/* 날짜 : 2023.06.13
 * 이름 : 김수현
 * 내용 : Java 기본 입출력 연습문제
 */
public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year;
		int birth;
		String name;
		
		System.out.print("올해 년도 입력 : " );
		year =  sc.nextInt();
			
		System.out.print("태어난 년도 입력 : ");
		birth = sc.nextInt();
				
		System.out.print("이름 입력 : ");
		name = sc.next() ; //이름은 문자열
				
				int age = year - birth;
		
		System.out.printf("%s님 안녕하세요.\n당신은 올해 만 %d세 입니다", name,age);
		//서식문자 포맷문자 %s stirng 문자열이 들어오는 자리 %d  숫자 숫자가 들어오는 자리다 뜻 %f 실수가 들어오는 자리
		
		sc.close();
	}

}
