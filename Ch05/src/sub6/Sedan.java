package sub6;

/*
 * Date : 21st,June,2023
 * Name : Justina
 * Content :
 * 
 */
 

public class Sedan extends Car {

	
	
	private int cc;
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);
		this.cc = cc;
	}
	
	public void speedTurbo() {
		
		this.speed += 20;
	}
	
	public void show() {
		
		super.show();
		System.out.println("배기량 : " + this.cc);
	}
}
