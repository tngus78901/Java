package sub2;

import java.util.Scanner;

/*
 * Date : 26th,June
 * Name : Justina
 * Content : Java Throws 실습하기
 */
public class ThrowsTest {
	
	
	
	public static void main(String[] args) throws Exception {
		try {
			myMethod1(10);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료...");
		
	}
	
	public static void myMethod1 (int n1) throws Exception {
		myMethod2(n1);
	}
	public static void myMethod2(int n1) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		int n2 = scan.nextInt();
		
		int result = n1/n2;
		
		System.out.println("result : " + result);
		
	}
	
	
}

