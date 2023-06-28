package sub1;
/*
 * Date : 28th,June
 * Name : Justina
 * Content : to practice Generic
 * 
 * 제네릭(Generic)
 * - 클래스 내부의 속성 타입을 동적으로 일반화 시키는 문법
 * - 제네릭 사용으로 클래스를 범용성있게 사용
 */

public class GenericTest {

	public static void main(String[] args) {
		
		
		Apple a = new Apple("한국" ,3000);
		Banana b = new Banana("일본", 2000);
		
		
		FruitBox<Apple> appleBox = new FruitBox<> ();  //<>뒤에는 생략가능 안에 글자는 앞에만 적으면 된다
		appleBox.setFruit(a);
		System.out.println(appleBox.getFruit());
		
		
		

		FruitBox<Banana> bananaBox = new FruitBox<> ();
		bananaBox.setFruit(b);
		System.out.println(bananaBox.getFruit());
	}
}
