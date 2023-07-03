package test2;
import java.util.Scanner;

/*
 * 
 * Date : 15th.June.2023
 * Name : Justina
 * Content : 자바 메서드 연습문제
 * 
 * 
 */





public class Test06 {
	public static void   intro() {
		System.out.println("******* START *******");
		System.out.println("두개의 정수를 입력");
	}
	
	public static  int  input(Scanner sc,String  name    ) { //sc뒤는 매개변수자리 
		System.out.println("변수 " + name+ " 값 입력 :");
		int input = sc.nextInt();
		return input;
	}
	
	public static void result(int val) {
		System.out.println("덧셈 결과  :" +val);
		System.out.println();
	}
	
	public static int  add(int x, int y) {
		return x + y ;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		intro();
		
		int a = input(sc, "a");
		int b = input(sc, "b");
		
		int output = add(a, b);
		result(output);
		
		sc.close();
	}

}
