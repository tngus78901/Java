package sub4;


/*Date : 15th.June.2023
* Name : Justina
* Content :Java Method Overloading practice
*/
public class MethodOverloadTest {

	public static void main(String[] args) {
		
		int r1= plus(1);
		int r2 = plus(1,2);
		double r3= plus(1.1 , 2.3);
		String r4	= plus("Hello" , "World" );
		
		
		System.out.println("r1 :" +r1);
		System.out.println("r2 :" +r2);
		System.out.println("r3 :" +r3);
		System.out.println("r4 :" +r4);
	}
	
	//오버로딩 메서드 정의 (클래스이름은 대문자로 시작 메서드는 소문자로 시작 무조건!!)
	//이렇게 이름이 다른 함수를 오버로드 로딩 이라한다
	public static int   plus(int a) {
		return a + a;
}
	public static int plus(int a,int b) {
		return a + b;
	}
	
	public static double plus(double a,double b) {
		return a + b;
	}
	
	public static String plus(String a ,String b) { //문자열더하기 문자열은 문자열
		return a + b;
	
	}
	}
		
	