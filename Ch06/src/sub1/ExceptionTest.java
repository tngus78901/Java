package sub1;
/*
 * Date : 26th,June
 * Name : Justina
 * Content : 예외처리 실습하기
 * 
 * 예외처리(Exception)
 * - 예외는 프로그램 실행중에 발생하는 모든 에러(Error)
 * - 실행 중(Runtime) 발생하는 예외와 컴파일(CompileTime)에 발생하는 예외처리
 * - 메서드 내부에 발생하는 예외를 호출한 쪽으로 throws
 * - 사용자가 생성한 예외를 throw
 * 
 */

//throw throws 잘 구분하자!!!

public class ExceptionTest {
	public static void main(String[] args) {
		
		/////////////////////////
		//실행 예외
		/////////////////////////
		
		//예외상황 1 : 어떤 수를 0으로 나눌 때
		int num1 = 1;
		int num2 = 0;
		int rs1 = 0;
		int rs2 = 0;
		int rs3 = 0;
		int rs4 = 0;
		
		
		try {
			//예외가 발생할 가능성이 있는 코드를 작성해야한다
			rs1 = num1+ num2;  //여기서 스파크가 터질 수 있다	
			rs2 = num1- num2;  //여기서 스파크가 터질 수 있다	
			rs3 = num1* num2;  //여기서 스파크가 터질 수 있다	
			rs4 = num1/ num2;  //여기서 스파크가 터질 수 있다	
			
		}catch(ArithmeticException e) { //로그출력을 위한 것.catch 나중에 언제 어떤 에러가 일어났는지 보려고
			//어떤 수를 0으로 나눌 때 
			e.printStackTrace(); //예외 내용 출력
		}
		
	
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		System.out.println("rs3 : " + rs3);
		System.out.println("rs4 : " + rs4);
		
		
		//예외상황2 : 배열의 인덱스 범위를 벗어났을 때
		
		int[] arr = {1,2,3,4,5};
		
		try {
			
		
		for(int i=0 ; i<6 ; i++ ) {
			System.out.println("arr["+i+"] : " + arr[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			//배열의 인데스 범위를 벗어났으 ㄹ때
			e.printStackTrace();
		}
		//정상종료를 위해 계속 진행 시키는 것
		
		//예외상황 3
		Animal ani = null;  //ani는 빈껍데기 ,없다!! animal 은 참조변수(어떤 값을 갖고 있어야) 
		//참조변수는 객체번호. 객체를 참조하고 있어야 한다
		
		
		try {
		ani.move();
		ani.hunt();
		}catch (NullPointerException e) {
			//객체 생성없이 참조(Null 포인터 에러)
			e.printStackTrace();
		}
		
		//예외상황 4
		Animal a1 = new Tiger();  //업캐스팅
		Animal a2 = new Eagle();	//업캐스팅
		Animal a3 = new Shark();	//업캐스팅	
		
		try {
			
		
		Eagle eagle = (Eagle) a1; //다운캐스팅
		Shark shark = (Shark) a2; //다운캐스팅
		Tiger tiger = (Tiger) a3; //다운캐스팅
		}catch (ClassCastException e) {
			//잘못된 캐스팅
			e.printStackTrace();
			
		}
		
		//////////////////////////////
		//일반 예외
		//////////////////////////////
		
		try {
			Class animal = Class.forName("sub1.Animal");
		} catch (ClassNotFoundException e) {
			// 찾을 수 없는 클래스 선언
			e.printStackTrace();
		}finally {
			//예외처리 발생유무에 상관없이 마지막에 항상 실행되는 코드
			System.gc();  //메모리 정리하는 것 garbage collecter
			
			System.out.println("finally 실행");
		}
		//빨간줄뜨면 예외처리해줘야하는 일반예외
		
		System.out.println("프로그램 정상 종료...");
		
		
		
	}

}
