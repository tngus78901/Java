package sub1;
/*
 * DATE : 3rd,JULY
 * Name : Justina
 * Content : to practice Java Thread 스레드  병행실행
 * 
 * 스레드(Thread)
 * - 하나의 프로세스 안에서 실행되는 프로그램 실행흐름
 * - 스레드는 동시에 실행되는 병행 실행
 * - Thread 클래스를 상속 받아 start 실행
 */

public class ThreadTest {
	
	public static void main(String[] args) {
	
		//스레드 객체 생성
		SubThread st1 = new SubThread("Sub1");
		SubThread st2 = new SubThread("Sub2");
		
		//자식스레드로 실행
		st1.start();
		st2.start();   //run말고 start로 스레드를 실행해야한다,여기서 2번쨰 스레드가 실행되고 10번진행된다 1,2 각 10번씩 동시에 실행
						//밑에 for문과 subthread에 for문 이
		for(int i=0; i<10; i++) {
			
			
			
			try {
				//1초 대기 
				Thread.sleep(1000);  //1000초 동안 재운다
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			
			
			System.out.println("Main Thread 실행...");
		}
		
		System.out.println("Main Thread 종료...");
	}
	

}
