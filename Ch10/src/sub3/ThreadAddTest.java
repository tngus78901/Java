package sub3;
/*
 * DATE : 3rd,JULY
 * Name : Justina
 * Content : to practice Java Thread 활용
 */

public class ThreadAddTest {
	public static void main(String[] args) throws InterruptedException {
		
		
		//Runnable 인터페이스 구현클래스
		AddThread at1 = new AddThread(1,50);
		AddThread at2 = new AddThread(51,100);
		
		
		//Runnable 구현클래스를 Thread 객체로 생성
		Thread t1 = new Thread(at1);
		Thread t2 = new Thread(at2);
		
		//스레드 실행
		t1.start();
		t2.start();
		
		//스레드 대기(다른 스레드 종료를 대기)
		t1.join();
		t2.join();
		
		
		int tot1 = at1.getNum();
		int tot2 = at2.getNum();
		
		
		int total = tot1 + tot2;
		System.out.println("total : " + total);
		
		
		
	}

}
