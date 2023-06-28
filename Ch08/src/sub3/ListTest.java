package sub3;

import java.applet.AppletStub;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



/*
 * Date : 28th,June
 * Name : Justina
 * Content : java 자료구조 리스트 실습하기
 * 
 * List
 * - 배열과 유사하지만 동적으로 생성되는 선형 자료구조
 * - List를 구현한 ArrayList
 * - 데이터 중복가능
 */


public class ListTest {
	
	
	public static void main(String[] args) {
	
	
		//List 생성
		List<Integer> list = new ArrayList<Integer>() ;

		
		
				
		//데이터입력
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		
		//데이터 삽입
		list.add(1,6);  //1번 index에 6으로 원래 있던거 사이에 삽입
		System.out.println(list);
		
		//데이터 제거
		list.remove(2);  //2번 index의 원소를 제거해라
		System.out.println(list);
		
		//데이터 출력
		System.out.println("list 1번째 원소 : " + list.get(0));
		System.out.println("list 2번째 원소 : " + list.get(1));
		System.out.println("list 4번째 원소 : " + list.get(3));
		
		
		//리스트 크기
		System.out.println("list 크기 : " + list.size());
		
		//리스트 반복문
		for(int num : list) {  // Auto-unboxing 처리
			System.out.println(num);
			
		}
		
		
		//문자열 리스트
		List<String> people = new ArrayList<>() ;
		
		people.add("김유신");
		people.add("김춘추");
		people.add("장보고");
		people.add("강감찬");
		people.add("이순신");

		
		System.out.println(people);
		
		
		
		
		//객체 리스트  자바에서는 객체를 반드시 이해해야한다 클래스:객체  클래스의 속성을 갖는 자료구조 : 클래스
		List<Apple> apples = new ArrayList<>();
		
		Apple a1 = new Apple("한국", 3000);
		Apple a2 = new Apple("미국", 2000);
		
		apples.add(a1);
		apples.add(a2);
		apples.add(new Apple("일본", 1000));
		
		
		Apple apple	= apples.get(0);
		apple.show();
		
		
		apples.get(1).show() ;  //체이닝 
		apples.get(2).show();
		
		

	
				
	}	

	}

