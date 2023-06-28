package sub2;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Date : 28th,June
 * Name : Justina
 * Content : java 자료구조 스택 실습하기
 * 
 * 큐(Queue)
 * - 큐는 데이터가 차례대로 쌓이는 자료구조(FIFO : 선입선출) first in first out
 * - 이벤트, 애니메이션 실행에 사용
 * 
 */

public class QueueTest {
	public static void main(String[] args) {
		
		
		Queue<Integer> queue = new LinkedList<> ();
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		
		
		while(queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		
	}

}
