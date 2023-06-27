package sub2;

/*
 * Date : 27th,June
 * Name : Justina
 * Content : to practice Java String class
 */

public class StringTest {
	public static void main(String[] args) {
		
		//문자열(문자+배열) 생성 /문자열은 참조변수다
		String str1 = "Hello";   //리터럴(암시적)
		String str2= new String("Hello"); //명시적
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		//문자열 비교 str1 == str2 이렇게하면 안된다 이건 주소비교다
		if(str1 ==str2) {
			System.out.println("str1, str2 주소가 같다");
			
		}else {
			System.out.println("str1, str2 주소가 다르다.");
		}
		
		if(str1.equals(str2)) {  //문자열은 이렇게 비교하는 거다 오로지 이렇게 비교한다 문자열비교는 equals
			System.out.println("str1,str2 문자열 값이 같다.");
	   	}else {
	   		System.out.println("str1, str2 문자열 값이 다르다.");
	   	
	   	}
		
		//문자열 길이
		String msg = "Hello Korea";//길이가 문자갯수 공백포함 11개 
		
		System.out.println("msg 길이 : " + msg.length());
		
		//문자열 추출
		char c1 = msg.charAt(0);
		char c2 = msg.charAt(6);
		
		
		System.out.println("msg 1번째 문자 :" + msg.charAt(0));  //0이니까 첫번째 문자 H를 말한다
		System.out.println("msg 7번째 문자 :" + msg.charAt(6)); //순서번호, 괄호안은 index번호 
		
		
		//문자열 자르기
		String sub1 = msg.substring(0, 5);  //0부터 5까진데  5까지아니고 5(End) 바로 앞에서 자른다
		String sub2 = msg.substring(6); //index번호 6번부터 마지막까지
		
		System.out.println("sub1 : " + sub1 );
		System.out.println("sub2 : " + sub2 );
		
 		//문자열 인덱스
		int idx1 = msg.indexOf("e"); //indexOf는 리턴값이 int니까 int로 받는다
		int idx2 = msg.lastIndexOf("e"); //last니까 뒤에서부터 찾는다
		
		System.out.println("idx1 : " + idx1);
		System.out.println("idx2 : " + idx2);
		
		//문자열 교체
		String rs1 = msg.replace("Korea", "Busan");
		String rs2 = msg.replace("Hello", "Welcome");
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		
		
		//문자열 변환
		int var1 = 1;
		double var2 = 3.14;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);  //3.14에 "를 넣었다고 생각하면 된다
		String s2 = String.valueOf(var2); //이것도 귀찮아서 암묵적으로 ""+var3
		String s3 = "" + var3; //빈문자열 추가  설명다시 듣기이게 언제 쓰이는건지
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		
}
}
