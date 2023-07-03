package sub4;
/*
 * DATE : 3rd,JULY
 * Name : Justina
 * Content : to practice Java DaemonThread 
 * 
 * 데몬스레드(Daemon Thread)
 * -메인스레드를 보조하는 보조스레드
 * -메인스레드가 종료되면 데몬스레드도 같이 종료
 * textbook 14장
 */


public class DaemonThreadTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		SubThread st = new SubThread();
		st.setDaemon(true);  //데몬스레드 설정
		
		st.start();
		
		
		for(int i=1; i<=10; i++) {
			
			Thread.sleep(1000);
				
			
			System.out.println("MainThread... ");
		}
		
		
		System.out.println("프로그램 종료...");  //subthread는 자식스레드.종료되지않는다 좀비스레드 
												//부모가 종료되면 자식도 종료되게하는것을 데몬
	}

}
