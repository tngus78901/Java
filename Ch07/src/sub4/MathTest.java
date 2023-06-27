package sub4;
/*
 * Date : 26th,June
 * Name : Justina
 * Content : to practice Java Math class
 */
public class MathTest {
	
	//Math math = new Math();  //math는 객체생성을 할 수 없다
	
	
	public static void main(String[] args) {
		
		
		//기본 메서드
		System.out.println("절대값 : " + Math.abs(-5));
		System.out.println("제곱근 : " + Math.sqrt(9));  //squareloot
		System.out.println("올림값 : " + Math.ceil(1.2));  //2
		System.out.println("올림값 : " + Math.ceil(1.8));  //2
		System.out.println("내림값 : " + Math.floor(1.2)); //1
		System.out.println("내림값 : " + Math.floor(1.8)); //1
		System.out.println("반올림 : " + Math.round(1.2)); //1
		System.out.println("반올림 : " + Math.round(1.8)); //2
		
		//random
		double num1 = Math.random();
		System.out.println("num1 : " + num1);  //0~1사이의 실수를 구하는 것 
		
		double num2 = num1 * 10;
		System.out.println("num2  : " + num2); //0~10사이의 실수 (46곱하면 로또번호구할수있음)
		
		double num3 = Math.ceil(num2);
		System.out.println("num3 : " + num3); //1~10까지 사이의 정수
		
		//1~45 사이
		double rand = (int) Math.ceil(Math.random() * 45);
		System.out.println("rand : " + rand);
		
		
	}
	

	}


