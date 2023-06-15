package test1;
import java.util.Scanner;

/* name :Justina
 * date :14th,June,2023
 * content : Java 삼항연산자ternary operator practice test
 */

public class Test06 {
		public static void main(String[] args) {
			
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("x값 입력 : ");
			int x = sc.nextInt();
			
			String result = x > y ?"x가 더 큽니다." : "y가 더 큽니다.";  //result는 변수 뜬금없이 못나와서 선언해야한다 앞에 뭐를
																			//""니까 문자열 그래서 String
			System.out.println(result);
		}

}
