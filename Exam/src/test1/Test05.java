package test1;
import java.util.Scanner;

/* name :Justina
 * date :14th,June,2023
 * content : Java conditional statement practice test
 */
public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		
		System.out.println("입력한 점수는 " + score +"입니다.");
		
		switch(score / 10) {
			
		case 10:
		case 9:  //프로그래밍에서는 나누기하면 정수부만 나온다 답이 9.2면 9만 
			System.out.println("A입니다.");
			break;
		case 8 :
			System.out.println("B입니다.");
			break;
		case 7:
			System.out.println("C입니다.");
			break;
		case 6:
			System.out.println("D입니다.");
			break;
		default:
			System.out.println("F입니다.");
			break;
			
				
	
		}
		
		sc.close();
	}

}
