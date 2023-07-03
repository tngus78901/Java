package test01;

/* name :Justina
 * date :14th,June,2023
 * content : Java loop practice test
 */

public class Test08 {
	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i=0; i<n ; i ++) {
			
			for(int j= n-1; j>i  ;  j--) {
				System.out.println("");
			}
			
			for(int j=0; j<2*i+1 ;  j++ ) {
				System.out.println(" * ");
			}
			
			System.out.println("\n");
		}
	}

}//디버깅해보기
