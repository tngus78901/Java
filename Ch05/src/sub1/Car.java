package sub1;

/*
 * Date : 19.June.2023
 * Name : Justina
 */
//Car 클래스 정의

public class Car {
	
	//필드(field  속성과 기능으로 설계하여 추상화한다)변수를 선언한다
	String name;
	String color;
	int speed;
	
	//method 기능
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
		
	}
	
	public void show() {
		
		
		System.out.println("차량명 : "+ this.name );
		System.out.println("차량색 : "+ this.color );
		System.out.println("현재속도 : "+ this.speed );
	}
	
	}

