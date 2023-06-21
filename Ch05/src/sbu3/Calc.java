package sbu3;


/* Date : 20.06.23
 * Name : Justina
 * Content : 싱글톤 객체와 인스턴스 객체 실습
 * 
 */

public class Calc {
	
	//싱글톤 객체 클래스내에서 자신을 객체로 생성하는 것
	private static Calc instance = new Calc();
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {}
	
	
	
	
	
	public int plus(int x, int y) {
		return x + y;
	}
	
	
	public int minus(int x, int y ) {
		return x - y;
	}
	public int multi(int x, int y ) {
		return x * y;
		
	}
	public int div(int x, int y ) {
		return x /y;
	}

	

}
