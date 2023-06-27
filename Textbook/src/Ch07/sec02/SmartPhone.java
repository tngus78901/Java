package Ch07.sec02;


//286-287p
public class SmartPhone extends Phone {

	
	//Field declaration
	public boolean wifi;
	
	//Constructor declaration
	public SmartPhone(String model, String color) {
		this.model = model;
		this.color = color;
		
	}
	
	//Method declaration
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
}
