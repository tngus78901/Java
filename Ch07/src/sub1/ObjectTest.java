package sub1;
/*
 * Date : 27th,June
 * Name : Justina
 * Content : to practice object class 
 * 
 * Object class
 * - 자바의 최상의 클래스로 모든 클래스는 Object를 암시적으로 상속 받음
 * - 주요기능은 개체 비교를 위한 equals(), 객체 정보 조회는 위한 toString() 제공
 */
public class ObjectTest {
	public static void main(String[] args) {
		
		
		//Object type으로 다형성적용
		Object a1 = new Apple("한국",3000);
		Object a2 = new Apple("일본",2000);
		
		
		//toString() :객체의 정보조회
		System.out.println(a1);
		a2.toString();
		
		//객체 비교
		if(a1 == a2) {
			System.out.println("a1, a2 주소가 같다.");
		}else {
			System.out.println("a1, a2 주소가 다르다.");
		}
		
		if(a1.equals(a2)) { //equals = object기능
			System.out.println("a1, a2 가리키는 객체가 같다.");
		}else {
			System.out.println("a1, a2 가리키는 객체가 다르다.");
		}
	}
	
	
}
