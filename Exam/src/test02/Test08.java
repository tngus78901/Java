package test02;


/*Date : 15th.June.2023
* Name : Justina
* Content : 자바 팩토리얼 재귀 메서드 연습문제
* 
*/
public class Test08 {
	public static void main(String[] args) {
		
		System.out.println("3! = " + factorial(3));
		System.out.println("4! = " + factorial(4));
		System.out.println("5! = " + factorial(5));
	}
	
	public static int factorial(int n) {      //
		
		if (n <=1 ) {
			
			return 1;
		}
		
		return n * factorial(n-1);    //여기서 여기까지 반복문 resursive 재귀함수 현대에서는 재귀는 권장하지않는다
	}
}
