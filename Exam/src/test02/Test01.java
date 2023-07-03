package test2;

/*
 * Date : 15th.June.2023
 * Name : Justina
 * Content : 자바 배열 문자 출력 연습문제
 */


public class Test01 {
	public static void main(String[] args) {
		
		char str[] = {'I', ' ' , 'L', 'O','V','E',' ', 'Y','O','U'};
		int row,col;
		
		for(row = 1; row<10; row++) {
			
		for(col = 0; col<=row; col++) {
			
			System.out.print(str[col]);
		}
		
		System.out.println("\n");
		}
	}

}



