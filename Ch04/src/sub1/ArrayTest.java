package sub1;

/* name :Justina
 * date :14th,June,2023
 * content : Java 삼항연산자ternary operator practice test
 */

public class ArrayTest {
	public static void main(String[] args) {
		
		//배열 (자료구조는 데이터들을 묶어놓은 것)
		int[] arr1 = {1,2,3,4,5};  //[]배열기호.keyword int []arr1,int arr1[]도 가능
			//index  0 1  2 3 4
		
		char[] arr2 = {'A','B', 'C'}; //배열은 같은 타입의 데이터들만 묶을 수 있다.
		
		String[] arr3 = {"서울","대전","대구","부산","광주"};
		//원소 출력
		System.out.println("arr[0] : " + arr1[0]);
		System.out.println("arr[2] : " + arr1[2]);
		System.out.println("arr[3] : " + arr1[3]);
		
		System.out.println("arr2[2] :" +arr2[2]);
		
		System.out.println("arr3[3] :" +arr3[3]);
		
		//배열 길이는 원소갯수 원소갯수는 길이 size
		System.out.println("arr1 길이 : " + arr1.length);
		System.out.println("arr2 길이 : " + arr2.length);
		System.out.println("arr3 길이 : " + arr3.length);
		
		
		//배열 반복문
		
		for(int i=0; i<arr1.length ; i++) {
			
			System.out.print(arr1[i] + " , ");
			
		}
		System.out.println();  //이렇게만 해도 개행처리가능
		
		for(char c : arr2) {
			System.out.print(c + " ");
			
		}
		System.out.println();  //개행
		
		for(String city :arr3) {
			System.out.println(city + " ");
		}
		
		
		//1차원 배열 1차원은 선 직선. 선형
		int [] scores = {80, 60, 78, 62, 92};  //배열 이름은 복수형 마지막에 s를 붙여야 한다. socre's' 
		int total = 0;
		
		for(int score : scores)  {
			total += score;
		}
		System.out.println("scores 합 : " + total);
		
		//2차원 배열 2차원 은x축 y축 .평면,면
		
		int[][] arr2d = {{1,2,3,4}, //3은0.2 6은 1.3
				    	{5,6,7,8},
				    	{9,10,11,12}};  //2차원 배열 선언은 이렇게 행.열 번호
		
		for(int a=0; a<3; a++) {
			
			for(int b=0;  b<4; b++) {
				System.out.println("arr2d["+a+"]["+b+"]) : " + arr2d[a][b]) ;
			}
		}
		
		
		//3차원 배열 z축까지 나옴 .공간이다 육면체 생각하면 된다
		int[][][] arr3d = {{{1,2,3},
							{4,5,6},
							{7,8,9}},
							{{10,11,12},
							{13,14,15},
							{16,17,18}},
							{{19,20,21},
							{22,23,24},
							{25,26,27}}};
		
		
		for(int a=0; a<3; a++) {
			for(int b=0; b<3; b++ ) {
				for(int c=0; c<3; c++ ) {
					System.out.printf("arr3d[%d][%d][%d] : %d\n",a,b,c,arr3d[a][b][c]);
				}
			}
		}
		
																							
		
	}

}
