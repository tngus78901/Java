package sub2;

/*
 * Date : 15th.June.2023
 * Name : Justina
 * Content :Java Method practice
 */

public class MethodTest {
	
	int num =1; //전역변수
	

	//main method : 프로그램 진입점
	public static void main(String[] args) {
		
		//메서드 호출
		int y1	= f(1);
		
		int y2 = f(2); //2는 인자값 parameter
		
		int y3 =f(3);
		
		System.out.println("y1 :" +y1);
		System.out.println("y2 :" +y2);
		System.out.println("y3 :" +y3);
		
		
		
		//메서드 지역변수와 스택
		int	t1 = sum(1, 10);
		int t2 = sum(1,100);
		
		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);
		
		
	} //main end
	
	//메서드 정의 (밑에꺼는 static이 붙는데 예외적인 상황 보통 없다 void는 반환타입return type)
	public static  int f(int x) { //return되는 변수 y에 맞춰 f앞에 int 들어간다
		
		int y = 2 * x +3;
		return y;
	}
	
	//메서드 정의
	public static int sum(int start, int end) {
					//메서드에서 선언된 변수 지역변수
			int total =0;  //지역변수 :메서드가 종료되면 스택에서 해제되는 변수
			
			for(int k=start; k<=end; k++) {
				
				total += k;
			}  //여기서 for문이 끝난다 k(이블럭의변수) 소멸된다
	
			return total;
	}

	
	
}