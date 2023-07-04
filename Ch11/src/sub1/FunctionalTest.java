package sub1;



/*
 * Date : 4th,July
 * Name : Justina
 * Content : 함수형 프로그래밍 연습하기
 * 
 * 함수형 프로그래밍 
 * - 프로그래밍 단위를 함수 단위로 실행하는 프로그래밍 패러다임
 * - 함수형 프로그래밍의 함수는 람다식으로 표현 
 */
interface A {
	public void method();

}


class B implements A{

	@Override
	public void method() {
		System.out.println("method 실행...");
	}
	
}


public class FunctionalTest {
	public static void main(String[] args) {

		
		//객체지향 방식 .에ㅐ기 알번적이고 전통적 보편적
		A a1 = new B();
		a1.method();
		
		
		
			// 익명클래스(인터페이스를 바로 객체로 생성)
			A a2	= new A() {  //A는 인터페이스 이 덩어리 };까지가 객체다
			
			@Override
			public void method() {
				System.out.println("method 실행....");
				
			}
		};
		
		a2.method();
		
		
		//함수형 프로그래밍 방식(람다식)
		A a3 = () -> {System.out.println("method 실행...");};  //-> 람다식 기호 ()이 자리에 매개변수 선언  {}함수의 본문.내용
		a3.method();
	}

}
