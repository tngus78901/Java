package sub3;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * Date : 6th,July
 * Name : Justina
 * Content : 소켓 프로그래밍 실습하기, 실무에서는 소켓 프로그래밍 할 일 없다
 */

public class ChatClient {

	public static void main(String[] args) {
		
		System.out.println("[Client]");
		
		Socket socket = null;
		
		try {
			socket = new Socket("127.0.0.1", 9001);
			
			
			Thread t1 = new ThreadSender(socket);
			Thread t2 = new ThreadReceiver(socket);
			
			t1.start();
			t2.start();
					
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
