package sub2;
/*
 * Date : 26th,June
 * Name : Justina
 * Content : to practice StringBuilder class
 * 
 * String class
 * - String 문자열을 처리하는 클래스
 * - 문자열 비교는 equals, 다양한 문자열 가공 메서드 제공
 * - String 클래스의 immutable 특성으로 인한 성능을 개선하기 위해 StringBuilder 사용
 * 대용량의 문자열을 가공할 때 StringBuilder쓴다
 */

public class StringBuilderTest {
	
	public static void main(String[] args) {
		
		
	//String immutable특성
	String str = "Java" ;
	System.out.println("str 객체 주소 : " + System.identityHashCode(str));
	
	str += "Programming";
	System.out.println("str 객체 주소 : " + System.identityHashCode(str));
	
	
	//String의 immutable 특성을 개선한 StringBuilder
	StringBuilder sb = new StringBuilder("Java");
	System.out.println("sb 객체 주소 : " + System.identityHashCode(sb));
	
	sb.append("Programming");
	System.out.println("sb 객체 주소 : " + System.identityHashCode(sb));
	
	
	}

}