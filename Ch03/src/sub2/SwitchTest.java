package sub2;

import java.util.Scanner;

 
/* 날짜 : 2023.06.13
* 이름 : 김수현
* 내용 :Java 조건문 Switch 연습하기
*/
public class SwitchTest {
	
	public static void main(String[] args) {
		
		System.out.print("숫자 입력 : ");
		
		
		//사용자 입력 입력하는 것 scanner
		Scanner scan = new Scanner(System.in); //Scanner는 라이브러리에서 가져와야
		int number =scan.nextInt();
		
		System.out.println("입력한 숫자 : " +number);
		
		switch(number % 2) {
		
		case 0 :
			System.out.println("number는 짝수");
			break;
		case 1:
			System.out.println("number는 홀수");
			break;
	}
	}}
	


