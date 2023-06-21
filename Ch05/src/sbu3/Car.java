package sbu3;
/*
 * Date : 20.06.2023
 * Name : Justina
 * Content : 클래스 변수, 클래스 메서드 실습하기
 
 */

public class Car {

	//필드(속성)
	private String name;
	private String color;
	private int speed;
	
	//클래스 변수(정적변수)
	public static int count;  //static은 public선언이 일반적이다  method area라고 하는 영역에 저장된다
	
	// 생성자 : 캡슐화된 속성을 초기화하기 위한 메서드
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		
		count++;
		
	}
	//클래스 메서드(정적메서드)
	public static int getCount () {
		return count;
	}
	

	//메서드(기능)
	public void speedUp (int speed) {
		this.speed += speed;//무조건 instance로 호출햐ㅐ야한다
	}

	
	public void speedDown(int speed) {
		
		this.speed-= speed;
	}



	public void show() {
		
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : "+ this.color);
		System.out.println("현재속도 :" + this.speed);
		
		
		
		
	}
}




