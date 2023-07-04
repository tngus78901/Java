package sub2;
/*
 * Date : 4th,July
 * Name : Justina
 * Content : Java 람다식 실습하기
 * 
 * 람다식
 * - 함수형 프로그래밍을 지원하는 구문
 * - 인터페이스 타입으로 @FunctionalInterface 선언해서 람다식 정의
 */

@FunctionalInterface  //별 기능은 없고 우리가 람다식쓸꺼다 쓰는거  람다식이 있어서 인터페이스를 바로 구현할 수 있는거다

interface A {
	public int method(int a, int b);
	
}
@FunctionalInterface
interface B {
	public void method(double a); //리턴없고 매개변수있다
	
}
@FunctionalInterface
interface C {
	public boolean method();  //매개변수 없고 리턴있다
	
	
}
@FunctionalInterface
interface D {
	public void method();  //둘다없다
	
	
}

public class LambdaTest {
	public static void main(String[] args) {
		
		
		//람다식 정의 
		A a1 = (int a,int b) -> {
			
			int c = a +b;
			return c;
		};
		
		A a2 = (a,b) -> {return a+b;};
		A a3 = (a,b) -> a+b;
		
		int r1 = a1.method(1,2);
		int r2 = a2.method(2,3);
		int r3 = a3.method(3,4);
		
		System.out.println("r1 :"  + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		
		
		
		B b1 = (double a) -> { System.out.println("a : " + a);};
		B b2 = (a) -> System.out.println("a : " + a);
		B b3 = System.out::println;
	
		
		b1.method(1.0);
		b2.method(2.1);
		b3.method(3.4);
		
		
		C c1 = () -> {return true;};
		C c2 = () -> false;
		
		System.out.println("c1 : " + c1.method());
		System.out.println("c2 : " + c2.method());
		
		D d1 = () -> {System.out.println("d1실행...");};
		D d2 = () -> {System.out.println("d2실행...");};
		
		d1.method();
		d2.method();
		
		
		//람다식 활용
		Runnable run = () -> {
			
			for(int i=1; i<=10; i++) {
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("서브 스레드 실행 중...");
				
			}
		};
		
		Thread thread = new Thread(run);
		thread.start();
		
		for(int i=1; i<=10; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("메인 스레드 실행 중...");
			
		}
		
		System.out.println("프로그램 종료...");
		
		
	}

}
