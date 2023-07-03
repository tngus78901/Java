package test01;

/* name :Justina
 * date :14th,June,2023
 * content : Java 피보나치 수열Fibonacci sequence practice test
 */
public class Test10 {
	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 1;
		int n3;
		
		System.out.println(n1 + " , ");
		System.out.println(n2+" , ");
		
		for(int i=1; i<=10; i++) {
			
			n3 = n1 + n2;
			
			System.out.println(n3 + " , ");
			
			n1 = n2;
			n2 = n3;
		}
		
		
	}
}
