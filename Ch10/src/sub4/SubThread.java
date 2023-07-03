package sub4;
/*
 * DATE : 3rd,JULY
 * Name : Justina
 * Content : to practice Java Thread 활용
 * 
 * 
 */


public class SubThread extends Thread{
	
	@Override
	public void run() {
		
		while(true) {  //true니까 무한반복
			
			try {
				Thread.sleep(1000);  //1000은 1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Sub Thread 실행...");
		}
		
		
	}

}
