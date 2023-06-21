package sub5;

public class Sedan extends Car {
	
	private int cc;  //cc배기량
	
	
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);
		this.cc = cc;
	}
	
	public void speedTurbo() {  
		//private에서 protected로 접근권한 변경에서 자식클래스 참조
		//private(부모) 내부 sedan은 외부라 바로 못씀 protected로 바꿔줘야함
		this.speed += 20;
	}
	
	public void show() {
		
		super.show(); //super는 부모 클래스를 지칭함 ㅏ
		System.out.println("배기량 :  " + this.cc);
}
}

