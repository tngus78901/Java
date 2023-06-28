package sub2;

import java.util.Stack;

/*
 * Date : 28th,June
 * Name : Justina
 * Content : java 자료구조 스택 실습하기
 * 
 * 스택(Stack)
 * - 스택은 데이터가 순서대로 쌓이는 자료구조(LIFI : 후입선출)
 * - 변수 선언과 메서드 실행에 사용
 */


public class StackTest {

		public static void main(String[] args) {
			
			Stack<Integer> stack = new Stack<> ();  //E 원소 element
			
			stack.push(1);
			stack.push(2);
			stack.push(3);
			stack.push(4);
			stack.push(5);
			
			//System.out.println("stack pop : " + stack.pop());   //pop은 꺼내는 것
			//System.out.println("stack pop : " + stack.pop());  
			//System.out.println("stack pop : " + stack.pop());   
			//System.out.println("stack pop : " + stack.pop());   
			//System.out.println("stack pop : " + stack.pop());  
			
			while(!stack.empty()) {  //stack이 비어있지않으면.데이터가 있다면
				System.out.println("stack pop : "+ stack.pop());
			}
			
		}
}
