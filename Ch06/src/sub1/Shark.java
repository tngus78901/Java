package sub1;
/*
 * Date : 22nd,June,2023
 * Name : Justina
 * Content : Java 다형성 실습하기
 */


public class Shark extends Animal {
	@Override
	public void move() {
		System.out.println("Shark swim...");
	}
	@Override
	public void hunt() {
		System.out.println("Shark hunt...");
	}
}
