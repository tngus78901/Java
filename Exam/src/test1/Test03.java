package test1;


/* 날짜 : 2023.06.13
 * 이름 : 김수현
 * 내용 : Java 연산자 연습문제
 */
public class Test03 {
	public static void main(String[] args) {
		
		int result1 =0;;
		int num = 0;
		
		
		result1 = num++; //대입이 먼저 일어난다   
		System.out.println("result1 :" +result1);
		
		result = ++num; //+이 앞이라 ++먼저 일어나고 대입된다
		System.out.println("result : " +result);
		
		result = num--;
		System.out.println("result : " + result);
		
		result = --num;
		System.out.println("result : result");
		
		
	}
	

}
