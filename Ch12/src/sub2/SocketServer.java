package sub2;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Date : 6th,July
 * Name : Justina
 * Content : 소켓 프로그래밍 실습하기, 실무에서는 소켓 프로그래밍 할 일 없다
 */

public class SocketServer {
	public static void main(String[] args) {
		
		
			System.out.println("[Server]");
			
			ServerSocket serverSocket = null;
			
			try {
					serverSocket = new ServerSocket();
					serverSocket.bind(new InetSocketAddress("127.0.0.1", 5001));
					
					System.out.println("연결 대기...");
					Socket socket = serverSocket.accept();
					
					System.out.println("연결 수립...");
					
					//데이터 송신(Server -> Client)
					OutputStream os = socket.getOutputStream();
					String msg = "Hello Client!";
					
					byte[] msgBytes = msg.getBytes();
					os.write(msgBytes);
					os.flush();
					
					System.out.println("데이터 송신 완료...");
					
					//데이터 수신(Client -> Server)
					InputStream is = socket.getInputStream();
					byte[] bytes = new byte[100];
					int readBytes = is.read(bytes);
					
					String result = new String(bytes, 0, readBytes, "UTP-8");
					System.out.println(result);
					
					System.out.println("데이터 수신 완료...");
					
					os.close();
					is.close();
					socket.close();
					
				
			} catch (IOException e) {
					e.printStackTrace();				
			}
		
			if(!serverSocket.isClosed()) {
					try {
						serverSocket.close();
					} catch (IOException e) {			
						e.printStackTrace();
					}
			}
			
			System.out.println("Server 종료...");
	}
}